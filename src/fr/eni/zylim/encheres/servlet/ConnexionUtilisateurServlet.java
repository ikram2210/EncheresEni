//package fr.eni.zylim.encheres.servlet;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import fr.eni.zylim.encheres.bo.Utilisateur;
//import fr.eni.zylim.encheres.dal.jdbc.UtilisateurDAOJdbcImpl;
//
///**
// * Servlet implementation class ConnexionUtilisateurServlet
// */
//@WebServlet(
//		name = "Connexion",
//
//		urlPatterns = { "/connexionutilisateur" }
//		)
//
//
//public class ConnexionUtilisateurServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ConnexionUtilisateurServlet() {
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
//		getServletContext().getRequestDispatcher("/WEB-INF/jsp/Connexion.jsp").forward(request, response);
//
//
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//
//		doGet(request, response);
//		
//
//}
//}
