package com.ggmm.dao;

import java.util.List;

import com.ggmm.beans.Users;
import com.ggmm.beans.Videos;

public interface VideoDao {
	
	public void addVideo(Videos video, Users user );
	public Videos getVideo(int idVideo , Users user);
    public List<Videos> getAllVideos();
}
