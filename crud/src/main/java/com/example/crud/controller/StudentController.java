package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService studentService;
	 @PostMapping("/create")
	public Student add(@RequestBody Student student) {
		return studentService.add(student);

	}
	 @GetMapping("/get")
	public List<Student> get() {
		return studentService.get();
	}
	 @GetMapping("/get/{id}")
		public Student getById(@PathVariable Long id) {
			return studentService.findById(id);
		}
	 
		@PutMapping("/{id}")
		public Student updateStudent(@RequestBody Student student, @PathVariable Long id) {

			return studentService.update(student, id);

		}
}
