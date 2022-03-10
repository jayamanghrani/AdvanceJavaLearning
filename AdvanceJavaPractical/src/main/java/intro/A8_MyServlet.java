package intro;

interface Servlet   // getting from servlet-api.jar (javax folder)
{
	
	/*
	 * void init(ServletConfig config) throws ServletException
	 * 
	 * ServletConfig getServletConfig()
	 * 
	 * void service(ServletRequest req, ServletResponse res)throws ServletException, java.io.IOException
	 * 
	 * java.lang.String getServletInfo()
	 * 
	 * void destroy()
	 */

}

abstract class GenericServlet implements Servlet // getting from servlet-api.jar (javax folder)
{
	
	/*
	 * servlet is interface, interface is bydefault abstract , then this class
	 * should override allmethod , otherwise this class will became abstract
	 */
	
	
	/** This class overrides only 4 method , so it is abstract */
	
	/*
	 * void init(ServletConfig config) throws ServletException {}
	 * 
	 * ServletConfig getServletConfig() {}
	 * 	 * 
	 * java.lang.String getServletInfo() {}
	 * 
	 * void destroy() {}
	 */
	
	
}


abstract class HttpServlet extends GenericServlet     //from pkg  javax.servlet.http
{
	
	
	// this class is extending abstract class,  ,
	//then this class should override service() method , otherwise this class will became abstract,
	// So this class is overriding service()
	

	 

	/**
	 * void service() 
	 {
	  
	  if(req="GET")
	   doGET();
	  
	  
	  else if(req="POST")
	    doPOST();
	  	 
	  	  
	  else if(req="PUT")
	    
	    doPOST();
	    
	    else if(req="POST")
	    doPOST();
	  
	  
	   else if(req="delete")
	    doPOST();
	 * }
	 */
	
	/**
	 * protected void doGET(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOExcxeption
	 * {
		return "405 Method Not Implemented"
		
		}
	 */
	
	 /** 
	 * doPOST(....).....
	 *  {
	 *   return "405 Method Not Implemented" 
	 *   }
	 *   
	 *   doDELETE(...)....
	 *  {
	 *   return "405 Method Not Implemented" 
	 *   }
	 *   
	 *   
	 *    * doPUT(...).....
	 *  {
	 *   return "405 Method Not Implemented" 
	 *   }
	 *   
  
	 */
	
	//	And this class gave  7 method with name of doXXX(), they have body , they are not abstract,
	
//	It is good they are not abstract otherwise we will have to override in our servlet class
}





public class A8_MyServlet extends HttpServlet
{
	
	// Suppose browser sent get request, so in that case we will override doGET() only

	/**
	 * doGET() ......
	 * {
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
	
	 */
	
	
	//ServletContainer load our class by getting details from web.xml and it will create obj of our class.
		// Then it will call service method which is present in HttpServlet class
	
	// There service() will check req is GET or post , based on that it will call doGET or doPOST.
	
	
	/** Now question is kiska doGET or doPOST chlega hmara ki HttpServlet ka */
	
	// Java follow late binding, run time binding , So it will call doXXX() of our class
	// jiska obj uska method call hoga
	
	// So our method will run , and o/p deliverd to browser.
	
	//And suppose if we will not override method then Parent(HttpServlet) ka chlega 
	//and o/p jayega "405 Method Not Implemented"
	
	
	
}


/**
 * HttpServlet class doesn't any contain abstract method, and also this class has body for all method .*/


 // Then why this class made abstract by JEE developers ??
 
 /** 
 * 1.  Although they have body ,but they don't have proper body/implementation. 
 *    Their methods are throwing exception 405 Method Not Implemented
 * 
 * 
 * 2.  JEE developers want if someone is using HttpServlet class then they should provide proper implementation
 * 
 * 3.  Practically it's 7 methods are of no use . only 1 service() is useful ,which is filtereing the request
 *    and calling other method
 * 
 * 
 *4.  to agar kisine eska obj bnaaya to service() call hoga then jo method call hoga vo exception dega
 *
 * 5.  esliye JEE developers ne es class ko abstract krdiya , taki koi obj na bna paye.
 * 
 */ 

