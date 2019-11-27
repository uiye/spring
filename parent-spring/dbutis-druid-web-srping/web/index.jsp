<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/10/21
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/alcohol">list</a>

<c:forEach items="${list}" var="alcohol">
    <b>${alcohol.alcohol_name}</b>
</c:forEach>
</body>
</html>
