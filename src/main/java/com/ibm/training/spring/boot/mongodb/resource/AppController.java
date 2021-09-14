package com.ibm.training.spring.boot.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.spring.boot.mongodb.domain.Students;
import com.ibm.training.spring.boot.mongodb.service.StudentService;

@RestController
public class AppController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping(value="/students", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Students> getStudents(){
		return service.fetchAllStudents();
	}

}
