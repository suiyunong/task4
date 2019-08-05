<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="/tags" prefix="date"%>
< date:date value ="${date}"/>
<%--
 Created by IntelliJ IDEA.
 User: Administrator
 Date: 2018/11/11
 Time: 23:38
 To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>无标题文档</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/other/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/other/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/other/js/bootstrap.min.js"></script>
    <link href="${pageContext.request.contextPath}/other/css/t11.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/other/css/base.css" rel="stylesheet" type="text/css">
</head>
<header>
    <div class="top container">
        <p class="hidden-xs">客服热线：010-594-78634</p>
        <img src="${pageContext.request.contextPath}/other/images/12321.gif">
    </div>

    <div role="navigation" class="nav1 navbar navbar-default">
        <div class="container">
            <div class="header-logo">
                <div class="logo-middle"><img src="${pageContext.request.contextPath}/other/images/logo.png"></div>
            </div>
            <div class="navbar-header marginTop">
                <button data-target="#example-navbar-collapse" data-toggle="collapse" class="navbar-toggle"
                        type="button">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>

            <div id="example-navbar-collapse" class=" collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <a href="${pageContext.request.contextPath}/views/home">
                        <li>首 页</li>
                    </a>
                    <a href="">
                        <li class="border">职 业</li>
                    </a>
                    <a href="">
                        <li>推 荐</li>
                    </a>
                    <a href="">
                        <li>关 于</li>
                    </a>
                </ul>
            </div>
        </div>
    </div>

</header>

</html>