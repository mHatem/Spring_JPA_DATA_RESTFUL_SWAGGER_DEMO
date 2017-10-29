package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("demo/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empServ;

	@ApiResponses(value = { @ApiResponse(code = 201, message = "Successful Created", response = Employee.class),
			@ApiResponse(code = 400, message = "Bad Request", response = Void.class) })
	@ApiOperation(value = "Add new Employee to mysql DB", response = String.class)
	@RequestMapping(value = "/createNewEmployee", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity createAlertLog(@RequestBody Employee emp) {
		empServ.addEmployee(emp);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Get All employees ", response = String.class)
	@ApiResponse(code = 201, message = "Successful selected", response = List.class)
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getAllEmployees(){
		return empServ.getAllEmployees();
	}

}
