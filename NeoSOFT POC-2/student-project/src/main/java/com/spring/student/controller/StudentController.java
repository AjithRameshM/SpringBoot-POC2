package com.spring.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.student.dto.StudentRequest;
import com.spring.student.dto.StudentResponse;
import com.spring.student.entity.Student;
import com.spring.student.exception.ExceptionHandling;
import com.spring.student.repository.ProjectRepository;
import com.spring.student.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ProjectRepository productRepository;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody StudentRequest request) {
	
		return studentRepository.save(request.getStudent());
	
	}
	
	@GetMapping("/getAll")
	public List<Student> findAll(){
		
		return studentRepository.findAll(); 
		
	}
	
	@GetMapping("/getInfo")
	public List<StudentResponse> getInformation(){
		
		return studentRepository.getInformation(); 
		
	}
	
	@GetMapping("student/{id}")
    public Optional<Student> findByStudentId(@PathVariable int id) {
		        return studentRepository.findById(id);
		           
    }
	
}
