package com.spring.student.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {

	@Id
	@GeneratedValue
	private int sid;
	
	@NotNull(message = "{firstName}")
	@NotNull(message = "Enter your first name")
	private String firstName;
	
	@NotNull(message = "{lastName}")
	@NotNull(message = "Enter your last name")
	private String lastName;
	
	@NotNull(message = "{emailId}")
	@NotNull(message = "Enter your email")
	@Email(message = "{email}")
	@Column(unique = true)
	private String emailId;
	
	@NotNull(message = "{mobileNo}")
	@Size(min=10,  message = "Enter correct mobile number")
	@Size(max=10)
	@Column(unique = true)
	private String mobileNo;
	
	@OneToMany(targetEntity = Project.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "sp_fk", referencedColumnName = "sid")
	private List<Project> projects;
	
}
