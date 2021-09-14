package com.ibm.training.spring.boot.mongodb.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection  = "students")
public class Students implements Serializable {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	
	@Indexed(unique = true)
	private String email;
	
	//private Gender gender;
	private String gender;
	private List<String> subjects;
	private Integer totalSpentInBooks;
	public Students(String firstName, String lastName, String email, String gender, List<String> subjects,
			Integer totalSpentInBooks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.subjects = subjects;
		this.totalSpentInBooks = totalSpentInBooks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Integer getTotalSpentInBooks() {
		return totalSpentInBooks;
	}
	public void setTotalSpentInBooks(Integer totalSpentInBooks) {
		this.totalSpentInBooks = totalSpentInBooks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", gender=" + gender + ", subjects=" + subjects + ", totalSpentInBooks=" + totalSpentInBooks + "]";
	}
	
	
	
	
	

}
