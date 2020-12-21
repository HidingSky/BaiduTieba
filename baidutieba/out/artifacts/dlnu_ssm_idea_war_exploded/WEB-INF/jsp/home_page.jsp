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
        贴吧
    </title>
</head>

<style>
    body {
        background-color: #DCEFFE;
        width:100%;
        height:100%;
        background-size:100% 100%;
    }

    .bigbox{
        display: flex;
        flex-direction: column;
        width: 65%;
        margin: 0px auto;
        background-color:rgba(255,255,255,1);
    }

    .smallbox {
        width: 95%;
        margin: 3px auto;
        background-color:rgba(111,188,255,0.3);
    }

     .littlebox{
         justify-content: left;
         width: 95%;
         margin: 10px auto;
         background-color:rgba(255,255,255,1);
     }

    .whitebox{
        display:flex;
        flex-direction:row;
        width: 100%;
        height:auto;
        margin-top: 0px;
        margin-left: 0px;
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
        margin: 0px auto;
        font: 400 13.3333px Arial;
        padding: 1px 6px;
        border-width: 2px;
        border-style: outset;
        border-color: buttonface;
        border-image: initial;
    }






</style>

<body>
<%--${faties}--%>
<div style="background-color:#DCEFFE;text-align: center">
    <img src="https://tb1.bdstatic.com/tb/cms/frs/bg/default_head20141014.jpg">
</div>

<div class="bigbox">
    <div class="smallbox" style="background-color: white">
    <div style="display: flex;flex-direction: row;">
        <img style="width: 200px; height: 100px;" src="http://a3.att.hudong.com/83/68/20300542906611141990686760841.jpg">
        <form action="/listfatie">
            <div style="flex-direction: row;flex-wrap:nowrap;">
                <input placeholder="在此输入贴吧名可跳转贴吧" style="position: relative;
        font-size: 16px;
        margin-top: 30px;
        height: 20px;
        padding: 20px;" type="text" name="flag1">
                <input type="hidden" value="${name}" name="flag2">
                <button  class="btn btn-primary"  type="submit">跳转贴吧</button>
            </div>
        </form>
    </div>
    </div>
    


    <div class="smallbox" style="display: flex;flex-direction:row;background-color: #F3F5F8;border-style: solid;border-color: gray;border-width: 1px;">
    <img style="width: 100px;height: 100px" src="https://is2-ssl.mzstatic.com/image/thumb/Purple125/v4/a8/fd/8f/a8fd8fc8-03d5-4406-98d0-61e5dc94385d/source/512x512bb.jpg">
    <h1>${flag1}</h1>
    </div>


<div class="smallbox" style="background-color: #EBEEF2;border-style: solid;border-color: gray;border-width: 1px">
<h3>您的用户名为：<a  href="http://localhost:8080/personal_page?name=${name}">${name}</a></h3>
</div>

<div class="smallbox" style="background-color: #DCEFFE;border-style: solid;border-color: gray;border-width: 1px;background-color: #F3F5F8;margin-top: 30px">

    <c:forEach var="fatie" items="${faties}">
        <div class="littlebox" style="border-style: solid;border-width: 1px;border-color: gray; width: 99%">
            <h3>标题：<a href="http://localhost:8080/listtiezi?ba=${flag1}&flag2=${name}&flag1=${fatie.id}&louzhu=${fatie.neirong}">${fatie.biaoti}</a></h3>
            <p>内容：${fatie.neirong}</p>
            <p>发帖者：${fatie.flag2}</p>
        </div>
    </c:forEach>
</div>
<!-- 上面的ba=flag1，ba为吧名，name=name，name为用户名，flag1=fatie.id,flag1为帖子id-->


<!-- 注意！直接进入home_page，列出帖子的功能将不会生效，必须经由listfatie功能进入本页面！-->
    <div class="smallbox" style="background-color:gainsboro;border-style: solid;border-color: black;border-width: 1px">
        <h2>发表新帖:</h2>
        <div class="littlebox" style="border-style: solid;border-color: black;border-width: 1px">
<form action="/addfatie">
    <input style="width: 700px;height: 35px;margin-left: 5px;margin-top: 5px" placeholder="请输入标题" type="text" name="biaoti"><br>
    <p> </p>
    <textarea style="width: 700px;height: 250px; line-height: 20px;margin-left: 5px" placeholder="请输入内容" type="text" name="neirong"></textarea><br>
    <input type="hidden" value="${flag1}" name="flag1">
    <input type="hidden" value="${name}" name="flag2">
    <button style="margin-left: 5px" class="btn btn-primary" type="submit">发帖</button>
</form>
        </div>
    </div>

</div>

</body>


</html>