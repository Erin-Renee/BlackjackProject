package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJackApp {
	BlackJackDealer bjd = new BlackJackDealer();
	BlackjackPlayer bjp = new BlackjackPlayer();
	Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();

		
	} //main
	
	public BlackJackApp() {
	//	app.run();
		
	} //constructor//
	
	
	
	
	public void run() {
		intro();
		menu();
	} //run
	
	public void intro() {
		System.out.println("~*~*~*~ Welcome to Casino Royal ~*~*~*~");
		System.out.println("Let me show you around, here is the black jack table... thats it");
		System.out.println("Would you like to play?");
		System.out.println("1: play " + "\n2: quit");
		int introchoice = kb.nextInt();
		switch (introchoice) {
		case 1: 
			menu();
			break;
		case 2:
			goodBye();
			break;
		}
	} //intro
	
	public void menu() {
		
		System.out.println("Dealer is getting deck");
		System.out.println();
		//goes to BlackJackDealer() gets getBlackjackdealersdeck() method which accesses Deck which has a createDeck() method 
		bjd.getBlackjackdealersdeck().createDeck(); 		//creates deck, passes it to the backjack dealers deck.
		//bjd.getBlackjackdealersdeck().shuffle();	
		//shuffles dealers deck
		
		//System.out.println(bjp.getBjh().getHandValue()  + "  players hand value");	//prints out PLAYERS hand (which should be zero since player hasnt received cards)
		System.out.println("Dealer passses you a card: ");
		bjp.addCardFromDealer(bjd.passCardsToPlayer());		// dealer passes 1 card to player 
		System.out.print("your card: ");
		System.out.println(bjp.getBjh() );
		System.out.print("your hand value is: ");
		System.out.println(bjp.getBjh().getHandValue() );//prints out players card value
		System.out.println();
		
		System.out.println("The dealer gets one card... ");
		bjd.addCardFromDealer(bjd.passCardsToPlayer());   	// dealer passes 1 card to dealer
		System.out.print("Dealers card: ");
		System.out.println(bjd.getBjh() );
		
		System.out.print("Dealers hand value is: ");
		System.out.println(bjd.getBjh().getHandValue() );
		System.out.println();
		
		
		System.out.println("You receive a second card... ");
		bjp.addCardFromDealer(bjd.passCardsToPlayer());	//second card
		System.out.print("your card: ");
		System.out.println(bjp.getBjh() );
		System.out.print("your hand value is: ");
		System.out.println(bjp.getBjh().getHandValue() );
		
		bjp.getBjh().isBust();
		bjp.getBjh().isBlackJack();
		
		if (bjp.getBjh().isBlackJack() ) {
			System.out.println("you WIN!!");
			intro();
		} else { 
			System.out.println();
		}
		if (bjp.getBjh().isBust()) {
			System.out.println("you LOSE!!");
			intro();
		}else {
		System.out.println();
		}
		
		System.out.println("the dealer gets a second card face down");
		bjd.addCardFromDealer(bjd.passCardsToPlayer()); 
		System.out.println();
		anotherRound();
		
		//while ((bjp.getBjh().getHandValue()) <=) {
			
	//	}
		//

		
		
		
		
		
//		//print deck
//		Rank[] ranks = Rank.values();
//	    for(int i=0; i<ranks.length; i++) {
//	      System.out.println(ranks[i] + " " + ranks[i].getValue());
//	    }
//	    
//	    for(Suit s : Suit.values()){
//	      System.out.println(s);
//	    }
		
	} //menu
	
	public void anotherRound() {
		System.out.println("what would you like to do?");
		System.out.println("1: hit " + "\n2: Pass");
		int choice1 = kb.nextInt();
		switch (choice1) {
		
		case 1: 
			bjp.addCardFromDealer(bjd.passCardsToPlayer());	//Third card
			System.out.print("your card: ");
			System.out.println(bjp.getBjh() );
			System.out.print("your hand value is: ");
			System.out.println(bjp.getBjh().getHandValue() );
			System.out.println();
			bjp.getBjh().isBlackJack();
			bjp.getBjh().isBust();
			break;
		case 2:
			System.out.print("Dealers card: ");
			System.out.println(bjd.getBjh() );
			
			System.out.print("Dealers hand value is: ");
			System.out.println(bjd.getBjh().getHandValue() );
			bjd.getBjh().isBlackJack();
			bjd.getBjh().isBust();
			System.out.println();
			
		}
		
	}

	public void goodBye() {
		System.out.println("goodbye");
	}
	
} //class



