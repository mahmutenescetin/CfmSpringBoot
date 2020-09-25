package com.task.cfm.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.cfm.model.Variable;


@Repository
public class VariableRepositoryImplement implements VariableRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Variable> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Variable> query = currentSession.createQuery("FROM Variable ",Variable.class);
		List<Variable> list = query.getResultList();
		return list;
	}

	@Override
	public Variable get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Variable variable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
