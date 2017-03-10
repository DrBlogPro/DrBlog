<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%String basepath = request.getContextPath(); %>
<%String path = request.getContextPath()+"/editormd"; %>


<!DOCTYPE html>
<html lang="zh">
    <head>
        <meta charset="utf-8" />
        <title>图片上传</title>
        
        <link rel="stylesheet" href="<%=path %>/css/editormd.css" />
        <link rel="stylesheet" href="<%=basepath %>/css/main.css" />
    </head>
    <body>

        <div id="layout" style="height: 2000px;background: #f6f6f6;">
            <header>
                <h1>图片上传示例</h1>
                <p>Image upload example</p>
            </header>
            <div id="test-editormd">
                <textarea style="display:none;">
                
                </textarea>
        </div>
        </div>
            
        <script src="<%=path %>/jquery.min.js"></script>
        <script src="<%=path %>/editormd.js"></script>
        <script type="text/javascript">
            $(function() {                
                var testEditor = editormd("test-editormd", {
                    width: "90%",
                    height: 640,
                    markdown : "",
                    path : '<%=path %>/lib/',
                    //dialogLockScreen : false,   // 设置弹出层对话框不锁屏，全局通用，默认为 true
                    //dialogShowMask : false,     // 设置弹出层对话框显示透明遮罩层，全局通用，默认为 true
                    //dialogDraggable : false,    // 设置弹出层对话框不可拖动，全局通用，默认为 true
                    //dialogMaskOpacity : 0.4,    // 设置透明遮罩层的透明度，全局通用，默认值为 0.1
                    //dialogMaskBgColor : "#000", // 设置透明遮罩层的背景颜色，全局通用，默认为 #fff
                    imageUpload : true,
                    imageFormats : ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
                    imageUploadURL : "uploadfile",
                    saveHTMLToTextarea : true,
                    
                    /*
                     上传的后台只需要返回一个 JSON 数据，结构如下：
                     {
                        success : 0 | 1,           // 0 表示上传失败，1 表示上传成功
                        message : "提示的信息，上传成功或上传失败及错误信息等。",
                        url     : "图片地址"        // 上传成功时才返回
                     }
                     */
                });
            });
        </script>
    </body>
</html>

