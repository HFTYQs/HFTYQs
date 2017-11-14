<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<script></script>
		<style type="text/css">
			table {
				margin: 20px auto;
				border-collapse: collapse;
				border: 1px solid black;
			}
			
			td {
				text-align: center;
				width: 500px;
				height: 50px;
			}
			
			.ss {
				text-align: center;
			}
			
			#88 {
				width: 400px;
			}
		</style>
	</head>

	<body>
		<form action="insert" method="post">
			<table>
				<tr>
					<th>
						<h1>添加空气质量信息</h1></th>
				</tr>
				<tr>
					<td>
						监测区域：
							<select style="width: 150px;" name="did">
							<option value="1">西城区</option>
							<option value="2">东城区</option>
							<option value="3">海淀区</option>
							<option value="4">丰台区</option>
						</select>
					</td>
				</tr>

				<tr>
					<td>
						监测日期：<input type="text" name="modify" required="required" />
					</td>
				</tr>

				<tr>
					<td>
						PM10值：
						<input type="text" name="pm" required="required" />
				
					</td>
						<td>
						PM2.5值：
						<input type="text" name="pmm" required="required" />
				
					</td>
						<td>
						监测站：
						<input type="text" name="station" required="required" />
				
					</td>
				</tr>
				<tr>
					<td class="ss">
						<input type="submit" value="提交" required="required" />
			  			<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</body>

</html>
