<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
  int a;  /*we can declare var in this, this code will paste before jspService method means at class level*/
  
  java.util.Date date= new java.util.Date();

%>
<% 
out.println("a="+a);

out.print(date); /* whenever we will run this code , date and time will be fixed , no changes,
					because we are taking date from class level location */
%>

</body>
</html>