package com.acc.mvnProj;

import java.util.*;

public class ManageTeam {
	
	private Set<String > players;

	public ManageTeam() {
		players = new HashSet<>();
	}
	
	public void addPlayer(String name) {
		players.add(name);
		System.out.println(name+" has added");
	}
	
	public void removePlayer(String name) {
		if(players.remove(name)) {
			System.out.println(name+" has removed");
		}
		else {
			System.out.println(name+" is not in the team");
		}
	}
	
	public boolean isPlayerExist(String name) {
		return players.contains(name);
	}
	
	public void display() {
		System.out.println("Players are: ");
		for(String player  :players) {
			System.out.println(player);
		}
	}
}