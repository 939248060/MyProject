<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加员工配偶</title>
<link type="text/css" rel="styleSheet"  href="/WebContent/css/EmpAdd.css" />
<style type="text/css">
.title{
 font-size: 20px;
 display: block;
 margin: 10px 5px;
 float: left;
 text-decoration: none;
}
.table{ clear: both;}
</style>
</head>
<body>
<a href="Emp-Sh-owEmp.action" class="title">员工列表</a><span class="title">-> 配偶添加</span>
<s:form action="Spo-saveSpo.action" method="post">
<s:hidden name="id" value="%{id}"></s:hidden>
   <table class="table">
    <tr>
     <td><s:textfield name="spo.sname" label="姓名"></s:textfield></td>
    </tr>
    <tr>
     <td><s:radio list="#{'男':'男','女':'女'}" name="spo.sex" label="性别"/></td>
    </tr>
    <tr>
     <td><s:textfield name="spo.age" label="年龄"></s:textfield></td>
    </tr>  
   <tr>
     <td><s:textfield name="spo.job" label="职业"></s:textfield></td>
   </tr>
   <tr>
     <td><s:textfield name="spo.workplace" label="工作单位"></s:textfield></td>
   </tr>
   <tr>
     <td><s:submit value="提交"/></td>
   </tr>
    </table>
</s:form>
</body>
</html>