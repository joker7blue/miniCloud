package com.ggmm.daoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ggmm.beans.Users;
import com.ggmm.dao.DaoFactory;
import com.ggmm.dao.UserDao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.sql.Connection;
import java.sql.Statement;

public class UsersDoaImpl implements UserDao{
	
	private DaoFactory daoFactory;
	
	public UsersDoaImpl(DaoFactory daoFactory) {
		// TODO Auto-generated constructor stub
		this.daoFactory = daoFactory;
	}
	
	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		 Connection connexion = null;
	        PreparedStatement preparedStatement = null;

	        try {

	            connexion = daoFactory.getConnection();
	            
	            preparedStatement = connexion.prepareStatement("INSERT INTO users(nom,login,password,email) VALUES(?,?,?,?);");
	            
	            preparedStatement.setString(1, user.getNom());
	            preparedStatement.setString(2, user.getLogin());
	            preparedStatement.setString(3, user.getPassWord());
	            preparedStatement.setString(4, user.getEmail());
	            
	            preparedStatement.executeUpdate();
	            

	        } catch (SQLException e) {

	            e.printStackTrace();

	        }
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		 List<Users> utilisateurs = new ArrayList<Users>();

	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;


	        try {

	            connexion = daoFactory.getConnection();

	            statement = connexion.createStatement();

	            resultat = statement.executeQuery("SELECT nom,login,email FROM users;");


	            while (resultat.next()) {

	            	String nom = resultat.getString("nom");
	                String login = resultat.getString("login");
	                String email = resultat.getString("email");
	               
	                Users utilisateur = new Users();
	                utilisateur.setNom(nom);
	                utilisateur.setLogin(login);
	                utilisateur.setEmail(email);

	                utilisateurs.add(utilisateur);

	            }

	        } catch (SQLException e) {

	            e.printStackTrace();

	        }

	        return utilisateurs;

	}

	@Override
	public boolean IsUserExsit(String login, String password) {
		// TODO Auto-generated method stub
		Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;


        try {

            connexion = daoFactory.getConnection();

            statement = connexion.createStatement();

            resultat = statement.executeQuery("SELECT login,password FROM users;");


            while (resultat.next()) {

                String loginUser = resultat.getString("login");
                String passwordUser = resultat.getString("password");
                
                System.out.println(loginUser+"******************"+passwordUser);
                
                if (loginUser.equals(login) && passwordUser.equals(password)) {
                	
					return true;
				} 
            }

	        } catch (SQLException e) {
	
	            e.printStackTrace();
	
	        }

        return false;
	}

	@Override
	public Users getUser(String login, String password) {
		// TODO Auto-generated method stub
		Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;


        try {

            connexion = daoFactory.getConnection();

            statement = connexion.createStatement();

            resultat = statement.executeQuery("SELECT id,nom,login,password,email FROM users;");


            while (resultat.next()) {
            	
            	int idUser = resultat.getInt("id");
            	String nomUser = resultat.getString("nom");
                String loginUser = resultat.getString("login");
                String passwordUser = resultat.getString("password");
                String emailUser = resultat.getString("email");               
                
                if (loginUser.equals(login) && passwordUser.equals(password)) {
                	
                	Users user = new Users();
                	user.setIdUser(idUser);
                	user.setNom(nomUser);
                	user.setLogin(loginUser);
                	user.setEmail(emailUser);
                	
                	return user;
				} 
            }

	        } catch (SQLException e) {
	
	            e.printStackTrace();
	
	        }
		return null;

	}
}
