<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<base href="<%=basePath%>">
<title>网站入口</title>
</head>
<body>
	 <%-- <jsp:forward page="/WEB-INF/public/index.jsp"></jsp:forward> --%>
	 <%-- <jsp:forward page="/WEB-INF/public/register.jsp"></jsp:forward>  --%>
	 <jsp:forward page="/WEB-INF/test/test.jsp"></jsp:forward>
</body>
</html>