package com.jspiders.musicplayer.operations;

import java.util.ArrayList;

import com.jspiders.musicplayer.song.Song;

public interface MusicOperation {
	public void playAll();
	public void playRandom();
	public void chooseSong();
	public void addSong();
	public void removeSong(String st); 
	public void editSong();
}
