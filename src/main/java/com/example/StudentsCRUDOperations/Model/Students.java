package com.example.StudentsCRUDOperations.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String surname;
	private String name;
	private String course;
	private Integer fees;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(Integer id, String surname, String name, String course, Integer fees) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

}
