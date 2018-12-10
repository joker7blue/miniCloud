package com.ggmm.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.ggmm.beans.Users;


public class addMusique extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOADDIRECTIRY = "D:\\UploadJee";
	
    /*public addMusique() {
        super();
    }*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session = request.getSession();
		
		Users user = (Users) session.getAttribute("currentUser");
		
		if( user == null ) {
			response.sendRedirect("login");
			//System.out.println("current user n'existe pas encore");
		}else {
			//System.out.println(session.getAttribute("currentUser"));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/addMusique.jsp").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());

			List<FileItem> multiplies = sf.parseRequest(request);
			
			

			for (FileItem item : multiplies) {
				
				//File fic = new File("storage/"+item.getName());
				//System.out.println(fic.setExecutable(true));
				
				//item.write(new File("./"+item.getName()));
				System.out.println("------------NOM DU FICHIER: "+item.getName()+" ---------------");
				System.out.println("------------TAILLE DU FICHIER "+item.getSize()+" Octets---------------");
				
				
				String nameFile = item.getName();
				int i = nameFile.lastIndexOf(".");
				String extension = nameFile.substring(i,nameFile.length());
				
				System.out.println("------------EXTENXIONn DU FICHIER "+extension+" ---------------");

				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		
		System.out.println("la serler est call");
	}

}
