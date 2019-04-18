<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加岗位</title>
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
<a href="Dep-Sh-owDep.action" class="title">部门列表</a><span class="title">-> 岗位添加</span>
<s:form action="Pos-savaPos.action" method="post">
<s:hidden name="id" value="%{id}"></s:hidden>
   <table class="table">
    <tr>
     <td><s:textfield name="posts.pname" label="岗位名称"></s:textfield></td>
    </tr>
    <tr>
     <td><s:textfield name="posts.explains" label="岗位说明"></s:textfield></td>
    </tr>
   <tr>
     <td><s:submit value="提交"/></td>
   </tr>
    </table>
</s:form>
</body>
</html>