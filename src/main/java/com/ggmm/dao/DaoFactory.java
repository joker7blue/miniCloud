package com.ggmm.dao;

import java.sql.*;

import com.ggmm.daoImpl.UsersDoaImpl;

public class DaoFactory {
	
	private String url;
    private String username;
    private String password;
    
    public DaoFactory(String url/*, String username, String password*/) {
    	 this.url = url;
         /*this.username = username;
         this.password = password;*/
	}
    
    public static DaoFactory getInstance() {
    	 try {
             Class.forName("org.postgresql.Driver");
         } catch (ClassNotFoundException e) {

         }

         DaoFactory instance = new DaoFactory("jdbc:postgresql://ec2-107-20-193-206.compute-1.amazonaws.com:5432/d191ta9nbqpfg3?user=rsfcunilkfbwzy&password=6461dc8f8a7ef3b362cdbfc7936e022bcf4cd7b98e0d304ff62a86af085c4304&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory");
    	 //DaoFactory instance = new DaoFactory("jdbc:postgresql://ec2-107-20-193-206.compute-1.amazonaws.com:5432/d191ta9nbqpfg3", "rsfcunilkfbwzy", "6461dc8f8a7ef3b362cdbfc7936e022bcf4cd7b98e0d304ff62a86af085c4304");
    	 //"jdbc:postgresql://ec2-107-20-193-206.compute-1.amazonaws.com:5432/d191ta9nbqpfg3?user=rsfcunilkfbwzy&password=6461dc8f8a7ef3b362cdbfc7936e022bcf4cd7b98e0d304ff62a86af085c4304&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory"
         //jdbc:postgresql://host:port/database?user=username&password=secret&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory
         return instance;
	}
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url);
    }
    
    
    //Récupération du Dao
    public UserDao getUtilisateurDao() {
        return new UsersDoaImpl(this);
    }
}
