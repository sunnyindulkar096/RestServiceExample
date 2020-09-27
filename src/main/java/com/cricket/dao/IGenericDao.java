package com.cricket.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends Serializable> {
	 
	   T findOne(final long id);
	 
	   List<T> findAll();
	 
	   T create(final T entity);
	 
	   T update(final T entity);
	 
	   void delete(final T entity);
	 
	   void deleteById(final long entityId);

	   void setClazz(Class<T> class1);
	   
	   int deleteQuery(String query,Long uuid);

	   int deleteQuery(String query,String uuids);
	   
	   int deleteSQLQuery(String query,String uuids);
}