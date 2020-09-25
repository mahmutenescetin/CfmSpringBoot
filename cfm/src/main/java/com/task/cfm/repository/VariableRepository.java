package com.task.cfm.repository;

import java.util.List;

import com.task.cfm.model.Variable;

public interface VariableRepository {
	List<Variable>get();
	
	Variable get(int id);
	
	void save(Variable variable);
	
	void delete(int id);
}
