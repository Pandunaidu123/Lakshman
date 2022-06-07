<%@page import="com.product.ProfDao"%>
<jsp:useBean id="u" class="com.product.Prof"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<%

int i = ProfDao.save(u);
if(i > 0){
	response.sendRedirect("Pr.html");
} else {
	response.sendRedirect("pf.html");
}
%>
