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
    <title>没这个贴吧</title><!-- 显然，这个是注册界面-->
</head>


<style>
    body {
        background:url(https://desk-fd.zol-img.com.cn/t_s1600x900c5/g5/M00/02/00/ChMkJlbKw1-IXEEwAA236_mqzTQAALG2AD8iBYADbgD836.jpg) no-repeat;
        width:100%;
        height:40%;
        background-size:100% 100%;
    }

    div{
        width: 200px;
        height: 200px;
        background-color:rgba(255,255,255,0.8);
    }
    .center-in-center{
        position: absolute;
        top: 50%;
        left: 50%;
        -webkit-transform: translate(-50%, -50%);
        -moz-transform: translate(-50%, -50%);
        -ms-transform: translate(-50%, -50%);
        -o-transform: translate(-50%, -50%);
        transform: translate(-50%, -50%);
    }

    .shuiping_juzhong{
        text-align: center;

    }

    .shurukuang{
        margin-left:20px;
        width:160px;
    }

    .anniu{
        margin-left:50px;
        margin-top: 20px;
        width:100px;
    }

    .wrapper{
        width: 300px;
        height: 200px;
    }

    .form-signin {
        max-width: 380px;
        padding: 15px 35px 45px;
        margin: 0 auto;
        background-color: #fff;
        border: 1px solid rgba(0, 0, 0, 0.1);
    }
    .form-signin .form-signin-heading,
    .form-signin .checkbox {
        margin-bottom: 30px;
    }
    .form-signin .checkbox {
        font-weight: normal;
    }
    .form-signin .form-control {
        position: relative;
        font-size: 16px;
        height: auto;
        padding: 10px;
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
    }
    .form-signin .form-control:focus {
        z-index: 2;
    }

    .btn-block {
        display: block;
        width: 100%;
        padding-right: 0;
        padding-left: 0;
    }
    .btn-lg {
        padding: 10px 16px;
        font-size: 18px;
        line-height: 1.33;
        border-radius: 6px;
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


<div class="center-in-center wrapper">
<h2 class="shuiping_juzhong">没有这个贴吧，自己创建一个新贴吧吧！</h2>
<form class="form-signin" action="/addfatie">
    <input type="hidden" value="1" name="biaozhiwei">
    <input type="hidden" value="本吧第一贴" name="biaoti">
    <input type="hidden" value="欢迎您畅所欲言" name="neirong">
    <input type="hidden" value="${name}" name="flag2">
    <h1 class="shuiping_juzhong">请输入贴吧名:</h1>
    <input class="form-control" type="text" name="flag1"><br>
    <button style="margin-top: 20px" class="btn btn-lg btn-primary btn-block" type="submit">创建帖吧</button>
</form>
</div>
</body>
</html>
