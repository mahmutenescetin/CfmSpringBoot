package com.task.cfm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.cfm.model.Variable;
import com.task.cfm.service.VariableService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class VariableController {
	
	@Autowired
	private VariableService variableService;

	@GetMapping("/variable")
	public List<Variable> get() {
		return variableService.get();
	}

}
