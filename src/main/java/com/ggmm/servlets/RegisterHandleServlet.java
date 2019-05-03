package com.ggmm.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ggmm.beans.Users;
import com.ggmm.dao.DaoFactory;
import com.ggmm.dao.UserDao;

/**
 * Servlet implementation class RegisterHandleServlet
 */
public class RegisterHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private UserDao userDao;


    public void init() throws ServletException {

        DaoFactory daoFactory = DaoFactory.getInstance();
        this.userDao = daoFactory.getUtilisateurDao();
    }
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterHandleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if( nom.trim().equals("") || email.trim().equals("") || login.trim().equals("") || password.trim().equals("") ) {
			
			response.sendRedirect("register");
		}else {
			
			Users userToStore = new Users();
			userToStore.setNom(nom);
			userToStore.setLogin(login);
			userToStore.setEmail(email);
			userToStore.setPassWord(password);
			
			userDao.addUser(userToStore);
			
			response.sendRedirect("login");
			
		}	
		
	}

}
