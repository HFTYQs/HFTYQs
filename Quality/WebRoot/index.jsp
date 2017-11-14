<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	<style type="text/css">
table {
	margin: 10px auto;
	border-collapse: collapse;
}

a{
	font-weight: bold;
	position: relative;
	left: 77px;
}

/*a{
	text-decoration: none;
	color: black;	
}*/

/*a:hover{
color:red; transition:0.2s; 	
}*/

th {
	border: 1px solid black;
	width: 200px;
	height: 50px;
}

td {
	text-align: center;	
	border: 1px solid black;
	width: 200px;
	height: 50px;
}
</style>
</head>
<body>	
  <form action="page" method="post">
	<table >	
		<tr >
			<th colspan="7"><h1>空气质量指数表</h1></th>
		</tr> 
			<a href="add.jsp">新增</a>
		<tr>			
			<th>序号</th>
			<th>区域</th>	
			<th>监测时间</th>
			<th>PM10数据</th>
			<th>PM2.5的数据</th>
			<th>监测站</th>
			<th>操作</th>
		</tr>
		
		<c:forEach items="${list}" var="q">
           <tr>
        <td>${q.id}</td>
        <td>${q.getDistrict().getName()}</td>
        <td>${q.modify}</td> 
        <td>${q.pm}</td>
        <td>${q.pmm}</td> 
        <td>${q.station}</td> 
       
        <td><a href="delete?id=${q.id}">删除</a></td>
       </tr>
      </c:forEach>
	</table>
    <a href="page?pageindex=1">首页</a>&nbsp;&nbsp;
	<a href="page?pageindex=${pageindex-1}">上一页</a>&nbsp;&nbsp;
	<a href="page?pageindex=${pageindex+1}">下一页</a>&nbsp;&nbsp;
	<a href="page?pageindex=${countpage}">末页</a>
	</body>
	</form>		
</html>