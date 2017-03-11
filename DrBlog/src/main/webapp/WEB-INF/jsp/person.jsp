<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%
	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<body>


	<div id="head">
    	<input type="text" name="search" />
        <input type="button" name="search_button" value="搜索" />
        <a href="" >退出登录</a>
    </div>
    
    
    
    
    <div id="userinfo">
    	<div id="photo">
    	
    	
    	</div>
    	
    	个人信息
    	
    	
    	账户余额
    	
    	<a href="user/toMyBlog"> <input type="button" name="myBlog" value="进入我的博客"> </a>
    </div>
    
    <div id="attentionList">
    	关注列表
    
    
    </div>
    
    
    



</body>
</html>