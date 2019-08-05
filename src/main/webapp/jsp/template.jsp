<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<head>
    <title>
        <tiles:insertAttribute name="title"/>
    </title>
</head>
<header>
    <tiles:insertAttribute name="header"/>
</header>
<main>
    <tiles:insertAttribute name="body"/>
</main>
<footer>
    <tiles:insertAttribute name="footer"/>
</footer>
