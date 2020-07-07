package com.remkohde.hello;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class HelloServlet extends HttpServlet {
public void doGet(HttpServletRequest request, 
  HttpServletResponse response) 
  throws ServletException, IOException {
  
  PrintWriter out = response.getWriter();
  out.println("<HTML>");
  out.println("<HEAD>");
  out.println("<TITLE>Hello Servlet</TITLE>");
  out.println("</HEAD>");
  out.println("<BODY>");
  out.println("Hello Servlet");
  out.println("</BODY>");
  out.println("</HTML>");
 }
}

