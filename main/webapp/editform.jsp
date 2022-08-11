<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.product.ProductDao,com.product.Product"%>  
  
<%  
String id=request.getParameter("id");  
Product u=ProductDao.getRecordById(Integer.parseInt(id));  
%>  
  
<h1>Edit Form</h1>  
<form action="editproduct.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getProductId() %>"/>  
<table>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= u.getName()%>"/></td></tr>  
<tr><td>Price:</td><td>  
<input type="text" name="price" value="<%= u.getPrice()%>"/></td></tr>  
<tr><td>Url:</td><td>  
<input type="text" name="url" value="<%= u.getUrl()%>"/></td></tr>  
<tr><td>Description:</td><td>  
<input type="text" name="descr" value="<%= u.getDescr()%>"/></td></tr>  
<tr><td>Category:</td><td>  
<input type="text" name="cat" value="<%= u.getCat()%>"/></td></tr>  
<tr><td colspan="2"><input type="submit" value="Edit Product"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  