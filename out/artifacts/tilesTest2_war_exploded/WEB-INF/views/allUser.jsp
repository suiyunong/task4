<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
    pageContext.setAttribute("path",request.getContextPath());
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring MVC Hello World</title>
    <link href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
</head>

<body>
<h2>All Students in System</h2>
<div class="row">
    <div class="col-md-4 col-md-offset-1">
        <a class="btn btn-primary" href="${path}/user/toAddUser">新增</a>
    </div>
    <div class="col-md-4 col-md-offset-1">
        <a class="btn btn-primary" href="${path}/user/toFindById">查询学生</a>
    </div>
</div>




<table border="1">
    <tr>
        <th>Id</th>
        <th>姓名</th>
        <th>qq号</th>
        <th>修真类型</th>
        <th>入学时间</th>
        <th>毕业学校</th>
        <th>线上学号</th>
        <th>日报链接</th>
        <th>口号</th>
        <th>辅导师兄</th>
        <th>创建时间</th>
        <th>更新时间</th>
        <th>操作</th>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.qq}</td>
            <td>${user.type}</td>
            <td>${user.entro_time}</td>
            <td>${user.school}</td>
            <td>${user.number}</td>
            <td>${user.diary_link}</td>
            <td>${user.slogan}</td>
            <td>${user.brother}</td>
            <td>${user.create_at}</td>
            <td>${user.update_at}</td>
            <td>
                <a type="button"  href="${path}/user/toUpdate?id=${user.id}" class="btn btn-info btn-sm">
                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                    编辑</a>
                <form action="${pageContext.request.contextPath}/user/delUser?id=${user.id}" method="post">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="删除">
                </form>

            </td>
        </tr>

    </c:forEach>
</table>
<table>
    <tr items="${page}">
        <form method="GET" action="${pageContext.request.contextPath}/user/page">
            <td><input type="hidden" name="page" value="1"></td>
            <td><input type="submit" value="首页"></td>
        </form>
        <form method="GET" action="${pageContext.request.contextPath}/user/page">
            <td><input type="hidden" name="page" value="${page.prefPage}"></td>
            <td><input type="submit" value="上一页"></td>
        </form>
        <td>当前：第${page.currentPage}页<--></td>
        <td>共：${page.totalPages}页</td>
        <form method="GET" action="${pageContext.request.contextPath}/user/page">
            <td><input type="hidden" name="page" value="${page.nextPage}"></td>
            <td><input type="submit" value="下一页"></td>
        </form>
        <form method="GET" action="${pageContext.request.contextPath}/user/page">
            <td><input type="hidden" name="page" value="${page.totalPages}"></td>
            <td><input type="submit" value="尾页"></td>
        </form>
    </tr>
</table>
<form method="GET" action="${pageContext.request.contextPath}/user/page">
    <table>
        <tr>
            <td>跳转到第:<input type="text" name="page" size="10"/>页</td>
            <td><input type="submit" value="确定"></td>
        </tr>
    </table>
    </form>
</body>
</html>