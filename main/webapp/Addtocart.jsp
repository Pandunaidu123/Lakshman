<%@page import="com.product.CartDao"%>
<%@page import="com.product.ProductDao"%>
<jsp:useBean id="u" class="com.product.Cart"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<jsp:useBean id="u1" class="com.product.Product"></jsp:useBean>
<jsp:setProperty property="*" name="u1" />
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: #00FA9A;
}
</style>
<meta charset="ISO-8859-1">
<center>
	<title>Add to Cart page</title>
</head>
<body>
	<form action="home.html" method="post">
		<%
		int id = Integer.parseInt(request.getParameter("ProductId"));
		HttpSession hs = request.getSession();
		String userid = (String) session.getAttribute("userid");

		int i = CartDao.save(id, userid);
		if (i > 0) {
			out.println("<h1>Added to Cart Successfully</h1>");
		} else {
			response.sendRedirect("cartfail.html");
		}
		%>
		<img
			src="data:image/png;base64,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"
			alt="image" width="200px;" height="100px;" /> <br> <br>
		<button style="font-weight: bold;">Explore more. . .</button>

	</form>
	<br>
	<br>
	<form action="CartPDP.jsp?ProductId=${data.getProductId()}">
		<button style="font-weight: bold;">View Cart Details</button>
	</form>
	<br>
	<br>
	<form action="Orders.jsp" method="post">
		<button>
			<b>Orders List</b>
		</button>
	</form>
	</center>


</body>
</html>