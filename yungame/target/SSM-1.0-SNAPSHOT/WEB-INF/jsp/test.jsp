<%--
  Created by IntelliJ IDEA.
  User: 李超强
  Date: 2017/8/19
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" href="/resources/test_top.css" >
    <script src="${pageContext.request.contextPath}/resources/jquery.min.js"></script>
</head>
<body>
<div class="test_top">
<%@include file="../common/top.jsp"%>
</div>
<h1>i am a test</h1>
<table border="1">
    <tr>
        <td><input type="checkbox" name="all"><a href="#">批量删除</a></td>
        <td>用户ID</td>
        <td>姓名</td>
        <td>班级</td>
        <td>操作&nbsp;&nbsp;&nbsp;<a href="#">导出表格</a></td>
    </tr>
    <c:forEach items="${studentBeans}" var="sb">
    <tr>
        <td><input type="checkbox" name="userid" value="${sb.uid}"></td>
        <td>${sb.uid}</td>
        <td>${sb.name}</td>
        <td>${sb.classzz}</td>
        <td><a href="/index/delete?uid=${sb.uid}">删除</a>&nbsp;&nbsp;<a href="#">编辑</a></td>
    </tr>
    </c:forEach>
    <div>${html}</div>
</table>
<script>

    $("input[name='all']").click(function () {
        if(!$(this).attr("checked") || $(this).attr("checked") == null){
            $("input[name='userid']").prop("checked",$(this).prop("checked"));
        }else{
            $("input[name='userid']").prop("checked",$(this).prop("checked"));
        }
    })
    $("a[href='#']").click(function () {
        var text="";
        $("input[name='userid']:checked").each(function (i) {
            text+=$(this).val()+",";
        })


        text=text.substring(0,text.length-1);
        var date = {"uid":text};
        $.ajax({
            type: "get",
            url : "/index/delete",
            dataType : 'text',
            data : date,

            success : function(data) {
                window.location.reload();
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
            }

        });
    })
</script>
</body>
</html>
