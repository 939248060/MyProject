<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门显示</title>
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
<a href="Dep-Sh-owDep.action" id="title">部门列表</a>
 <table class="table table-bordered table-hover">
     <tr>
       <th>ID</th>
       <th>部门名称</th>
       <th>地址</th>
       <th>部门主任</th>
       <th>操作&nbsp;&nbsp;&nbsp;<a href="Dep-Add-Dep.action">添加</a></th>
     </tr>
<c:forEach items="${Deplist }" var="d">
     <tr>
        <td>${d.id }</td>
        <td>${d.departmentname }</td>
        <td>${d.adderss }</td>
        <td>${d.manager }</td>
        <td>
           <a href="Dep-Edit-Dep.action?id=${d.id }">修改</a>&nbsp;&nbsp;&nbsp;
           <a href="Dep-Delete-Dep.action?id=${d.id }">删除</a>&nbsp;&nbsp;&nbsp;
           <a href="Pos-addPos.action?id=${d.id }">添加岗位</a>&nbsp;&nbsp;&nbsp;
        <c:if test="${!empty d.pos }">
            <a href="Pos-showPos.action?id=${d.id }">查看岗位</a>
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