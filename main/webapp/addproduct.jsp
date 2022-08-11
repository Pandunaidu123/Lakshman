<%@page import="com.product.ProductDao"%>
<jsp:useBean id="u" class="com.product.Product"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<center>
	<a href="viewaddedproducts.jsp">View All Records</a><br />
</center>
<%
int i = ProductDao.save(u);
if (i > 0) {
	out.println("<center><h3>Product added successfully. .  !" + "</h3></center>");
} else {
	out.println("<center><h3>Sorry, an error occurred!" + "</h3></center>");
	response.sendRedirect("AddProduct.html");
}
%>
