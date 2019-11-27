<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/13
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="index" method="post">
        <b>Addressee</b><input type="text" name="addressee"/><br/>
        <b>Title</b><input type="text" name="title"/><br/>
        <b>Content</b><input type="text" name="content"/><br/>
        <b>Date</b><input type="date" name="date"/><br/>
        <b>Sender</b><input type="text" name="sender"/><br/>

        <input type="submit" value="提交"/>
    </form>

    <b>${error}</b>
</body>
</html>
