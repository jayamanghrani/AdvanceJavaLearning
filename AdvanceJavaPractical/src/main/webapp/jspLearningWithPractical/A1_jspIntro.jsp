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


<!-- jsp Introduction

jsp = html+java

JSP stands for Java Server pages. 

ye exactly vahi krta h vo servlet krta h  i.e dynamic o/p generate krna

Now, When we have servlet why we are using jsp??? why 2 technology?


Drawbacks in servlet

1. when we create servlet, we have to inherit Httpservlet/GenericServlet class

2. we have to override method (service in case of generic and doXXX in case of http)

3.need to create web.xml and servlet entry in web.xml 

4. many mistake

5. if we have change something , then again we need to re-deploy code.

6. in servlet we write html and java(java me html likhte h ), servlet bnana bna anoying ho jata h ese

So,We should use jsp
-->


<!--- But there is some work , which should be done by servlet only and some work should be done by jsp only.

This we will understand by MVC design pattern (the correct way of writing the code)
 -->




<!-- Technical discussion of jsp -->

<!-- 1. size of jsp is less than servlet.
	2. HTML ke andar java dal sakte h by tag.
	3.jsp automatic compiled (tomcat first convert jsp into servlet then compiled by tomcat/container).
	4. every jsp is internally a servlet 
	5. web.xml not required
	6. need not to redploy after changes

 -->


<!-- First code of jsp in Notepad/ without IDE 

1. create folder inside tomcat webapps folder(datetimejsp)-
C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\datetimejsp----inside this ----datetime.jsp 
(

<html>
<head>
<title>Date Time JSP</title>
</head>

<body>

<h3>Current date and time</h3>
<span style='color:crimson'><%= new java.util.Date() %></span>
</body>

</html>
)



write your jsp code and save it .

start server then  open browser type your url(http://127.0.0.1:2021/datetimejsp/datetime.jsp), will get output.

if we make any changes , need not to redeploy
-->



<!--Important note= our jsp is first converted into servlet 

If we create jsp using notepad/inside tomcat folder then container will create servlet and its .class file at below path 
path -- C:\Program Files\Apache Software Foundation\Tomcat 8.5\work\Catalina\localhost\datetimejsp\org\apache\jsp ------here servlet code and  .class file of our jsp

If you deploy your application via eclipse (and not via EAR file using the weblogic console)
the compiled JSPs will be in <workspace>\.metadata\.plugins\org.eclipse.wst.server.core\tmp<some digit>\<domain name>\work\<app name>\jsp_servlet

If WebLogic is compiling JSP (i.e. if you are not precompiling them), they should be located under domain_name/servers/server-name-1/tmp/_WL_user .

servlet and byte code -->

