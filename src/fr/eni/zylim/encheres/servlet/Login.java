//package fr.eni.zylim.encheres.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.security.InvalidAlgorithmParameterException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.security.spec.InvalidKeySpecException;
//import java.sql.Connection;
//import java.util.List;
//import java.*;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//
//import fr.eni.zylim.encheres.bll.UtilisateurManager;
//import fr.eni.zylim.encheres.bo.Utilisateur;
//
//import fr.eni.zylim.encheres.dal.jdbc.UtilisateurDAOJdbcImpl;
//
///**
// * Servlet implementation class Login
// */
//@WebServlet(name = "login", urlPatterns = { "/Login" })
//public class Login extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public Login() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
////		RequestDispatcher dispatcher //
////		= this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
////
////dispatcher.forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//doGet(request, response);
//		 request.getRequestDispatcher("/WEB-INF/jsp/AccountUtil.jsp").include(request, response);  
//		PrintWriter out = response.getWriter();
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		// recuperer l'utilisateur en cours
//		Utilisateur user = UtilisateurManager.getInstance().getUtilisateurProfile(userName);
//
//		System.out.println("Utilisateur  profile: " + user);
//
//		// Déposer les objets nécessaires aux composants suivants
//		request.setAttribute("Utilisateur", user);
//
//		if (userName.equals(user.getPseudo()) && password.equals(user.getMot_de_passe())) {
//
//			out.print("Welcome, " + userName);
//			HttpSession session = request.getSession(true); // reuse existing
//			// session if exist
//			// or create one
//			session.setAttribute("user", userName);
//			session.setMaxInactiveInterval(30); // 30 seconds
//			//response.sendRedirect("encheres/WEB-INF/jsp/AccountUtil.jsp");
//	         RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/AccountUtil.jsp");
//				dispatcher.forward(request, response);
//		} else {
//			//getServletContext().getRequestDispatcher("/WEB-INF/jsp/Accueil.jsp").forward(request, response);
//			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/Connexion.jsp");
//			out.println("<font color=red>Identifiant ou mot de passe incorrect.  .</font>");
//		rd.include(request, response);
//		} // TODO Auto-generated method stub
//
//	}
//
//}
