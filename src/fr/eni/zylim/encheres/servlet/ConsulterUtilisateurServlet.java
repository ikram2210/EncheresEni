//package fr.eni.zylim.encheres.servlet;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import fr.eni.zylim.encheres.bll.BLLException;
//import fr.eni.zylim.encheres.bll.UtilisateurManager;
//import fr.eni.zylim.encheres.bo.Utilisateur;
//
///**
// * Servlet implementation class ConsulterUtilisateurServlet
// */
//@WebServlet("/consulterutilisateur")
//public class ConsulterUtilisateurServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ConsulterUtilisateurServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//
//
//					Utilisateur utilisateur;
//					UtilisateurManager.getInstance();
//					utilisateur = UtilisateurManager.getUtilisateurById(3);
//					System.out.println(utilisateur);
//
//
//				
//				getServletContext().getRequestDispatcher("/WEB-INF/jsp/Profil.jsp").forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
