<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayDateTime</title>
<style>
div
{
border:solid 2px crimson;
}
</style>

</head>
<body>

<% 
 java.util.Date today= new java.util.Date();
out.println("<div>Date and time at the server: -- "+today+"</div>");
%>

</body>
</html>




<!-- ye scriplet ka code jspService() method ke andr jake paste hoga

Also we can create any no. of scriptlet in our code

 -->

<!--  We will find jsp translated servlet at below path -
 D:\My Eclipse Workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\AdvanceJavaPractical\org\apache\jsp -->