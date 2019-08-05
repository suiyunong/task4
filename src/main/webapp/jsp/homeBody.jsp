<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/tags" prefix="date"%>
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

<div class="container">
    <div class="nav-title">首页&gt;职业</div>
    <div class="nav-bar">
        <span class="">方向：</span>
        <a class="nav-bar-a a-selected" href="">全部</a>
        <a class="nav-bar-a" href="">前端开发</a>
        <a class="nav-bar-a" href="">后端开发</a>
        <a class="nav-bar-a" href="">移动开发</a>
        <a class="nav-bar-a" href="">整站开发</a>
        <a class="nav-bar-a" href="">运营维护</a>
    </div>
    <c:set value="" var="var2"/>
    <c:forEach items="${careerList}" var="var">

        <c:if test="${var.developmentDirection !=var2}">
            <c:set value="${var.developmentDirection}" var="var2"/>
            <div class="caption">
                <h4>${var2}</h4>
            </div>
            <div class="row">
                <c:forEach items="${careerList}" var="career">
                    <c:if test="${career.developmentDirection==var2}">
                    <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                        <div class="warp-border">
                            <div class="clearfix">
                                <div class="icon-people"><img src="${career.img}"></div>
                                <div class="text">
                                    <h4 class="">${career.careerName}</h4>
                                    <p class="text-present">${career.description}</p>
                                </div>
                            </div>

                            <div class="warp-class2">
                                <div class="warp-class2-text">
                                    <div class="iconfont text-padding">门槛
                                        <c:forEach begin="1" end="${carerr.limitCondition}">
                                            <img src="${pageContext.request.contextPath}/other/images/xx.png">
                                        </c:forEach>
                                    </div>
                                </div>
                                <div class="warp-class2-text">
                                    <div class="iconfont text-padding text-border-left">难易程度
                                        <c:forEach begin="1" end="${career.difficulty}">
                                            <img src="${pageContext.request.contextPath}/other/images/xx.png">
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                            <div class="warp-class2">
                                <div class="warp-class2-text">
                                    <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.periodOne}</span>-<span class="iconfont-color">${career.periodTwo}</span>年
                                    </div>
                                </div>
                                <div class="warp-class2-text">
                                    <div class="iconfont text-padding text-border-left">稀缺程度 <span
                                            class="iconfont-color">${career.prospects}</span>家公司需要
                                    </div>
                                </div>
                            </div>

                            <div clas="warp-class2">
                                <div class="leftWarp">
                                    薪资待遇
                                </div>
                                <div class="rightWarp">
                                    <div class="rightWarp-class">
                                        <div class="rightWarp-year">0-1年</div>
                                        <div class="rightWarp-wages">${career.salaryOne}k/月</div>
                                    </div>
                                    <div class="rightWarp-class">
                                        <div class="rightWarp-year">1-2年</div>
                                        <div class="rightWarp-wages">${career.salaryTwo}k/月</div>
                                    </div>
                                    <div class="rightWarp-class border-bottom">
                                        <div class="rightWarp-year">2-3年</div>
                                        <div class="rightWarp-wages">${career.salaryThree}k/月</div>
                                    </div>
                                </div>
                            </div>
                                <%--t11.css文件中的text-b属性改了没用？？--%>
                                <%--<div class="warp-class2">--%>
                                <%--<p class="text-b">有286人正在学</p>--%>
                                <%--</div>--%>
                            <div class="warp-class2">
                                <p class="text-p">有286人正在学</p>
                            </div>
                            <div class="warp-class2">
                                <p class="text-p">有286人正在学 < date:date value ="${date}"/></p>
                            </div>
                            <div class="warp-class2">
                                <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                            </div>

                            <div class="flip-container">
                                <p class="flip-title">${career.careerName}</p>
                                <p class="flip-text">${career.hint}</p>
                            </div>
                        </div>
                    </div>
                    </c:if>
                </c:forEach>
            </div>
        </c:if>
    </c:forEach>
</div>
</html>
