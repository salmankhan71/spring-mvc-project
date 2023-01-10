package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.EmployeeDao;
import com.springmvc.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	public int createEmployee(Employee employee) {
		return this.employeeDao.saveEmployee(employee);
	}

}
