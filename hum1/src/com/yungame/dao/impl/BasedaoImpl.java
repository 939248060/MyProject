package com.yungame.dao.impl;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BasedaoImpl<T> extends HibernateDaoSupport{
	
	private Class<?> beanclass;
	

	public BasedaoImpl() {
		ParameterizedType paramtype  = (ParameterizedType) this.getClass().getGenericSuperclass();
		beanclass = (Class<?>) paramtype.getActualTypeArguments()[0];
	}

	
	public List<T> findall() {
		return (List<T>) this.getHibernateTemplate().find("from "+beanclass.getName());
	}

	
	public T findById(Serializable id) {
		return (T) this.getHibernateTemplate().get(beanclass, id);
	}
   
	public void delete(T t) {
		this.getHibernateTemplate().delete(t);
		
	}

	public void add(T t) {
		this.getHibernateTemplate().save(t);
		
	}


	public void update(T t) {
		this.getHibernateTemplate().update(t);
		
	}

}
