package com.ggmm.servlets;

import java.awt.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ggmm.beans.Users;
import com.ggmm.dao.DaoFactory;
import com.ggmm.dao.UserDao;

/**
 * Servlet implementation class MusiqueHandleServlet
 */
public class MusiqueHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;


    public void init() throws ServletException {

        DaoFactory daoFactory = DaoFactory.getInstance();
        this.userDao = daoFactory.getUtilisateurDao();
    }

    /**
     * Default constructor. 
     */
    public MusiqueHandleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setAttribute("allUsers", userDao.getAllUsers());
		
		//System.out.println(userDao.getAllUsers().get(0).getNom());
HttpSession session = request.getSession();
		
		Users user = (Users) session.getAttribute("currentUser");
		
		if( user == null ) {
			response.sendRedirect("login");
			//System.out.println("current user n'existe pas encore");
		}else {
			//System.out.println(session.getAttribute("currentUser"));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/musique.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
