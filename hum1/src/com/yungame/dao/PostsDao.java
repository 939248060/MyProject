package com.yungame.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yungame.bean.Posts;
import com.yungame.bean.department;
import com.yungame.dao.impl.BasedaoImpl;

public class PostsDao  extends HibernateDaoSupport{

    Session session = null;
	public PostsDao() {
    	
    }
    //添加岗位
	public int add(Posts posts) {
		this.getHibernateTemplate().save(posts);
		return 0;
	}
    //通过部门来查找所属岗位
    public List<Posts> getDepPos(department dep){
    	String hql = "from Posts p where p.dept = ?";
    	return (List<Posts>)this.getHibernateTemplate().find(hql, dep);
    }
    //获取一个岗位
    public Posts getPosById(int id) {
    	String hql = "from Posts p where p.pid = ?";
    	return (Posts) this.getHibernateTemplate().find(hql, id).get(0);
    }
    //删除岗位
    public int deletePos(int id) {
    	String hql = "delete from Posts p where p.pid = "+id;
    	this.getSession().createQuery(hql).executeUpdate();
    	return 0;
    }
}
