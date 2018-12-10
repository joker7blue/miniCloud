package com.ggmm.servlets;

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
 * Servlet implementation class LoginHandleServlet
 */
public class LoginHandleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao userDao;


    public void init() throws ServletException {

        DaoFactory daoFactory = DaoFactory.getInstance();
        this.userDao = daoFactory.getUtilisateurDao();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHandleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if(userDao.IsUserExsit(login, password)) {
			System.out.println("Cet utilisateur existe bien");
			
			request.setAttribute("de", "mpmp");
			HttpSession session = request.getSession();
			
			Users currentUser = userDao.getUser(login, password);
			session.setAttribute("currentUser", currentUser); 

			response.sendRedirect("home");
			//this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
		}else {
			
			/*System.out.println("Cet utilisateur n'existe pas dans la bd");
			
			HttpSession session = request.getSession();
			Users userFake = new Users();
			session.setAttribute("currentUser", userFake); */
			
			response.sendRedirect("login");
		}
		
		//System.out.println(login + "---------------------" + password);
	}

}
