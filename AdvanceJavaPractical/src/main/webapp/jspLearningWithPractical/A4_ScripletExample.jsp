<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Date and time </title>
</head>

<body>
<%
	java.util.Date today=new java.util.Date();
	 
	for(int i=0;i<10;i++)	
%>

<%
{
	out.println("Date and time at the servet <strong>"+today+"</strong>");
}
%>




 
 </body>

</html>



<!-- we can create multiple scriplet in jsp

conatiner will copy code from all scriplet and paste  it into _jspService method


public void _jspService(...)
{
	java.util.Date today=new java.util.Date();
	 
	for(int i=0;i<10;i++)
	{	
		out.println("Date and time at the servet <strong>"+today+"</strong>");
	}

}




-->
