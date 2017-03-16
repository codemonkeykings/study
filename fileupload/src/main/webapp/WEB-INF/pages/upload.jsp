<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Servlet Part实现文件上传</h2>
<form action="partServlet" enctype="multipart/form-data" method="post">
	<input type="file" name="file1"/>
	<input type="submit" value="提交"/>
</form>

<h2>Servlet FileUpload实现文件上传</h2>
<form action="fileUploadServlet" enctype="multipart/form-data" method="post">
	<input type="file" name="file2"/>
	<input type="submit" value="提交"/>
</form>

<h2>Spring MVC MultipartFile组件实现文件上传1</h2>
<form action="upload/pic1" enctype="multipart/form-data" method="post">
	<input type="file" name="file3"/>
	<input type="submit" value="提交"/>
</form>

<h2>Spring MVC 流方式实现文件上传</h2>
<form action="upload/pic2" enctype="multipart/form-data" method="post">
	<input type="file" name="file4"/>
	<input type="submit" value="提交"/>
</form>

<h2>Spring MVC MultipartFile实现文件上传2</h2>
<form action="upload/pic3" enctype="multipart/form-data" method="post">
	<input type="file" name="file5"/>
	<input type="submit" value="提交"/>
</form>
</body>
</html>
