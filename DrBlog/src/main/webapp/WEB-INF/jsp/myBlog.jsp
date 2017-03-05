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
<title>我的博客</title>
</head>
<body>

	<div id="head">
    	<input type="text" name="search" />
        <input type="button" name="search_button" value="搜索" />
        <a href="" >退出登录</a>
    </div>
    
    
    
<input type="button" value="按时间" name="time" /> 
<input type="button" value="按收藏夹" name="folder" /> 


<a href="user/toeditblog"><input type="button" value="写博客" name="write" /></a>
<div name="myblog" >
我的blog列表
ajax
分页
------
默认时间排序/

按收藏夹分类时，点击出现的是收藏夹列表，点击收藏夹出现blog，也是按时间排序
-----


blog1			--2017.1.31					|<select></select><input type="button" value="收藏" />
blog2			--2017.2.29					|<input type="button" value="删除" />
											|
											|<input type="button" value="编辑" >
											
											
											是否需要提供blog发布后重编辑功能


</div>











/按时间排序，按收藏夹分类

blog列表				收藏夹
					标签列表





</body>
</html>