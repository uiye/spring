<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/12
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Time</h1>
    <form method="post" action="hour">
        <input type="date" name="date"/>
        <input type="text" name="name"/>
        <input type="text" name="price"/>
        <input type="submit" value="提交"/>
    </form>
    <b>${time}</b>
    <b>${name}</b>
    <b>${price}</b>
</body>
</html>
