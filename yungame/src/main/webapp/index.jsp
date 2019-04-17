<%--
  Created by IntelliJ IDEA.
  User: 李超强
  Date: 2017/8/16
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<script src="resources/jquery.js"></script>--%>
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>

</head>
<body>
<%@include file="WEB-INF/common/top.jsp"%>
<form action="${pageContext.request.contextPath}/index/insert" method="post">
    姓名：<input type="text" name="name"/> <br><br>
    班级：<input type="text" name="classzz"/> <br><br>
    <input type="submit" value="提交"/>
    <select id="select">
        <option value="100" selected>全部</option>
    </select>
    <div></div>
</form>
<button>获取数据</button>
<a href="/index/test">显示页面</a>


<script type="text/javascript">


    function ajaxs(id) {
        $.ajax({
            type: "get",
            url : "/index/student",
            data : {"type":1},

            success : function(data) {
                var datas = JSON.parse(data);
                $("#select").empty();
                var text = "";
                $.each(datas, function (i, value) {
                    text += "<option value='" + value.id+ "'>" + value.name + "</option>";
                })
                    $("#select").append(text);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                }

        });
    }
    var id=$("#select option:selected").val();
    ajaxs(id);
    $($("button").click(function () {
        id=$("#select option:selected").val();
        ajaxs(id);
    }))
</script>

</body>
</html>
