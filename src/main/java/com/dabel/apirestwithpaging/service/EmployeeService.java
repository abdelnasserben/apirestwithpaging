package com.dabel.apirestwithpaging.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dabel.apirestwithpaging.model.Employee;
import com.dabel.apirestwithpaging.repository.EmployeeRepository;

/**
 * Class to apply the business and management 
 * rules of the application
 * 
 * @author ABDEL-NASSER BEN ALI
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAll(int pageIndex, int pageSize, String sortBy, String sortDir) {
		
		Sort pageSort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
		
		PageRequest pageRequest = PageRequest.of(pageIndex, pageSize, pageSort);
		
		Page<Employee> page = employeeRepository.findAll(pageRequest);
		
		return page.getContent();
	}
	
	
}
