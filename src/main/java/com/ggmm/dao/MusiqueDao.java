package com.ggmm.dao;

import java.util.List;

import com.ggmm.beans.Musiques;
import com.ggmm.beans.Users;

public interface MusiqueDao {
	
	public void addMusic(Musiques musique, Users user );
	public Musiques getMusic(int idMusic , Users user);
    public List<Musiques> getAllMusiques();
}
