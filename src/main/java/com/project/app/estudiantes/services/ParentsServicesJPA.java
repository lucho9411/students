package com.project.app.estudiantes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.app.estudiantes.dto.rp.ParentsDto;
import com.project.app.estudiantes.models.Parents;
import com.project.app.estudiantes.models.Students;
import com.project.app.estudiantes.repositorys.ParentsRepository;

@Service
public class ParentsServicesJPA implements IParentsServices {
	
	@Autowired
	private ParentsRepository parentsRepo;

	@Override
	public List<ParentsDto> getParentsOfStudent(Students student) {
		try {
			List<Parents> listParents = parentsRepo.findByStudent(student);
			ArrayList<ParentsDto> listParentsDto =  new ArrayList<ParentsDto>();
			if(listParents==null) {
				return null;
			}
			else {
				for(Parents parent : listParents) {
					ParentsDto parentDto = new ParentsDto();
					parentDto.setId(parent.getId());
					parentDto.setIdentification(parent.getIdentification());
					parentDto.setFirstNames(parent.getNames());
					parentDto.setLastNames(parent.getLastNames());
					parentDto.setPhones(parent.getPhone());
					listParentsDto.add(parentDto);
				}
				return listParentsDto;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
