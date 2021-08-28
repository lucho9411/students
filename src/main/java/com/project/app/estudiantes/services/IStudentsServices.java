package com.project.app.estudiantes.services;

import com.project.app.estudiantes.dto.rp.StudentsDto;

public interface IStudentsServices {
	
	public String getAllStudents();
	
	public String deleteStudent(Long id);
	
	public String editStudent(StudentsDto studentDto);

}
