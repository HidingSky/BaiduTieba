<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>
        帖子内部
    </title>
</head>

<style>
    body {
        background-color: #DCEFFE;
        width:100%;
        height:40%;
        background-size:100% 100%;
    }

    .bigbox{
        display: flex;
        flex-direction: column;
        width: 65%;
        margin: 0px auto;
        background-color:rgba(255,255,255,1);
    }

    .smallbox{
        width: 95%;
        margin: 20px auto;
        background-color:rgba(111,188,255,0.3);
    }

    .littlebox{
        justify-content: left;
        width: 95%;
        margin: 3px auto;
        background-color:rgba(255,255,255,1);
    }




    .btn-primary {
        color: #fff;
        background-color: #428bca;
        border-color: #357ebd;
    }
    .btn {
        display: inline-block;
        padding: 6px 12px;
        margin-bottom: 0;
        font-size: 14px;
        font-weight: normal;
        line-height: 1.428571429;
        text-align: center;
        white-space: nowrap;
        vertical-align: middle;
        cursor: pointer;
        background-image: none;
        border: 1px solid transparent;
        border-radius: 4px;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        -o-user-select: none;
        user-select: none;
    }
    button {
        -webkit-appearance: button;
        -webkit-writing-mode: horizontal-tb !important;
        text-rendering: auto;
        color: buttontext;
        letter-spacing: normal;
        word-spacing: normal;
        text-transform: none;
        text-indent: 0px;
        text-shadow: none;
        display: inline-block;
        text-align: center;
        align-items: flex-start;
        cursor: default;
        background-color: buttonface;
        box-sizing: border-box;
        margin: 0em;
        font: 400 13.3333px Arial;
        padding: 1px 6px;
        border-width: 2px;
        border-style: outset;
        border-color: buttonface;
        border-image: initial;
    }





</style>

<body>
<%--${tiezis}--%>



<div class="bigbox">
    <div class="smallbox" style="background-color: #cccccc">
    <h2>帖子内部</h2>
    </div>

    <div class="littlebox" style="display: flex;flex-direction: row;border-style: solid;border-width: 2px;border-color: gainsboro">
        <div style="display: flex;flex-direction: column;border-style: solid;border-color: black;border-width: 1px">
        <img src="http://tb2.bdstatic.com/tb/static-pb/img/head_80.jpg">
        <p style="text-align: center">楼主</p>
        </div>
    <p>${louzhu}</p>

    </div>

    <c:forEach var="tiezi" items="${tiezis}">
        <div class="littlebox" style="display: flex;flex-direction: row;border-style: solid;border-width: 2px;border-color: gainsboro">
            <div style="display: flex;flex-direction: column;border-style: solid;border-color: black;border-width: 1px">
          <img src="http://tb2.bdstatic.com/tb/static-pb/img/head_80.jpg">
            <p style="text-align: center">${tiezi.flag2}</p>
            </div>
            <p>${tiezi.tiezineirong}</p>

      </div>
    </c:forEach>



<!-- 注意！直接进入home_page，列出帖子的功能将不会生效，必须经由listfatie功能进入本页面！-->
<div class="smallbox" style="background-color: gainsboro">
    <h2>回帖:</h2>
    <div class="littlebox">
<form action="/addtiezi">
    <textarea style="width: 700px;height: 250px; line-height: 20px;margin-top: 5px;margin-left: 5px;" placeholder="请输入内容" type="text" name="tiezineirong"></textarea><br>
    <input type="hidden" value="${louzhu}" name="louzhu" >
    <input type="hidden" value="${ba}" name="ba">
    <input type="hidden" value="${flag1}" name="flag1" >
    <input type="hidden" value="${flag2}" name="flag2" >
    <input style="margin-left: 5px" class="btn btn-primary" type="submit" value="回帖">
</form>

<form action="/listfatie">
    <input type="hidden" value="${ba}" name="flag1" >
    <input type="hidden" value="${flag2}" name="flag2" >
    <input style="margin-left: 5px" class="btn btn-primary" type="submit" value="返回贴吧">
</form>
    </div>
</div>

</div>

</body>


</html>