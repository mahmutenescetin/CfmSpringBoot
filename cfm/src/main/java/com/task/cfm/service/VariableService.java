package com.task.cfm.service;

import java.util.List;

import com.task.cfm.model.Variable;

public interface VariableService {
	List<Variable> get();

	Variable get(int id);

	void save(Variable variable);

	void delete(int id);
}
