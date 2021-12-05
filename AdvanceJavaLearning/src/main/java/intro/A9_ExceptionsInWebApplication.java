package intro;

public class A9_ExceptionsInWebApplication {

}




// 1. 404 status code --it is not exception

/** 404 means Resource Not found (Mil nhi rha)*/

/*
 * Web.xml na ho
 * 
 * web.xml galat path pe ho
 * 
 * web.xml me servlet ka name galat likha ho
 * 
 * web.xml me jo servlet ka name likha ho vo servlet present na ho
 * 
 * web.xml me url pattern galat likha ho
 * 
 * browser me galat url hit kr rhe ho
 */




//2. 500  status code ---ye exception h

/** 500 means -programmer mistake */

/*
 * jab conatiner servlet ko chla napaye, servlet me kuch esa code likha ho jo exception de rha.
 * 
 * ex. hmare servlet me 10/0 likha h , to code se ArithmeticException aayegi, To servlet me exception means 
 * 500 status code from servletContainer
 * 
 * ex2- we are connecting DB , while connection we got SQLException then servletContainer will give 500 status code
 * 
  
 * 
 */


//3. 405 status code --it is exception also output Method not implemented

/*
 * when we doesn't override doXXX()
 * 
 * When we haven't oveeride correct doXXX()
 * 
 * ex req is get and we have override doPOST()
 */



