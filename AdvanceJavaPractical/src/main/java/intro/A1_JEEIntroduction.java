package intro;

public class A1_JEEIntroduction {

}


//JEE--Jakarta Enterprise edition (Eclipse foundation control JEE, earlier oracle was controlling)
// latest version -9.0 in 2021

/** java based platform
 * Used for web application
 * secure
 * scalable 
 **/


/*
 * For every Web Application ,we need server
 * 
 * Server are of two types- 
 * 1. Web server (ex. Apache) 2. Application server/Engine/Servlet Container 
 * 
 * 
 * Web server- lives in server, serve static page
 * Application server-lives in web server , serve dynamic request
 * 
 * 
 * For java lang we can use servers -- Apache tomcat (Apache) , GlassFish (Oracle), 
 * 										Weblogic (Oracle), JBoss (RedHat),  Websphere(IBM)
 * 
 * 
 * For python- Apache Ngnx
 * 
 */




//Difference b/w JSE and JEE
/**
 * JSE --Core Java
 * 
 * 1. Code(java prog with main method)
 * 
 * 2.JDK compiler will compile code
 * 
 * 3.After compilation byte code will generate.
 * 
 * 4.JRE will run and it will call JVM
 * 
 * 5. JVM call main method
 * 
 */


/**
 * JEE--Adv java
 * 
 * 1. Servlet code (Program without main method) 
 * 
 * 2. JDK compiler will compile code
 * 
 * 3.After compilation byte code will generate.(this bytecode doen't contain main method)
 * 
 * 4. We will start server
 * 
 * 5 we will run code on our system via.browser ,The request sent by browser  is received by a software WEB SERVER.
 * 	which we have started.
 * 
 * 6. Webserver (Apache) --will serve (html, css,js files) and if request is for dynamic page 
 * then WEB SERVER forward request to another server called Application server.
 * 
 * 7.Application server/Engine/Servlet Container(Tomcat) ---(contain JVM ) will server dynamic pages
 * 
 * 
 * 
 * 
 */



