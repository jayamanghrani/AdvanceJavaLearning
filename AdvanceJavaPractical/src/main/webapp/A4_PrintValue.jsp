<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Printing variable value</title>
</head>
<body>

<%!
 	int a;

	int add(int x, int y)
	{
		return x+y;
	}

%>

<%  
	int b;
out.println(" a is class level variable , it has default value "+a);  /* 0 */

out.println("<br> b is method variable , doesn't have default value for b ");

/* out.println("value of b is "+b); */  /*Error--> The local variable b may not have been initialized */

		
		 out.println("<br>sum is"+add(2,3));
%>



</body>
</html>