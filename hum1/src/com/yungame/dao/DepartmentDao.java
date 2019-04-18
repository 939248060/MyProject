package com.yungame.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.yungame.bean.department;

public class DepartmentDao extends HibernateDaoSupport{
    private Session session = null;
	//得到所有部门信息
	public List<department> getDep(){
		String hql="from department";
		List<department> deps=this.getHibernateTemplate().find(hql);
		if(deps!=null&&deps.size()>0){
			return deps;
		}else{
			return null;
		}
	}
	//得到一个部门信息
	public department getOneDep(Integer id){
		String hql="from department where id="+id;
		department dt=new department();
		List<department> deps=this.getHibernateTemplate().find(hql);
		if(deps!=null&&deps.size()>0){
			dt=deps.get(0);
		}
		return dt;
	}
	//修改保存后的部门
	public void SavaDep(department depart){
		//this.getHibernateTemplate().update(depart);
	    String hql = String.format("update department t set t.departmentname = '%s',t.adderss = '%s',t.manager='%s' where id = %d", depart.getDepartmentname(),depart.getAdderss(),depart.getManager(),depart.getId());
	    session = this.getSession();
	    Query query = session.createQuery(hql);
			query.executeUpdate();
	}
	//增加一个部门
	public void AddDep(department depart){
		this.getHibernateTemplate().save(depart);
	}
	//删除一个部门
	public void DeleteDep(department depart){
		this.getHibernateTemplate().delete(depart);
	}
}
