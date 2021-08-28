package com.project.app.estudiantes.services;

import java.util.List;

import com.project.app.estudiantes.dto.rp.ParentsDto;
import com.project.app.estudiantes.models.Students;

public interface IParentsServices {
	
	public List<ParentsDto> getParentsOfStudent(Students student);

}
