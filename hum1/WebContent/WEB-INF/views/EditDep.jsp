<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门修改</title>
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
<a href="Dep-Sh-owDep.action" class="title">部门列表</a><span class="title">-> 部门编辑</span>
<s:form action="Dep-Sava-EditDep.action" method="post">
  <table class="table">
    <tr>
       <td><s:textfield name="dp.id" label="ID" readonly="true"></s:textfield></td>
    </tr>
    <tr>
       <td><s:textfield name="dp.departmentname" label="部门名称"></s:textfield></td>
    </tr>
    <tr>
       <td><s:textfield name="dp.adderss" label="部门地址"></s:textfield></td>
    </tr>
    <tr>
       <td><s:textfield name="dp.manager" label="部门主任"></s:textfield></td>
    </tr>
    <tr>
     <td><s:submit value="提交"/></td>
   </tr>
  </table>
</s:form>
</body>
</html>