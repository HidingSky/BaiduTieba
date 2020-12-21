<%--
  Created by IntelliJ IDEA.
  User: mengxianyi
  Date: 2019/10/23
  Time: 10:06
  hero_add.jsp
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人页面</title><!-- 显然，这个是注册界面-->
</head>


<style>
    body {
        background-color: #cccccc
    }

    .row-reverse {
        flex-direction: row-reverse;
    }
    .column {
        flex-direction: column;
    }
    .column-reverse {
        flex-direction: column-reverse;
    }

    .wrap {
        flex-wrap: wrap;
    }
    .wrap-reverse {
        flex-wrap: wrap-reverse;
    }

    .justify-start {
        justify-content: flex-start;
    }
    .justify-end {
        justify-content: flex-end;
    }
    .justify-center {
        justify-content: center;
    }
    .justify-between {
        justify-content: space-between;
    }
    .justify-around {
        justify-content: space-around;
    }

    .align-start {
        align-items: flex-start;
    }
    .align-end {
        align-items: flex-end;
    }
    .align-center {
        align-items: center;
    }
    .align-baseline {
        align-items: baseline;
    }

    .order1 {
        order: 1;
    }
    .order10 {
        order: 10;
    }
    .order100 {
        order: 100;
    }

    .grow1 {
        flex-grow: 1;
    }
    .grow2 {
        flex-grow: 2;
    }
    .grow3 {
        flex-grow: 3;
    }

    .basis4 {
        flex-basis: 25%;
    }
    .basis3 {
        flex-basis: 33.33%;
    }
    .basis2 {
        flex-basis: 50%;
    }
    .basis5 {
        flex-basis: 20%;
    }

    .self-end {
        align-self: flex-end;
    }

    .box {
        display: flex;
        width: 300px;
        height: 150px;
        margin: 30px auto;
        background-color: white;
    }
    .subbox {
        display: flex;
        width: 50px;
        height: 30px;
        background-color: rgb(247, 12, 12);
    }

</style>

<body>

    <h1>这是您的个人页面</h1>
    <h1>用户名：${name}</h1>



</body>
</html>
