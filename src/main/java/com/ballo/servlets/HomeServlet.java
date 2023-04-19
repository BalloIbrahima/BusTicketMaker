package com.ballo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
//@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
//		Utilisateur user=(Utilisateur) session.getAttribute("utilisateur");
//		
//		if(user==null) {
////			si l'utilisateur recuperer est null => qu'il n'existe pas ds la session => on va aller ds la page d'inscription
//			this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
//
//		}else {
			
//			S'il existe => qu'il a deja un compte donc on va aller dans l'acceuil
			this.getServletContext().getRequestDispatcher("/pages/login.jsp").forward(request, response);

		//}
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String pseudo,motDePasse;
		pseudo=request.getParameter("pseudo");
		motDePasse=request.getParameter("password");
		this.getServletContext().getRequestDispatcher("/pages/dashboard/index.jsp").forward(request, response);
	}

}
