package com.example.StudentsCRUDOperations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentsCRUDOperations.Model.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
