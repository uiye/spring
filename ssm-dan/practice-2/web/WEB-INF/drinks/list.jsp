<%--
  Created by IntelliJ IDEA.
  User: HardcoreProgrammer
  Date: 2019/11/21
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/2/static/js/jquery-3.3.1.min.js"/>
    <script src="/2/static/js/drinks.js"/>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach items="${list.list}" var="drinks">
        <tr>
            <td>${drinks.id}</td>
            <td>${drinks.name}</td>
        </tr>
    </c:forEach>
</table>

<ol>
    <li><a href="/drinks/list?pageNum=1"> 首页</a></li>
    <li><a href="/drinks/list?pageNum=${list.prePage}"> 上一页</a></li>
    <li><a href="/drinks/list?pageNum=${list.nextPage}"> 下一页</a></li>
    <li><a href="/drinks/list?pageNum=${list.pages}"> 尾页</a></li>
    <c:forEach items="${list.navigatepageNums}" var="p">
        <li><a href="/drinks/list?pageNum=${p}"> ${p}</a></li>
    </c:forEach>
</ol>

<form method="post" action="delete">
    <input type="text" name="id">
    <input type="submit" value="提交">
</form>
</body>
</html>
