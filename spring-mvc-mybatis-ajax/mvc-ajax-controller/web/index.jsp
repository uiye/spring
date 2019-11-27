<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/19
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/alcohol/index">alcohol</a>
    <form action="/alcohol/login" method="post">
        <input type="text" name="username">
        <input type="text" name="password">
        <input type="submit" value="Login">
    </form>

    <form method="post" action="/alcohol/upload" enctype="multipart/form-data">
        <input type="file" name="myfile">
        <input type="submit" value="上传">
    </form>

    <a href="/alcohol/download?filename=test.jpg">下载</a>
</body>
</html>
