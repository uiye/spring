<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/6
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>drinks</title>
</head>
<body>
    <ol>
        <c:forEach items="${drinks}" var="drinks">
            <li>${drinks.name}</li>
        </c:forEach>
    </ol>
</body>
</html>
