package com.spring.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.student.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}