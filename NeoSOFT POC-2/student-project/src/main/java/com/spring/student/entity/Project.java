package com.spring.student.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Project {
	
	@Id
	private int pid;
	
	@NotNull(message="{projectName}")
	@NotNull(message = "Enter project name")
	private String projectName;
	
	@NotNull(message="{durationInMonths}")
	@NotNull(message = "Enter project duration")
	private int durationInMonths;
	
	
}
