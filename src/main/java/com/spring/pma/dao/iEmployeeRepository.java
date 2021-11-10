package com.spring.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.pma.entity.Employee;
import com.spring.pma.entity.Project;

public interface iEmployeeRepository extends CrudRepository<Employee, Long> {
	@Override
	public List<Employee> findAll();
}
