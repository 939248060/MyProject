<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags"%>
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
       <th>学历</th>
       <th>专业</th>
       <th>毕业时间</th>
       <th>毕业学校</th>
       <th>英语水平</th>
       <th>员工</th>
       <th>操作&nbsp;&nbsp;&nbsp;</th>
     </tr>
<s:iterator value="eduList" var="edu">
     <tr>
        <td><s:property value="#edu.education"/></td>
        <td><s:property value="#edu.major"/></td>
        <td><s:date name="#edu.graduationTime" format="yyyy年MM月dd日"/></td>
        <td><s:property value="#edu.graduationSchool"/></td>
        <td><s:property value="#edu.language"/></td>
        <td><s:property value="#edu.emp.name"/></td>
        <td><a href="Edu-deleteEdu.action?id=${edu.eduId }">删除</a>&nbsp;&nbsp;&nbsp;</td>
     </tr>
</s:iterator>
 </table>
 <script src="js/jquery-1.12.4.js" type="text/javascript"
		charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript"
		charset="utf-8"></script>
</body>
</html>