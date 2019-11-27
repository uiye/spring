<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/7
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>userinfo</title>
</head>
<body>
    <ul>
        <c:forEach items="${list}" var="userinfo">
            <li>${userinfo.id}<b/>${userinfo.sysUsername}</li>
        </c:forEach>
    </ul>
    <c:forEach items="${pageInfo.navigatepageNums}" var="page">
        <a href="index?num=${page}">${page}</a>
    </c:forEach>
    <form action="/userinfo/tx" method="post">
        <b>name</b><input name="name" type="text">
        <b>id</b><input name="id" type="text">
        <input type="submit" value="提交">
    </form>
</body>
</html>
