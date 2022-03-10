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


<!-- Life cycle

1. translation of jsp to servlet code. (when first request come , if our jsp is date.jsp then server make date_jsp.java)

2. compilation of servlet to bytecode (date_jsp.java to date_jsp.class this happens on first req only. )

3. load servlet class (this happens on first req  and if we will restart server)

4. create servlet obj (this happens on first req only and if we will restart server)

5. call jspInit()  (this happens on first req only.)

6. call jspService()  (this happens on every req)

7. jspDestroy () 


And if we modified our jsp page then steps(1-6)




-->
