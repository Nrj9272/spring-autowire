package com.nt.beans;

public class Tournament {
	private Event event;

	public void setEvent(Event event) {
		System.out.println("Tournament.setEvent(-)");
		this.event = event;
	}

	
	/*
	 * public Tournament(Event event) {//for constructor-->(Event event)
	 * System.out.println("Tournament:0-param constructor"); //this.event = event; }
	 */

	@Override
	public String toString() {
		return "Tournament [event=" + event + "]";
	}
	

}
