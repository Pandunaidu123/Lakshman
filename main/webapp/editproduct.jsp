<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product Here...</title>
</head>
<body>

<%@page import="com.product.ProductDao"%>  
<jsp:useBean id="u" class="com.product.Product"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=ProductDao.update(u);  
response.sendRedirect("viewadddedproducts.jsp");  
%>  

</body>
</html>S