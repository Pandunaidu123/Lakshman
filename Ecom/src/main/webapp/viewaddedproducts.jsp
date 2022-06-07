<!DOCTYPE html>

<%@page import="com.product.ProductDao, com.product.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<center>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Products</title>
</head>
<body>


	<h1>Products List</h1>

	<%
	List<Product> list=ProductDao.getAllRecords("cat");  
	request.setAttribute("list", list);
	System.out.println(list);
	%>

	<table border="1" width="100%">
		<tr><td>
			<th>ProductId</th>
			<th>Name</th>
			<th>Price</th>
			<th>Url</th>
			<th>Description</th>
			<th>Category</th>
			<th>Edit</th>
			<th>Delete</th>
		</td></tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getProductId()}</td>
				<td>${u.getName()}</td>
				<td>${u.getPrice()}</td>
				<td>${u.getUrl()}</td>
                <td>${u.getDescr()}</td>
                <td>${u.getCat()}</td>
	
				
				<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>
				<td><a href="deleteproduct.jsp?id=${u.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="AddProduct.html">Add New Product</a>

</body>
</center>
</html>
