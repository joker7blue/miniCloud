package com.ggmm.dao;

import java.util.List;

import com.ggmm.beans.Pictures;
import com.ggmm.beans.Users;

public interface PictureDao {
	
	public void addPicture(Pictures picture, Users user );
	public Pictures getPicture(int idPicture , Users user);
    public List<Pictures> getAllPictures();
}
