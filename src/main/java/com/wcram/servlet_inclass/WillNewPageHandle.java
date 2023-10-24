/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wcram.servlet_inclass;


import java.io.IOException; 
import java.io.PrintWriter; 

import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 

// Servlet implementation class FormDataHandle 

// Annotation to map the Servlet URL 
@WebServlet("/WillNewPage") 
public class WillNewPageHandle extends HttpServlet { 
	private static final long serialVersionUID = 1L; 

	// Auto-generated constructor stub 
	public WillNewPageHandle() { 
		super(); 
	} 

	// HttpServlet doPost(HttpServletRequest request, HttpServletResponse response) method 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
				
		// set the content type of response to 'text/html' 
		response.setContentType("text/html"); 
		
		// Get the PrintWriter object to write 
		// the response to the text-output stream 
		PrintWriter out = response.getWriter(); 
		
		// Print the data 
		out.print("<html><body>"); 
		out.print("<h3>Details Entered</h3><br/>"); 
                out.print("<h3>Will was here</h3><br/>"); 

//		out.print("Full Name: "+ name + "<br/>"); 
//		out.print("Phone Number: "+ phNum +"<br/>"); 
//		out.print("Gender: "+ gender +"<br/>"); 
//		out.print("Programming languages selected: "+ langSelect +"<br/>"); 
//		out.print("Duration of course: "+ courseDur+"<br/>"); 
//		out.print("Comments: "+ comment); 
//		
		out.print("</body></html>"); 
		
	} 

}
