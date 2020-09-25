package com.task.cfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.cfm.model.Variable;
import com.task.cfm.repository.VariableRepository;
@Service
public class VariableServiceImplement implements VariableService {
	@Autowired
	private VariableRepository variableRepository;
	@Transactional
	@Override
	public List<Variable> get() {
		return variableRepository.get();
	}
	@Transactional
	@Override
	public Variable get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Variable variable) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
