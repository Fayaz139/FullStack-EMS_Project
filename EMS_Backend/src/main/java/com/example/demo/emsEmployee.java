package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ems_employee")
public class emsEmployee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;

@Column
String name;

@Column
int salary;

@Column
int deptid;

public emsEmployee() {
	// TODO Auto-generated constructor stub
}

public emsEmployee(String name, int salary, int deptid) {
	super();
	this.name = name;
	this.salary = salary;
	this.deptid = deptid;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public int getDeptid() {
	return deptid;
}

public void setDeptid(int deptid) {
	this.deptid = deptid;
}

}
