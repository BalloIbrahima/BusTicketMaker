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
		UtilisateurDaoImpl dao=new UtilisateurDaoImpl();
	       if(request.getParameter("ids")!=null){
	           int id = Integer.parseInt(request.getParameter("ids"));
	           Utilisateur user=new Utilisateur();
	           user.setId((long) id);
	           dao.supprimner(user);
	   		this.getServletContext().getRequestDispatcher("/pages/dashboard/listAdmin.jsp").forward(request, response);
	       }else
	       if(request.getParameter("idm")!=null){
	           Long id = Long.parseLong(request.getParameter("idm"));
	           Utilisateur user = dao.recherche(id);
	          request.setAttribute("user", user);
	   		  this.getServletContext().getRequestDispatcher("/pages/dashboard/editAdmin.jsp").forward(request, response);
	       }else
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
				this.getServletContext().getRequestDispatcher("/pages/dashboard/admin.jsp").forward(request, response);
			}
			request.setAttribute("succes","Utilisateur cree avec succes !");
			dao.enregistrer(user);

		}else
		
		if(request.getParameter("modifierbtn")!=null) {
			UtilisateurDaoImpl dao=new UtilisateurDaoImpl();
			System.out.println("ddddd");
			
			Long id = Long.parseLong(request.getParameter("id"));
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			String pseudo=request.getParameter("pseudo");
			String motDePasse=request.getParameter("password");
			
			System.out.println(motDePasse);
			Utilisateur ancienUser=dao.recherche(id);
			Utilisateur user=new Utilisateur(nom,prenom,pseudo,motDePasse);
			//verification de la presence d'un utilisateur avec le meme pseudo
			Utilisateur userVerif=dao.parPseudo(pseudo);
			if(userVerif!=null && !pseudo.equals(ancienUser.getPseudo()) ) {
				request.setAttribute("erreur","Un utilisateur existe deja avec le meme pseudo !");
				request.setAttribute("user", user);
		   		this.getServletContext().getRequestDispatcher("/pages/dashboard/editAdmin.jsp").forward(request, response);
			}
			request.setAttribute("succes","Utilisateur cree avec succes !");
			dao.modifier(user,id);

		}
		this.getServletContext().getRequestDispatcher("/pages/dashboard/listAdmin.jsp").forward(request, response);

	}

}
