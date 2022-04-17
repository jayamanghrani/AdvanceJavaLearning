<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Example1:

<%!
	int a;
	String b;
	boolean c;
%>

<% 
	out.println("a="+a);  //0
	out.println("b="+b);  //null
	out.println("c="+c);  //false
%>
<br>
--------------------------------------
<br>
Ex2
<br>

<%
	int x;
	//out.println("x="+x); //error--500

%>
<br>
--------------------------------------
<br>
Ex3
<br>

<%!
	int add(int a,int b)
	{
		return a+b;
	}
%>

<%
out.println("addition -"+add(10,20));

%>
<br>
--------------------------------------
<br>
Ex4
<br>

<%!
java.util.Date today = new java.util.Date();

/* here whatever will write, will go in class level and will run only once, when obj will create for this class (whatisAllowed...jsp)
 */%>

<%
out.println("date will not changes if refresh--"+today);
%>

<!-- declarative tag me

ese variable bnaye jinka declaration ek baar hona h 
ex. counter -->





</body>
</html>