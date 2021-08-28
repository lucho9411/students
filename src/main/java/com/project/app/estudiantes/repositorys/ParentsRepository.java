package com.project.app.estudiantes.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.estudiantes.models.Parents;
import com.project.app.estudiantes.models.Students;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Long> {
	
	public List<Parents> findByStudent(Students student);

}
