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
C:\jaya\Jaya's Workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\AdvanceJavaPractical\org\apache\jsp\jspLearningWithPractical  (A5_005fdatetime_jsp)--> 
 
 
 
<!-- Container will translate this jsp in servlet and copy code in _jspService like below code-
 -->
<!--public void _jspService()
{
 out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>DisplayDateTime</title>\r\n");
      out.write("<style>\r\n");
      out.write("div\r\n");
      out.write("{\r\n");
      out.write("border:solid 2px crimson;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
 
 java.util.Date today= new java.util.Date();
out.println("<div>Date and time at the server: -- "+today+"</div>");

      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ye scriplet ka code jspService() method ke andr jake paste hoga\r\n");
      out.write("\r\n");
      out.write("Also we can create any no. of scriptlet in our code\r\n");
      out.write("\r\n");-->
 }