package fr.eni.zylim.encheres.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DetailVenteServlet
 */
@WebServlet("/detailventeservlet")
public class DetailVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailVenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//TODO if selon utilisateur connecté ou non 
		//getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vendu.jsp").forward(request, response);


		//TODO faire un if pour le choix de la jsp en fo,nction de l'état de vente
		
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/Vendu.jsp").forward(request, response);
		//getServletContext().getRequestDispatcher("/WEB-INF/jsp/DetailVente.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
