package com.test.quiz.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.test.quiz.domain.Entity;

public interface EntityDAO<T extends Entity> {
	
	 public abstract int save(T entity) throws SQLException;

	    public abstract ArrayList<T> findAll();

	    public abstract T findById(Integer id);

	    public abstract void update(T entity);

	    public abstract void delete(Integer id);

}
