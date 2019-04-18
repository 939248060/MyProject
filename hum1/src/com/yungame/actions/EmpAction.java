package com.yungame.actions;


import java.util.Date;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yungame.bean.Education;
import com.yungame.bean.Posts;
import com.yungame.bean.department;
import com.yungame.bean.employee;
import com.yungame.service.EmpService;
import com.yungame.service.PostsService;

public class EmpAction extends ActionSupport {
    
	//id
	private String id;
	//修改员工返回的部门id
	private String did;
	//返回岗位id
	private String pid;
	
	private employee ep=new employee();
	
	//学历信息
	private Education education = new Education();
	
	private List<department> alldep;
	private EmpService empService;
	private PostsService posService;
    private List<employee> Emplist;
    
    private String posList = "";
    
    
    
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public void setPosService(PostsService posService) {
		this.posService = posService;
	}
	public String getPosList() {
		return posList;
	}
	public void setPosList(String posList) {
		this.posList = posList;
	}
	List<Posts> list = null;
    
   
	//查询所有的员工信息
	public String ShowEmp(){
		Emplist=empService.getEmp();
			return "ShowEmp";
		}
	//编辑一个员工信息
	public String EditEmp(){
		if(id!=null){
			int ids=Integer.parseInt(id);
			ep=empService.getOneEmp(ids);
			alldep=empService.getAllDep();
			if(ep.getDept()!=null){
				did=ep.getDept().getId().toString(); 
			}else{
				
			}			
			return "EditEmp";
		}else{
			return LOGIN;
		}				
	}
	//保存修改员工信息
	public String SavaEditEmp(){
		department dt=empService.getOneDep(Integer.parseInt(did));
		Posts pos = posService.getOnePos(Integer.parseInt(pid));
		ep.setDept(dt);
		ep.setPosts(pos);
		empService.SavaEmp(ep);
		return SUCCESS;
	}
	//增加一个员工信息
	public String AddEmp(){			
			alldep=empService.getAllDep();
			return "AddEmp";	
	}
	//保存添加的员工
	public String SavaAddEmp(){
		if(did!=null){
			department dt = empService.getOneDep(Integer.parseInt(did));
			Posts pos = posService.getOnePos(Integer.parseInt(pid));
			ep.setDept(dt);
			ep.setPosts(pos);
			empService.AddEmp(ep);
		}
		return SUCCESS;
	}
	//删除一个员工
	public String DelEmp(){
		employee emp=empService.getOneEmp(Integer.parseInt(id));
		empService.DeleteEmp(emp);
		return SUCCESS;
	}
	//异步根据部门id请求获取岗位
	@JSON(serialize=false)
	public String getPosByIdEmp() {
		list = empService.getPosById(Integer.parseInt(id));
		JSONArray array = new JSONArray();
        for (Posts posts : list) {
            JSONObject obj = new JSONObject();
            obj.put("pid", posts.getPid());
            obj.put("pname", posts.getPname());
            array.add(obj);
        }
         posList = array.toJSONString();
		return "getsuccess";
	}
	
	
	
	
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	public List<employee> getEmplist() {
		return Emplist;
	}

	public void setEmplist(List<employee> emplist) {
		Emplist = emplist;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public employee getEp() {
		return ep;
	}
	public void setEp(employee ep) {
		this.ep = ep;
	}
	public List<department> getAlldep() {
		return alldep;
	}
	public void setAlldep(List<department> alldep) {
		this.alldep = alldep;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	@Override
	public String input() throws Exception {
		System.out.println("风光风光风光风光风光股份");
		alldep=empService.getAllDep();
		ActionContext.getContext().getValueStack().set("alldep",alldep);
		return "input";
	}
	
}
