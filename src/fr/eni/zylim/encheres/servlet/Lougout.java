package fr.eni.zylim.encheres.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Lougout
 */
@WebServlet("/Lougout")
public class Lougout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lougout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		  // TODO Auto-generated method stub
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      out.println("thanq you!!, Your session was destroyed successfully!!");
	      HttpSession session = request.getSession(false);
	      // session.setAttribute("user", null);
	      session.removeAttribute("user");
	      session.getMaxInactiveInterval();
	      session.invalidate();  
	      request.getRequestDispatcher("link.html").include(request, response);  
          out.print("You are successfully logged out!");  
                      out.close();  
	}

}
