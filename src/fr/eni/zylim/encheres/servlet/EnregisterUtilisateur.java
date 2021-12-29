//package fr.eni.zylim.encheres.servlet;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import fr.eni.zylim.encheres.bo.Utilisateur;
//import fr.eni.zylim.encheres.dal.jdbc.UtilisateurDAOJdbcImpl;
//
///**
// * Servlet implementation class EnregisterUtilisateur
// */
//@WebServlet(
//		urlPatterns = { "/EnregisterUtilisateur" }, 
//		name = "EnregisterUtilisateur")
//public class EnregisterUtilisateur extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private UtilisateurDAOJdbcImpl utilisateurDAOjdbcimpl; 
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public EnregisterUtilisateur() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//    public void init() {
//		utilisateurDAOjdbcimpl = new UtilisateurDAOJdbcImpl();
//    }
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	
//			String pseudo = request.getParameter("pseudo");
//			String firstName = request.getParameter("nom");
//			String lastName = request.getParameter("prenom");
//			String email = request.getParameter("email");
//			String telephone = request.getParameter("telephone");
//			String rue = request.getParameter("rue");
//			String code_postal = request.getParameter("code_postal");
//			String ville = request.getParameter("ville");
//			String password = request.getParameter("mot_de_passe");
//		int credit= Integer.parseInt(request.getParameter("credit"));
//
//
//			Utilisateur user = new Utilisateur();
//			user.setPseudo(pseudo);
//			user.setNom(firstName);
//			user.setPrenom(lastName);
//			user.setEmail(email);
//			user.setTelephone(telephone);
//			user.setRue(rue);
//			user.setCode_postal(code_postal);
//			user.setVille(ville);
//			user.setMot_de_passe(password);
//			user.setCredit(credit);
//			//user.setAdministrateur(false);
//			 try {
//				 utilisateurDAOjdbcimpl.insertUtilisateur(user);
//		        } catch (Exception e) {
//		            // TODO Auto-generated catch block
//		            e.printStackTrace();
//		        }
//
//		        response.sendRedirect("employeedetails.html");
//		    
//
//		}
//	}
//
//
