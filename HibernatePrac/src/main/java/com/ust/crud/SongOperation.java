package com.ust.crud;

import java.util.List;

import com.ust.beans.MusicEntity;

public interface SongOperation {
	
	public boolean storeSong();
	public MusicEntity searchSong(int id);
	public MusicEntity getSongs(int id);
	public List<MusicEntity> getAllSongs();
	public boolean updateSongs();
	public List<MusicEntity> randomSongs();
	public boolean deleteSong(int id);
	

}
