package com.psl.springbootexceptionexample.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.springbootexceptionexample.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("/home")
	public String name() {
		return "home";
		
	}
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathParam("employeeId") Integer id ) {
		Employee e=new Employee(1, "chunchun", "Kumar", "chunchun@gmail.com");
		return new ResponseEntity<>(e, HttpStatus.FOUND);
		
	}

}
