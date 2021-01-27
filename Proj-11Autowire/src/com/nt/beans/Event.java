package com.nt.beans;

import java.util.Arrays;

public class Event {
	private String[]games;
	public Event() {
		System.out.println("Event:0-param constructor");
		
	}
	
	public void setGames(String[] games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Event [games=" + Arrays.toString(games) + "]";
	}
	
	
	
}

