<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改员工</title>
<style type="text/css">
.title{
 font-size: 20px;
 display: block;
 margin: 10px 5px;
 float: left;
 text-decoration: none;
}
.table{ clear: both;}
#posSel{
   width: 118px;
}
</style>
<script src="js/jquery-1.12.4.js" type="text/javascript"
		charset="utf-8"></script>
</head>
<body>
<a href="Emp-Sh-owEmp.action" class="title">员工列表</a><span class="title">-> 员工编辑</span>
<s:form action="Emp-Sava-EditEmp.action" method="post">
<s:hidden name="ep.id" value="%{ep.id}"></s:hidden>
   <table class="table">
    <tr>
     <td><s:textfield name="ep.eid" label="ID" readonly="true"></s:textfield></td>
    </tr>
    <tr>
     <td><s:textfield name="ep.name" label="姓名"></s:textfield></td>
    </tr>
    <tr>
     <td><s:radio list="#{'男':'男','女':'女'}" name="ep.sex" label="性别"/></td>
    </tr>
    <tr>
     <td><s:textfield name="ep.age" label="年龄"></s:textfield></td>
    </tr>  
   <tr>
    <s:select  list="alldep"  name="did" id="depSel"
				listKey="id" listValue="departmentname" 
 				headerKey="" headerValue="----请--选--择----" label="部门"> 
	</s:select> 
   </tr>
   <tr>
      <td><span>岗位:</span></td>
      <td>
         <select id="posSel" name="pid">
              <option value ="">请选择</option>
         </select>
      </td>
   </tr>
   <tr>
     <td><s:submit value="提交"/></td>
   </tr>
    </table>
</s:form>
<!-- 通过异步处理选项级联问题 -->
<script type="text/javascript">
     $(document).ready(function(){
    	 var id = $("#depSel option:selected").val();
    	 ajax(id);
    	 $("#depSel").change(function () {
    		 $("#posSel").empty();
    		 var id = $("#depSel option:selected").val();
    		 ajax(id);
		})
	  
     function ajax(pid){
    	 $.ajax({  
            url:"Emp-getPos-ByIdEmp.action",  
            type:"post",  
            data:"id=" + pid,  
            dataType:"json",  
            success:function (datas) {  
            $.each($.parseJSON(datas.posList),function(i,item){
                	$("#posSel").append("<option value=" + item.pid + ">" + item.pname + "</option>");//赋值  
              }); 
            $("#posSel").find("option[value='${ep.posts.pid}']").attr("selected",true);
            },
            error:function(xhr, status, error){
						 alert(status);  
                         alert(xhr.responseText); 
					}//这里不要加"," 
         }); 
        }
     }
     );
     
</script>
</body>
</html>