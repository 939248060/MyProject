<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>岗位显示</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
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
<a href="Dep-Sh-owDep.action" class="title">部门列表</a><span class="title">-> 岗位列表</span>
 <table class="table table-bordered table-hover">
     <tr>
       <th>岗位ID</th>
       <th>岗位名称</th>
       <th>岗位说明</th>
       <th>所属部门</th>
       <th>操作&nbsp;&nbsp;&nbsp;</th>
     </tr>
<c:forEach items="${postsList }" var="pos">
     <tr>
        <td>${pos.pid }</td>
        <td>${pos.pname }</td>
        <td>${pos.explains }</td>
        <td>${pos.dept.departmentname }</td>
        <td><a href="Pos-deletePos.action?id=${pos.pid }">删除</a>&nbsp;&nbsp;&nbsp;</td>
     </tr>
</c:forEach>
 </table>
 <script src="js/jquery-1.12.4.js" type="text/javascript"
		charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript"
		charset="utf-8"></script>
</body>
</html>