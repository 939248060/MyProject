package com.yungame.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yungame.bean.department;
import com.yungame.bean.employee;
public class EmloyeeDao  extends HibernateDaoSupport{

	//查看所有员工信息
	public List<employee> getEmp(){
		String hql="from employee";
		List<employee> emps=this.getHibernateTemplate().find(hql);
		if(emps!=null&&emps.size()>0){
			return emps;
		}else{
			return null;
		}
	}
	
	//获取一个员工的的信息
	public employee getOneEmp(Integer id){
		String hql="from employee where id="+id;
		employee el=new employee();
		List<employee> deps=this.getHibernateTemplate().find(hql);
		if(deps!=null&&deps.size()>0){
			el=deps.get(0);
		}
		return el;
	}
	//保存一个修改员工信息
	public void SavaEmp(employee emp){
	    Session session = this.getSession();
	    Query query = session.createQuery("update employee e set e.eid=:eid,e.name=:name,e.dept=:dept,e.sex=:sex,e.age=:age,e.posts=:posts where e.id =:id");
	    query.setString("eid", emp.getEid());
	    query.setString("name", emp.getName());
	    query.setEntity("dept", emp.getDept());
	    query.setEntity("posts", emp.getPosts());
	    query.setString("sex", emp.getSex());
	    query.setInteger("age", emp.getAge());
	    query.setInteger("id", emp.getId());
	    query.executeUpdate();
		
	}
	//更新一个员工信息
	public void updateEmp(employee emp) {
		this.getHibernateTemplate().update(emp);
	}
	//删除一个员工
	public void DeleteEmp(employee emp){
		this.getHibernateTemplate().delete(emp);
	}
	//添加一个员工信息
	public void AddEmp(employee emp){
		this.getHibernateTemplate().save(emp);
	}
}
