package com.spring.student.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.student.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentRequest {

	@Autowired
	private Student student;
}
