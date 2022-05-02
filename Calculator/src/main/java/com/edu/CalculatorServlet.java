package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int ans;
		PrintWriter out=response.getWriter();
		String bn=request.getParameter("operation");
		
		switch(bn) {
		case "Add":ans=n1+n2;
		            out.println("sum of "+n1+" and "+n2+" is "+ans);
		            break;
		case "Sub":ans=n1-n2;
					out.println("Difference of "+n1+" and "+n2+" is "+ans);
				    break;
		case "Mult":ans=n1*n2;
					out.println("product of "+n1+" and "+n2+" is "+ans);
					break;
        
		case "Div":
			        if(n2==0) {
			        	out.println("Divide by zero error");
			        }
			        else {
			
			        	ans=n1/n2;
			        	out.println("Quotient of "+n1+" and "+n2+" is "+ans);
			       
			        	break;
			        }
		}
	}

}
