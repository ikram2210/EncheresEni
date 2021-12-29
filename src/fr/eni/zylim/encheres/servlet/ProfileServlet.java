//package fr.eni.zylim.encheres.servlet;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import fr.eni.zylim.encheres.bll.UtilisateurManager;
//import fr.eni.zylim.encheres.bo.Utilisateur;
//
///**
// * Servlet implementation class profile
// */
//@WebServlet("/profile")
//public class ProfileServlet extends HttpServlet {
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// Appel les traitements métier :
//		// recuperer la liste de tous les utilisateur
//		
//	
//		PrintWriter out = response.getWriter();
//
//		HttpSession session = request.getSession(false);
//		String name = (String) session.getAttribute("name");
//		Utilisateur user = UtilisateurManager.getInstance().getUtilisateurProfile(name);
//		// Déposer les objets nécessaires aux composants suivants
//		request.setAttribute("userprofile", user);
//		out.print("Hello, " + name + " Welcome to Profile");
//		response.setContentType("text/html");
//		
//		request.getRequestDispatcher("/WEB-INF/jsp/Profil.jsp").include(request, response);  
//		System.out.println("pseudo Utilisateur est : " + name);
//		
//		
//	
//		if (session != null) {
//			
//		} else {
//			out.print("Please login first");
//			request.getRequestDispatcher("login.html").include(request, response);
//		}
//		out.close();
//	}
//}
