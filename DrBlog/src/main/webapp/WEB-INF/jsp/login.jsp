<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%
	String path=request.getContextPath();//		/springMVC_douabn
	//				http				://			localhost		:			8080	/springMVC_douabn	/
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<base href="<%=basePath %>">
<script type="text/javascript">
	function loadImage(){
		var img=document.getElementById("randImg");
		img.src="imageCode.jsp?r="+Math.random();
		
	}
</script>
</head>
<body>
<c:if test="${errmsg!='' }">
	<font style="color:red"><c:out value="${errmsg }"></c:out></font>
</c:if>
<form action="adminLogin" method="Post">
	<fieldset>
		<legend>后台登录</legend>
		<p>用户名：<input type="text" name="uname" /></p>
		<p>密码：<input type="password" name="pwd" /></p>
		<p>验证码：<input type="text" name="validateCode" /></p>
		<img id="randImg" border=0 src="imageCode.jsp">
		<a href="javascript:loadImage();">换一张</a>
		<p><input type="submit" value="登录" /></p>
	</fieldset>
</form>






</body>
</html>