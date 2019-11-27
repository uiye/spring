<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/11
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>alcohol</h1>
    <ol>
        <c:forEach items="${list}" var="alcohol">
            <li>${alcohol.alcoholName}</li>
        </c:forEach>
    </ol>

    <form method="post" action="insert">
        <b>name</b> <input type="text" name="alcoholName" value="${alcohol.alcoholName}"/><br/>
        <b>price</b><input type="text" name="alcoholPrice" value="${alcohol.alcoholPrice}"/><br/>
        <b>stock</b> <input type="text" name="alcoholStock" value="${alcohol.alcoholStock}"/><br/>
        <input type="submit" value="提交">
    </form>
    <b>${er}</b>
</body>
</html>
