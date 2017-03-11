<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%String basepath = request.getContextPath(); %>
<%String path = request.getContextPath()+"/editormd"; %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<div id="global">


	
	<form:form commandName="users" action="user/register" method="POST">
	
	<fieldset>
			<legend>填写个人信息</legend>
			<form:hidden path="bid"/>
			
			email
			touchphone
			username
			password
			sex
			
			
			<p>
				<label for="email">邮箱：</label>
				<form:input id="email" path="email"/>
				
			</p>
			
			<p>
				<label for="touchphone">手机号：</label>
				<form:input id="touchphone" path="touchphone"/>
			</p>
			
			<p>
				<label for="username">用户名：</label>
				<form:input id="username" path="username" />
			</p>
			
			<p>
				<label for="password">密码：</label>
				<form:input id="password" path="password" />
			</p>
			
			<p>
				<label for="password_a">密码确认：</label>
				<form:input id="password_a" path="password_a" />
			</p>
			
			
			<p>
				<label for="sex">性别：</label>
				<form:input id="sex" path="sex" />
			</p>
			
			<p>已阅读相关条例√</p>
			
			<p id="buttons">
				<input id="reset" type="reset" tabindex="4">
				<input id="submit" type="submit" tabindex="5" value="注册">
			</p>
			
		</fieldset>
	</form:form>
	</div>
</body>
</html>