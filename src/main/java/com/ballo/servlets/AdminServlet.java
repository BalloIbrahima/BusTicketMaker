package com.ballo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ballo.entity.*;
import com.ballo.dao_implentation.*;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired 
	PasswordEncoder encoder;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/pages/dashboard/admin.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		//doGet(request, response);
		if(request.getParameter("creerbtn")!=null) {
			UtilisateurDaoImpl dao=new UtilisateurDaoImpl();
			System.out.println("ddddd");
			
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String pseudo=request.getParameter("pseudo");
			String motDePasse=nom+prenom;
//			encoder.encode(motDePasse);
			Utilisateur user=new Utilisateur(nom,prenom,pseudo,motDePasse);
			//verification de la presence d'un utilisateur avec le meme pseudo
			Utilisateur userVerif=dao.parPseudo(pseudo);
			if(userVerif!=null) {
				request.setAttribute("erreur","Un utilisateur existe deja avec le meme pseudo !");
				this.getServletContext().getRequestDispatcher("/pages/dashboard/index.jsp").forward(request, response);
			}
			request.setAttribute("succes","Utilisateur cree avec succes !");
			dao.enregistrer(user);
			this.getServletContext().getRequestDispatcher("/pages/dashboard/index.jsp").forward(request, response);

		}
	}

}
