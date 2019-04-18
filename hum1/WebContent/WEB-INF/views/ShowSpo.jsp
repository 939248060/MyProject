<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门显示</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>
 <table class="table table-bordered table-hover">
     <tr>
       <th>姓名</th>
       <th>年龄</th>
       <th>性别</th>
       <th>职业</th>
       <th>工作单位</th>
       <th>所属员工</th>
       <th>操作&nbsp;&nbsp;&nbsp;</th>
     </tr>
<c:forEach items="${spoList }" var="spo">
     <tr>
        <td>${spo.sname }</td>
        <td>${spo.age }</td>
        <td>${spo.sex }</td>
        <td>${spo.job }</td>
        <td>${spo.workplace }</td>
        <td>${spo.emp.name }</td>
        <td><a href="Spo-deleteById.action?id=${spo.sid }">删除</a>&nbsp;&nbsp;&nbsp;</td>
     </tr>
</c:forEach>
 </table>
 <script src="js/jquery-1.12.4.js" type="text/javascript"
		charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript"
		charset="utf-8"></script>
</body>
</html>