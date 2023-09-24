package com.restapi.prac.RestAPIPrac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.prac.RestAPIPrac.model.Employee;
import com.restapi.prac.RestAPIPrac.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements IService<Employee> {

	private EmployeeRepository empRepo;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}

	@Override
	public Employee save(Employee obj) {
		// TODO Auto-generated method stub
		return empRepo.saveAndFlush(obj);
	}

	@Override
	public Employee update(Employee obj) {
		// TODO Auto-generated method stub
		return empRepo.saveAndFlush(obj);
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		try {
		 empRepo.deleteById(id);
		 return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
