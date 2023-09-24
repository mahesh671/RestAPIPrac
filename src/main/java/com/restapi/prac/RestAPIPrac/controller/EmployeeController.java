package com.restapi.prac.RestAPIPrac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.prac.RestAPIPrac.model.Employee;
import com.restapi.prac.RestAPIPrac.service.EmployeeServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
public class EmployeeController {
	
	private EmployeeServiceImpl empServ;

	@Autowired
	public EmployeeController(EmployeeServiceImpl empServ) {
		super();
		this.empServ = empServ;
	}
	
	@GetMapping("/")
	public List<Employee> getAll()
	{
		List<Employee> employees=empServ.getAll();
		return employees;
	}
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return empServ.save(emp);
	}
	
	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return empServ.update(emp);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteEmployee(@PathVariable Integer  id)
	{
		return empServ.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer  id)
	{
		return empServ.getById(id);
	}
	
	
	
	

}
