<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>

<%--  Types of Jsp Element

1. JSP Tag---to add java (scriplet, Declarative, Expression)

all these tag will go inside jspInit(), jspService()

a. scriplets vala code java compiler ke pass jata h 

ex. <%  
		String name="Jaya";		
	%>

Inside scriplet--
1. decl var
2. create obj of other class
3. run a loop
4. call method
5. call static methods
6. declare static variable----No, because scriplet ka code method ke andr jata h , static var class level pe bnte h 
							method ke andr nhi.
7. define method---No
8. can write html---No

then how can we generate html output from scriplet , because browser to sirf html smjhta h 	

Solution -- By predefine object called out.

out.println(<p>Hello</p>);

ye out jspWriter ka obj h , jab ye code method ke andr jayega to PrintWriter ke andr chla jayega.


	Example :--datetime.jsp			





2. JSP Directive---to include file (page, taglib, include )--%>



