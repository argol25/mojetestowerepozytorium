<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <spring:url value="/WEB-INF/my-resources/css/bootstrap.min.css" var="mainCss" />
    <spring:url value="/WEB-INF/my-resources/js/bootstrap.min.js" var="mainJs" />
    
    <link href="${mainCss}" rel="stylesheet" />
    <script src="${mainJs}"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    
    
       
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Test</title>
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    
    
  </body>
</html>