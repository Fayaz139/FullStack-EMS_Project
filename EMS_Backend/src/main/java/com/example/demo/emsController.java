package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class emsController {

	private final emsService ref;

	@Autowired
	public emsController(emsService ref) {
	    this.ref = ref; // Spring will pass the service bean here
	}
	
	@GetMapping("/getallemployees")
	public List<emsEmployee> getAllEmployees() {
		return ref.getAllEmployees();
	}
	
	@GetMapping("/getemployee") 
	public emsEmployee getEmployeeById(@RequestParam("id") int id) {
		return ref.getEmployee(id);
	}
	
	@PostMapping("/addEmployee")
	public emsEmployee insertOrUpdateEmployee(@RequestBody emsEmployee e) {
		return ref.save(e);
	}
	
	
	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("id") int id) {
		ref.delete(id);
		return "Deleted Successfully";
	}
}
