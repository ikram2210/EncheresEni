//package fr.eni.zylim.encheres.servlet;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//import fr.eni.zylim.encheres.bll.UtilisateurManager;
//import fr.eni.zylim.encheres.bo.Utilisateur;
//
///**
// * Servlet implementation class visualisationUtilisateurServlet
// */
//@WebServlet(
//		name = "visualisationUtilisateurServlet",
//		urlPatterns = { "/visualisationUtilisateurServlet" }
//		)
//public class visualisationUtilisateurServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public visualisationUtilisateurServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// 
//		
//				// Appel les traitements métier :
//				// recuperer la liste de tous les utilisateur
//				List<Utilisateur> listeUtilisateurs = UtilisateurManager.getInstance().listeUtilisateurs();
//				
//				System.out.println("mesUtilisateur : " + listeUtilisateurs);
//				
//				// Déposer les objets nécessaires aux composants suivants
//				request.setAttribute("mesUtilisateur", listeUtilisateurs);
//				
//				// Navigation vers composant suivant
//				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/Utilisateur.jsp");
//				dispatcher.forward(request, response);
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
