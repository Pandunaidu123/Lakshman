<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<center>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accept User Page</title>
	</head>
	<body>
		<h1>Verifying Details</h1>
		<form action="home.html" method="post">

			<jsp:useBean id="snr" class="com.ecom.ValidateUser" />


			<jsp:setProperty name="snr" property="user" />
			<jsp:setProperty name="snr" property="pass" />


			<h4>Your details...</h4>
			<br>
			<p>
				Username :
				<jsp:getProperty name="snr" property="user" /></p>
			<p>
				Password :
				<jsp:getProperty name="snr" property="pass" /></p>


			<%
			if (snr.validate("GeeksforGeeks", "Pandu")) {
			%>
			Welcome! You are a VALID USER<br />
			<br><br> <input type="submit" value="Let's Go..">
			<%
			} else {
			%>
			<form action="acceptuser.jsp" method="post">
			<br><br> <input type="submit" value="Please try Again...">
			</form>
			Error! You are an INVALID USER<br />
			
			<%
			
			}
			%>
			
		</form>
	</body>
</center>
</html>
