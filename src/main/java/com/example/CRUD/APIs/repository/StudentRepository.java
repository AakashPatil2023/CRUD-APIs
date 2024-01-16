package com.example.CRUD.APIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUD.APIs.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
