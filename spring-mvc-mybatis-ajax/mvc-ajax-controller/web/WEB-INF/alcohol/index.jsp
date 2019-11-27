<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/19
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/public/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/public/js/alcohol.js"></script>
</head>
<body>
    <h1>Alcohol Ajax</h1>

    <ul id="ul">

    </ul>
    <button id="btn">查看</button>

    <form method="post" action="upload" enctype="multipart/form-data">
        <input type="file" name="myfile">
        <input type="submit" value="上传">
    </form>

    <a href="download?filename=test.jpg">下载</a>

    <ul>
        <li><b>name</b><input type="text" id="name"/></li>
        <li><b>price</b><input type="text" id="price"/></li>
        <li><b>stock</b><input type="text" id="stock"/></li>
        <li></li>
    </ul>
</body>
</html>
