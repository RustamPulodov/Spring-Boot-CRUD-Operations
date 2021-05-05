package com.example.StudentsCRUDOperations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentsCRUDOperations.Model.Students;
import com.example.StudentsCRUDOperations.Repository.StudentsRepository;

@Service
public class StudentsService {
	
	@Autowired
	private StudentsRepository repo;
	
	//Gett all entity from students table database
	public List<Students> listAll(){
		return repo.findAll();
	}
	
	//Get entity by id from students table database
	public Students get(Integer id) {
		return repo.findById(id).get();
	}
	
	//Save entity into students table database
	public void save(Students student) {
		repo.save(student);
	}
	
	//Delete entity by id from students table database
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
