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
// * Servlet implementation class UpdateUtilisateur
// */
//@WebServlet(name = "UpdateUtilisateur",
//
//urlPatterns = { "/UpdateUtilisateur" })
//public class UpdateUtilisateur extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private UtilisateurDAOJdbcImpl utilisateurDAOjdbcimpl; 
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public UpdateUtilisateur() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//    public void init() {
//		utilisateurDAOjdbcimpl = new UtilisateurDAOJdbcImpl();
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		// Recupere la session
//			
//		Utilisateur use=(Utilisateur) request.getSession(false).getAttribute("userlogin");
//		
//		int credit =use.getCredit();
//		int no_utilisateur =use.getNo_utilisateur();
//		String pseudo = request.getParameter("pseudo");
//		String firstName = request.getParameter("nom");
//		String lastName = request.getParameter("prenom");
//		String email = request.getParameter("email");
//		String telephone = request.getParameter("telephone");
//		String rue = request.getParameter("rue");
//		String code_postal = request.getParameter("code_postal");
//		String ville = request.getParameter("ville");
//		String password = request.getParameter("mot_de_passe");
//		
//	
//	
//		Utilisateur user = new Utilisateur();
//		user.setPseudo(pseudo);
//		user.setNom(firstName);
//		user.setPrenom(lastName);
//		user.setEmail(email);
//		user.setTelephone(telephone);
//		user.setRue(rue);
//		user.setCode_postal(code_postal);
//		user.setVille(ville);
//		user.setMot_de_passe(password);
//		user.setCredit(credit);
//		user.setAdministrateur(false);
//		user.setNo_utilisateur(no_utilisateur);
//		 try {
//			 utilisateurDAOjdbcimpl.updateUtilisateur(user);
//	        } catch (Exception e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	        }
//
//	        response.sendRedirect("employeedetails.html");
//	    
//	}
//
//}
