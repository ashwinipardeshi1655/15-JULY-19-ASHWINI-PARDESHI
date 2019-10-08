package com.dev.practice;

import com.ust.beans1.Songs;

public interface songsinterface {
	
	
		
		Songs getSong(Songs s);
		boolean storeSong(Songs s);
		Songs searchSong(Songs name);
		boolean deleteSong(String id);
		

	


}
