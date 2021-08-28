package com.project.app.estudiantes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.estudiantes.dto.rp.StudentsDto;
import com.project.app.estudiantes.services.IStudentsServices;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/students")
public class StudentsController {
	
	@Autowired
	private IStudentsServices studentsServices;
	
	@GetMapping(value = "/getAll")
	public String getAllEstudiantes() {
		return studentsServices.getAllStudents();
	}
	
	@DeleteMapping(value = "/deleteById")
	public String deleteById(@RequestParam("id") Long id) {
		return studentsServices.deleteStudent(id);
	}
	
	@PutMapping(value = "/edit")
	public String edit(@RequestBody StudentsDto studentDto) {
		return studentsServices.editStudent(studentDto);
	}

}
