package com.project.app.estudiantes.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.estudiantes.models.Students;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

}
