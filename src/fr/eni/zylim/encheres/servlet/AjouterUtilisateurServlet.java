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
//import javax.servlet.http.HttpSession;
//
//import fr.eni.zylim.encheres.bll.UtilisateurManager;
//import fr.eni.zylim.encheres.bo.Utilisateur;
//import fr.eni.zylim.encheres.dal.DALException;
//
//import fr.eni.zylim.encheres.bo.Utilisateur;
//import fr.eni.zylim.encheres.dal.jdbc.UtilisateurDAOJdbcImpl;
//
///**
// * Servlet implementation class AjouterUtilisateurServlet
// */
//@WebServlet(name = "ajouterutilisateur",
//
//		urlPatterns = { "/ajouterutilisateur" })
//public class AjouterUtilisateurServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//
//	public AjouterUtilisateurServlet() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp").forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher dispatcher =  getServletContext().getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp");
////		dispatcher.forward(request, response);
//		
//		Utilisateur utilisateur = null;
//		
//		String nom = request.getParameter("nom");
//		String prenom = request.getParameter("prenom");
//		String pseudo = request.getParameter("pseudo");
//		String email = request.getParameter("email");
//		String mot_de_passe = request.getParameter("mot_de_passe");
//		String mot_de_passe_confirmation = request.getParameter("mot_de_passe_confirmation");
//		String telephone = request.getParameter("telephone");
//		String rue = request.getParameter("rue");
//		String ville = request.getParameter("ville");
//		String code_postal = request.getParameter("code_postal");
//		
//		List<String> allPseudos;
//
//		try {
//			allPseudos = UtilisateurManager.selectAllPseudos();
//
//
//
//		if(nom.length()==0 || nom.isEmpty() ) {
//			request.setAttribute("erreur", "Le nom n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}	
//		else if (prenom.length()==0 || prenom.isEmpty() ) {
//			request.setAttribute("erreur", "Le pr�nom n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}
//		else if (pseudo.length()==0 || pseudo.isEmpty() ) {
//			
//			request.setAttribute("erreur", "Le pseudo n'a pas été renseigné, veuillez le saisir ...");			
//			dispatcher.forward(request, response);
//		}
//		else if (allPseudos.contains(pseudo)) {
//			request.setAttribute("erreur", "Ce pseudo est déjà utilisé, veuillez le saisir ...");
//								
//			dispatcher.forward(request, response);
//		}
//		else if (email.length()==0 || email.isEmpty() ) {
//			request.setAttribute("erreur", "L'email n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}
//		else if (mot_de_passe.length()==0 || mot_de_passe.isEmpty() ) {
//			request.setAttribute("erreur", "Le mot de passe n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}
//		else if (rue.length()==0 || rue.isEmpty() ) {
//			request.setAttribute("erreur", "La rue n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}
//		else if (ville.length()==0 || ville.isEmpty() ) {
//			request.setAttribute("erreur", "La ville n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}
//		else if (code_postal.length()==0 || code_postal.isEmpty() ) {
//			request.setAttribute("erreur", "Le code postal n'a pas été renseigné, veuillez le saisir ...");
//			dispatcher.forward(request, response);
//		}
//		else if (mot_de_passe_confirmation.equals(mot_de_passe)) {
//		
//			utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe);
//			utilisateur = UtilisateurManager.inscriptionUtilisateur(utilisateur);
//		}
//
//			if (utilisateur != null) {
//				HttpSession session = request.getSession();
//				session.setAttribute("ConnectedUser", utilisateur);
//			} 
//			else 
//			{
//				request.setAttribute("erreur", "Aucun utilisateur");
//				dispatcher.forward(request, response);
//			}
//			
//			this.getServletContext().getRequestDispatcher("/connexionutilisateur").forward(request, response);
//		} catch (DALException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}		
//	}
//}
//
