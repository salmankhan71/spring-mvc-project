package com.springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Employee;


@Repository
public class EmployeeDao {
	
     @Autowired
	private HibernateTemplate hibernateTemplate;
     
     @Transactional
	public int saveEmployee(Employee employee) {
		int id = (Integer) this.hibernateTemplate.save(employee);
		return id;
	}

	
}
