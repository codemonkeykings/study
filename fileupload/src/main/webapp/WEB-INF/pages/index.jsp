<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Servlet Part实现文件上传</h2>
<form action="partServlet" enctype="multipart/form-data" method="post">
	<input type="file" name="partfile"/><br>
	<input type="submit" value="提交"/>
</form>

<h2>Servlet FileUpload实现文件上传</h2>
<form action="fileUploadServlet" enctype="multipart/form-data" method="post">
	<input type="file" name="fileupload"/><br>
	<input type="submit" value="提交"/>
</form>
</body>
</html>
