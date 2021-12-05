package intro;

public class A6_ServletLifeCycle {

}


/** Servlet Life cycle-- */

/* We enter url on browser. 
 * 
 * browser send req to server , Web server forward req to application server/Servlet Container if req is dynamic.
 * 
 *1. Servlet Container load the servlet(.class file ex. MyFirstServlet.class) by getting the details from web.xml
 * 
 * 
 *2. Instantiate servlet -- means hmari servlet(MyFirstServlet) ka obj bnega then constructor call hoga.
 *	Why?
 *	Because service() in our servlet is non static , to call krne ke liye obj chaheye.
 *
 *
 *
 *3. IN our servlet(MyFirstServlet) it will search init() and called only once in the servlet life cycle.
 * 
 * 4. Then it will call service() and set o/p in browser.
 * 
 * 
 * 5. we shutdown our server (ex. in DR drill), then it will call destroy() method
 * 
 * 
 * */


// If 1000 users are using our application , then it will create 1 obj and for others it we create thread.

// before JEE , we app create using CGI(Common graphics interface) which created 1 obj for 1 req ,for 1000 it creates 1000 obj
