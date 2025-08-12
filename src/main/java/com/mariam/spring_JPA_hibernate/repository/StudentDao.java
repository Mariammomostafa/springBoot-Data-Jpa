package com.mariam.spring_JPA_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariam.spring_JPA_hibernate.entity.Student;


public interface StudentDao extends JpaRepository<Student, Integer>{
	
	

}
