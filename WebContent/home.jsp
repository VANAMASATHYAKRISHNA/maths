<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%int i=Integer.parseInt(request.getParameter("a"));
int sqr=getsquare(i);
%>
<%! int getsquare(int i)
{
	return i*i;
	}
	%>
<%="square of number="+sqr%>

</body>
</html>