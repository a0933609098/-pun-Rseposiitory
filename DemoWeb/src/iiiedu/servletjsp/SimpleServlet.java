package iiiedu.servletjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("*.do")
public class SimpleServlet extends HttpServlet {
	
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException ,IOException{
	  System.out.println("doget()方法印出的訊息");
   }
   protected void doPost(HttpServletRequest req,HttpServletResponse resp)
   	  throws ServletException,IOException{
	  System.out.println("dopost()方法印出的訊息"); 
	   
	   
	   
   }
   
 }

