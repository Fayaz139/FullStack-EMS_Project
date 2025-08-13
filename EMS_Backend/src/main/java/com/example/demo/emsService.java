package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class emsService {
	
	private final emsRepository repo;
	
	@Autowired
	public emsService(emsRepository repo) {
		// TODO Auto-generated constructor stub
		this.repo = repo;
	}
	
	List<emsEmployee> getAllEmployees() {
		return repo.findAll();
	}
	
	emsEmployee getEmployee(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public emsEmployee save(emsEmployee emp) {
		return repo.save(emp);
		//ems Employee ref = repo.save(emp);
		//return ref;
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}

















