package com.web.repo;



import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.web.entity.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer>{
	
}



