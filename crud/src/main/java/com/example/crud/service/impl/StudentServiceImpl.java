package com.example.crud.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.crud.deo.StrudentDeo;
import com.example.crud.entity.Student;
import com.example.crud.exception.UserException;
import com.example.crud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StrudentDeo studentDeo;

	@Override
	public Student add(Student student) {
		// TODO Auto-generated method stub
		return studentDeo.save(student);
	}

	@Override
	public List<Student> get() {
		List<Student> student = studentDeo.findAll();
		if (student.isEmpty()) {
			throw new UserException(HttpStatus.NOT_FOUND, "Student is not found");
		}
		return student;
	}

	@Override
	public Student findById(Long id) {
		return studentDeo.findById(id)
				.orElseThrow(() -> new UserException(HttpStatus.NOT_FOUND, "Student with ID " + id + " not found"));
	}

	@Override
	public Student update(Student student, Long id) {
		Student students = studentDeo.findById(id).get();
		if (students == null) {
			throw new UserException(HttpStatus.NOT_FOUND, "Student is not found");

		} else {
			students.setEmpName(student.getEmpName());
			students.setCity(student.getCity());
			studentDeo.save(students);
		}
		return students;

	}
}
