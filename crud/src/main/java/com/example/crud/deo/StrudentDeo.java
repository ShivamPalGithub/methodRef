package com.example.crud.deo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.entity.Student;

public interface StrudentDeo extends JpaRepository<Student, Long> {

	

}
