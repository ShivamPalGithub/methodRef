package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String empName;
	private String city;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Student(Long empId, String empName, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
	}
	public Student() {
		super();
		
	}
}
