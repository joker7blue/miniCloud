package com.ggmm.dao;

import java.util.List;

import com.ggmm.beans.Users;

public interface UserDao {
	
	public void addUser( Users user );
	public Users getUser(String login, String password);
    public List<Users> getAllUsers();
    public boolean IsUserExsit(String login,String password);
}
