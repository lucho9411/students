package com.project.app.estudiantes.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.project.app.estudiantes.dto.rp.StudentsDto;
import com.project.app.estudiantes.generalCover.MessageCover;
import com.project.app.estudiantes.models.Students;
import com.project.app.estudiantes.repositorys.StudentsRepository;

@Service
public class StudentsServciesJPA implements IStudentsServices {
	
	@Autowired
	private StudentsRepository studentsRepo;
	@Autowired
	private IParentsServices parentsService;

	@Override
	public String getAllStudents() {
		String json1 = null, json2 = null;
		MessageCover MC = null;
		List<Students> listStudents = null;
		try {
			listStudents = studentsRepo.findAll();
			if(listStudents==null||listStudents.isEmpty()) {
				MC = new MessageCover(404);
				json1 = new Gson().toJson(MC);
				json2 = new Gson().toJson(null);
			}
			else {
				ArrayList<StudentsDto> listStudentsDto = new ArrayList<StudentsDto>();
				for(Students student : listStudents) {
					StudentsDto studentDto = new StudentsDto();
					studentDto.setId(student.getId());
					studentDto.setIdentification(student.getIdentification());
					studentDto.setFirstNames(student.getNames());
					studentDto.setLastNames(student.getLastNames());
					studentDto.setPhones(student.getPhone());
					studentDto.setAddress(student.getAddress());
					studentDto.setEmail(student.getEmail());
					studentDto.setImage(student.getImage());
					studentDto.setParents(parentsService.getParentsOfStudent(student));
					listStudentsDto.add(studentDto);
				}
				MC = new MessageCover(200);
				json1 = new Gson().toJson(MC);
				json2 = new Gson().toJson(listStudentsDto);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			MC = new MessageCover(500);
			json1 = new Gson().toJson(MC);
			json2 = new Gson().toJson(listStudents);
		}
		return "[" + json1 + "," + json2 + "]";
	}

	@Override
	public String deleteStudent(Long id) {
		String json1 = null;
		MessageCover MC = null;
		Students student = null;
		try {
			if(!studentsRepo.existsById(id)) {
				MC = new MessageCover(404);
				json1 = new Gson().toJson(MC);
			}
			else {
				student = studentsRepo.findById(id).get();
				studentsRepo.delete(student);
				MC = new MessageCover(200);
				json1 = new Gson().toJson(MC);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			MC = new MessageCover(500);
			json1 = new Gson().toJson(MC);
		}
		return "[" + json1 + "]";
	}

}
