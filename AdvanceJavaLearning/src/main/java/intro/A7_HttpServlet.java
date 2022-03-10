package intro;

public class A7_HttpServlet {

}

//HttpServlet ki khani

//We have Generic servlet then why new class HttpServlet ??
		
		/* There are drawbacks in generic servlet
		 * 
		 *  from HTMl we pass get or post, but for both req it will call service method, This designing is not good
		 *   		   
		 *  */
		/**
		 * then they gave HttpServlet class 
		 *   
		 *  Browser follow Http Protocol, so JEE provides one class HttpServlet 
		 *  
		 *  Also they gave 7 methods in this class based on http req name 
		 *  
		 *  mostly we use doGet() or doPost() method, other method used in testing.
		 *  
		 *  
		 */


// When we receive get request?
		/*
		 * 1. when we enter url directly by hand 
		 * 2. when we click <a> or link 
		 * 3. when we pass method="get"
		 */

//When we receive post request?
		/* when we pass method="post" */
	