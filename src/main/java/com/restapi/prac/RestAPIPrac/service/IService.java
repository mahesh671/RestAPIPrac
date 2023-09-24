package com.restapi.prac.RestAPIPrac.service;

import java.util.List;

public interface IService<T> {
	
	public List<T> getAll();
	public T getById(int id);
	public T save(T obj);
	public T update (T obj);
	boolean deleteById(Integer id);
	
	

}
