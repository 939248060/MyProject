<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工显示</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<style type="text/css">
#title{
 font-size: 20px;
 display: block;
 margin: 10px 10px;
}
</style>
</head>
<body>
<a href="Emp-Sh-owEmp.action" id="title">员工列表</a>
<table class="table table-bordered table-hover">
   <tr>
      <th>ID</th>
      <th>姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>岗位</th>
      <th>部门</th>
      <th>操作&nbsp;&nbsp;&nbsp;<a href="Emp-Add-Emp.action">增加</a></th>
   </tr>
<c:forEach items="${Emplist }" var="e">
   <tr>
    <td>${e.eid }</td>
    <td>${e.name }</td>
    <td>${e.sex }</td>
    <td>${e.age }</td>
    <td>${e.posts.pname }</td>
    <td>${e.dept.departmentname }</td>
    <td>
        <a href="Emp-Edit-Emp.action?id=${e.id }">修改</a>&nbsp;&nbsp;&nbsp;
        <a href="Emp-Del-Emp.action?id=${e.id }">删除</a>&nbsp;&nbsp;&nbsp;
        <c:if test="${empty e.education }">
        <a href="Edu-addEdu.action?id=${e.id }">添加学历</a>
        </c:if>
        <c:if test="${!empty e.education }">
        <a href="Edu-showOneEdu.action?id=${e.education.eduId }">查看学历</a>
        </c:if></a>&nbsp;&nbsp;&nbsp;
        <c:if test="${!empty e.spouse}">
           <a href="Spo-showSpoById.action?id=${e.spouse.sid }">查看配偶</a>
        </c:if>
        <c:if test="${empty e.spouse}">
           <a href="Spo-addSpo.action?id=${e.id  }">添加配偶</a>
        </c:if>
    </td>
   </tr>
</c:forEach>
</table>

<script src="js/jquery-1.12.4.js" type="text/javascript"
		charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript"
		charset="utf-8"></script>
</body>
</html>