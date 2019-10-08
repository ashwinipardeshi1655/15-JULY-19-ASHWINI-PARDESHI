package com.ust.musicplayer;

import com.ust.beans1.Songs;

public interface SongsInterface {
	
	Songs getSong(Songs s);
	boolean storeSong(Songs s);
	Songs searchSong(Songs name);
	boolean deleteSong(String id);
	

}

