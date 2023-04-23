package com.dabel.apirestwithpaging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dabel.apirestwithpaging.app.AppConstants;
import com.dabel.apirestwithpaging.model.Employee;
import com.dabel.apirestwithpaging.service.EmployeeService;

/**
 * Rest controller class to map HTTP verbs
 * 
 * @author ABDEL-NASSER BEN ALI
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmployees(
				@RequestParam(value = "page", defaultValue = AppConstants.PAGE_INDEX, required = false) int pageIndex,
				@RequestParam(value = "size", defaultValue = AppConstants.PAGE_SIZE, required = false) int pageSize,
				@RequestParam(value = "sort", defaultValue = AppConstants.SORT_BY, required = false) String sort,
				@RequestParam(value = "dir", defaultValue = AppConstants.SORT_DIR, required = false) String dir) {
		
		List<Employee> employees = employeeService.findAll(pageIndex, pageSize, sort, dir);
		
		if(!employees.iterator().hasNext())
			return ResponseEntity.noContent().build();
		
		return ResponseEntity.ok(employees);
	}
	
	
}
