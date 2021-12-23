package com.spring.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.student.dto.StudentResponse;
import com.spring.student.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("SELECT new com.spring.student.dto.StudentResponse( s.firstName, s.lastName, p.projectName) From Student s JOIN s.projects p")
	public List<StudentResponse> getInformation();
	
}
