package com.ballo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.ballo.dao_implentation.BilletDaoImpl;
import com.ballo.entity.Billet;


/**
 * Servlet implementation class newBillet
 */
@WebServlet("/newBillet")
public class newBillet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newBillet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// suppression
		BilletDaoImpl dao=new BilletDaoImpl();
       if(request.getParameter("ids")!=null){
           int id = Integer.parseInt(request.getParameter("ids"));
           Billet billet = new Billet();
           billet.setId((long) id);
           dao.supprimner(billet);
   		this.getServletContext().getRequestDispatcher("/pages/dashboard/index.jsp").forward(request, response);
       }
		this.getServletContext().getRequestDispatcher("/pages/dashboard/newBillet.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		if(request.getParameter("creerbtn")!=null) {
			BilletDaoImpl dao=new BilletDaoImpl();
			System.out.println("ddddd");
			
			String nom=request.getParameter("nom");
			String prenom=request.getParameter("prenom");
			
			String destination=request.getParameter("destination");
			String dateStr=request.getParameter("date");
					
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
			SimpleDateFormat formater = new SimpleDateFormat("'le' dd/MM/yyyy 'à' hh:mm:ss");

			//surround below line with try catch block as below code throws checked exception
			Date date=new Date();
			
			String depart="";
			
			try {
				date = (Date)sdf.parse(dateStr);
				depart=formater.format(date);
			}catch(Exception e) {
				
			}
			
			Long prix=Long.parseLong(request.getParameter("prix"));


			
			Billet billet=new Billet(nom,prenom,date,depart, destination,prix);
			//verification de la presence d'un utilisateur avec le meme pseudo
			
			request.setAttribute("succes","Billet cree avec succes !");
			dao.enregistrer(billet);
			this.getServletContext().getRequestDispatcher("/pages/dashboard/index.jsp").forward(request, response);

		}
	}

}
