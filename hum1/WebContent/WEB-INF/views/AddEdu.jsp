<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/Calendar3.js"></script>
<title>添加学历</title>
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
<a href="Emp-Sh-owEmp.action" class="title">员工列表</a><span class="title">-> 学历添加</span>
<s:form action="Edu-savaEdu.action" method="post">
<s:hidden name="id" value="%{id}"></s:hidden>
   <table class="table">
    <tr>
     <td><s:textfield name="education.education" label="学历"></s:textfield></td>
    </tr>
    <tr>
     <td><s:textfield name="education.major" label="专业"></s:textfield></td>
    </tr>
    <tr>
     <td><s:textfield name="education.graduationSchool" label="毕业学校"></s:textfield></td>
    </tr>  
   <tr>
     <td><s:textfield name="education.language" label="外语水平"></s:textfield></td>
   </tr>
   <tr>
     <td><s:textfield name="education.graduationTime" label="毕业时间" onclick="new Calendar().show(this);" readonly="true"></s:textfield></td>
   </tr>
   <tr>
     <td><s:submit value="提交"/></td>
   </tr>
    </table>
</s:form>
</body>
</html>