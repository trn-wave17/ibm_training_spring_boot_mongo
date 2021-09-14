package com.ibm.training.spring.boot.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.ibm.training.spring.boot.mongodb.domain.Gender;
import com.ibm.training.spring.boot.mongodb.domain.Students;
import com.ibm.training.spring.boot.mongodb.respository.StudentsRepository;

@SpringBootApplication
public class Bootstrap implements CommandLineRunner {
	
	@Autowired
	private StudentsRepository repository;
	
	@Autowired
	private MongoTemplate template;
	
	public static void main(String args[]) {
		SpringApplication.run(Bootstrap.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*List<Students> students = repository.findByEmail("divyansh@gmail.com");
		System.out.println(students.get(0));*/
		Query query = new Query(Criteria.where("lastName").is("Verma").and("gender").is("F"));
		List<Students> students = template.find(query, Students.class);
		Students student = students.get(0);
		//student.setLastName("Verma");
		//repository.save(student);
		repository.delete(student);
		/*List<Students> students = template.find(query, Students.class);
		System.out.println(students.get(0));
		long count = template.count(query, Students.class);
		System.out.println(count);*/
	}


}