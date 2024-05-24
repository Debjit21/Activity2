package com.acc.mvnProj;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ManageTeam mt= new ManageTeam();
        Scanner sc = new Scanner (System.in);
        
        while(true) {
        	System.out.println("1. Add Player");
        	System.out.println("2. Remove Player");
        	System.out.println("3. Check if the Player exists ?");
        	System.out.println("4. Display all players");
        	System.out.println("5. Exit");
        	
	        System.out.println("Enter your choice: ");
	        int ch = sc.nextInt();
	        sc.nextLine();
	        
	        switch(ch) {
	        case 1:
	        	System.out.println("Enter the Name: ");
	        	String name = sc.nextLine();
	        	mt.addPlayer(name);
	        	break;
	        case 2:
	        	System.out.println("Enter Player Name to remove: ");
	        	String name1 = sc.nextLine();
	        	mt.removePlayer(name1);
	        	break;
	        case 3:
	        	System.out.println("Enter Player to check: ");
	        	String name3 = sc.nextLine();
	        	if(mt.isPlayerExist(name3)) {
	        		System.out.println("Player is in the team");
	        	}
	        	else {
	        		System.out.println("Player is not in the team");
	        	}
	        	break;
	        case 4:
	        	mt.display();
	        	break;
	        case 5:
	        	System.out.println("Exit !!");
	        	System.exit(0);
	        default:
	        	System.out.println("Invalid Choice");
	        }
        }	
        
    }
}
