package com.ggmm.dao;

import java.util.List;

import com.ggmm.beans.Documents;
import com.ggmm.beans.Users;

public interface DocumentDao {
	
	public void addDocument(Documents document, Users user );
	public Documents getMusic(int idDocument , Users user);
    public List<Documents> getAllMusiques();
}
