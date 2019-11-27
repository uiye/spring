<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/10/31
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Drinks List</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Operation</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="drinks">
                <tr>
                    <td>${drinks.drinksId}</td>
                    <td>${drinks.drinksName}</td>
                    <td><a href="delete?id=${drinks.drinksId}">delete</a> </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <c:forEach items="${pageInfo.navigatepageNums}" var="page">
        <a href="list?pageNum=${page}">${page}</a>
    </c:forEach>
</body>
</html>
