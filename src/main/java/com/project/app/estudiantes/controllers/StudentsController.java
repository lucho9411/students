package com.project.app.estudiantes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
	

}
