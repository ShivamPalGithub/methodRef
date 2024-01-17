package com.example.crud.service;

import java.util.List;

import com.example.crud.entity.Student;

public interface StudentService {

 public	Student add(Student student);

 public	List<Student> get();
 public Student findById(Long id);
 public Student update(Student student, Long id);

}
