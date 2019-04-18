package com.yungame.dao;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yungame.bean.Spouse;


public class SpouseDao extends HibernateDaoSupport {

	//
	public int add(Spouse spouse) {
		this.getHibernateTemplate().save(spouse);
		return 0;
	}
	
	public Spouse getOneById(int sid) {
		String hql = "from Spouse WHERE SID = " + sid;
		return (Spouse) this.getHibernateTemplate().find(hql).get(0);
	}
	
	public List<Spouse> getAll(){
		String hql = "from Spouse";
		return this.getHibernateTemplate().find(hql);
	}
	
	public int deleteById(int sid) {
		String hql = "delete Spouse s where s.sid=?";
		return this.getSession().createQuery(hql).setInteger(0, sid).executeUpdate();
	}
}
