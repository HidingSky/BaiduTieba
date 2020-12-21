<%--
  Created by IntelliJ IDEA.
  User: mengxianyi
  Date: 2019/10/23
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title><!--此为用户信息展示界面，普通用户无法跳转的此界面-->
</head>
<body>
<%--${heros}--%>

    <table border="1">
        <tr>
            <th>用户id</th>
            <th>用户名字</th>
            <th>用户密码</th>
        </tr>

        <c:forEach var="hero" items="${heros}">
            <tr>
                <td>${hero.id}</td>
                <td>${hero.name}</td>
                <td>${hero.money}</td>
            </tr>
        </c:forEach>




    </table>


</body>
</html>
