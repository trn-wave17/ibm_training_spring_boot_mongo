package com.ibm.training.spring.boot.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.spring.boot.mongodb.domain.Students;
import com.ibm.training.spring.boot.mongodb.respository.StudentsRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentsRepository repository;
	
	public List<Students> fetchAllStudents(){
		return repository.findAll();
	}

}
