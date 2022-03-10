package intro;

public class A5_CreatingServletWithoutIDE {

}


/** Step 1 */

/* 1. create servlet on notepad .
 

 import javax.servlet.*;  // to get GenericServlet class
import java.io.*;        //  service method throw ServletException and IOEXception 

public class MyFirstServlet extends GenericServlet
{

public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOEXception

{
  resp.setContentType()  //recommended- we are informing browser that resp is in html form, 
  		morden browser know this ,but this is for old browser 



		// ServletResponse  obj having a  buffer, we have to copy our content in buffer.
		 beacuse servletContainer buffer se data lekr browser ko deta h
		// and that buffer is also an obj of PrintWriter
				
  PrintWriter pw= resp.getWriter(); //getWriter returns obj of buffer
		
		//Now our code has connected with buffer and jo buffer me likhenge (using its reference pw) vo browser ke pass jayega
		 //And browser ko sirf html smjh aati to hmm html likhenge.
		
		
		
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>My First Servlet</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<strong>Welcome to the world of servlet </strong>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
		
 }


}

  */


/** Step2 */
/* save this code on any location and compile the code */

/*filename-"MyFirstServlet.java"
code(.java class )location-D:\My Eclipse Workspace\JakartaEEServlets*/


/*
 * compile-
 * 
 * D:\My Eclipse Workspace\JakartaEEServlets---javac MyFirstServlet
 * 
 * error-error: package javax.servlet does not exist
 * 
 * because we are using javax.servlet and it is not part of JDK. It is inside tomcat
 * 
 * Now we will download tomcat, then will add jar file in environment variables-
 * 
 * Classpth set---C:\Program Files\Apache Software Foundation\Tomcat 8.5\lib\servlet-api.jar
 * 
 * now close command prompt and then open ,because cmd reads classpath when it open.
 * 
 * again compile code--Now byte code is ready
 */

/** Step3 */

/* Now create proper directory structure 
 * 
 * C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\jayaKeServlet\WEB-INF\classes
 * 
 * Inside classes folder we have to place bytecode
 * path for byte code is where compiled the code -D:\My Eclipse Workspace\JakartaEEServlets
 * 
 * 
 * inside classes- MyFirstServlet.class
 * 
 * inside WEB-INF---create web.xml file
 * 
 * 
 * <web-app>

		<servlet>
				<servlet-class>MyFirstServlet</servlet-class>
				<servlet-name>MyFirstServlet</servlet-name>
		
		</servlet>
		
		<servlet-mapping>				
				<servlet-name>MyFirstServlet</servlet-name>
				<url-pattern>/MyFirstServlet</url-pattern>
		</servlet-mapping>
	

</web-app>
 * 
 * 
 * Note: urlpattern me / lgana mat bhulna otherwise error aayegi , tomcat start nhi hoga
 * 
 * 
 * 
 * */


/** Step4 */
/*
 * Start tomcat server from C:\Program Files\Apache Software Foundation\Tomcat 8.5\bin
 * 
 * 
 * 
 * Run your web application
 * 
 * htttp://localhost:2021/jayaKeServlet/MyFirstServlet
 * 
 * O/p -- Welcome to the world of servlet in browser
 */
