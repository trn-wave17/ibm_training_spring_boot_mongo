package com.ibm.training.spring.boot.mongodb.respository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.training.spring.boot.mongodb.domain.Students;


public interface StudentsRepository extends MongoRepository<Students, String> {
	
	List<Students> findByEmail(String email);
	
}
