<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%String basepath = request.getContextPath(); %>
<%String path = request.getContextPath()+"/editormd"; %>


<!DOCTYPE html>
<html lang="zh">
    <head>
        <meta charset="utf-8" />
        <title>编辑博客</title>
        <link rel="stylesheet" href="<%=path %>/css/editormd.css" />
        <link rel="stylesheet" href="<%=basepath %>/css/main.css" />
        <!-- <link rel="shortcut icon" href="https://pandao.github.io/editor.md/favicon.ico" type="image/x-icon" /> -->
    </head>
    
    <body>
    <div id="htmlbody">
    
    
    &nbsp;<h2>请开始编辑您的Blog</h2>&nbsp;
        <div id="layout">
            <header>
            </header>
            <div id="test-editormd">
				<textarea style="display:none;">
				标题
				</textarea>
            </div>
        </div>
        
        
        <input type="button" href="user/deployBlog" value="发布" name=""/>
        
    </div>

    <script src="<%=path %>/jquery.min.js"></script>
        <script src="<%=path %>/editormd.min.js"></script>
        <script type="text/javascript">
			var testEditor;

            $(function() {
                testEditor = editormd("test-editormd", {
                    width   : "90%",
                    height  : 640,
                    syncScrolling : "single",
                    path    : "<%=path %>/lib/"
                });
                
                /*
                // or
                testEditor = editormd({
                    id      : "test-editormd",
                    width   : "90%",
                    height  : 640,
                    path    : "../lib/"
                });
                */
            });
            
            
            
            
            
            
            
            
            
            
        </script>

    </body>
</html>