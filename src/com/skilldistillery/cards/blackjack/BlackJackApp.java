package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Deck;

public class BlackJackApp {
	BlackJackDealer bjd = new BlackJackDealer();
	BlackjackPlayer bjp = new BlackjackPlayer();
	
	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.run();

		
	} //main
	
	public BlackJackApp() {
	//	app.run();
		
	} //constructor//
	
	
	
	
	public void run() {
//		intro();
		menu();
	} //run
	
	public void intro() {
		System.out.println("~*~*~*~ Welcome to Casino Royal ~*~*~*~");
		System.out.println("Let me show you around, here is the black jack table... thats it");
	} //intro
	
	public void menu() {
//		System.out.println("Would you like to play? ");
//		System.out.println("Q to quit");
		
		
		
		//goes to BlackJackDealer() gets getBlackjackdealersdeck() method which accesses Deck which has a createDeck() method 
		bjd.getBlackjackdealersdeck().createDeck(); 		//creates deck, passes it to the backjack dealers deck.
		bjd.getBlackjackdealersdeck().shuffle();	
		//shuffles dealers deck
		//System.out.println(bjp.getBjh().getHandValue()  + "  players hand value");	//prints out PLAYERS hand (which should be zero since player hasnt received cards)
		bjp.addCardFromDealer(bjd.passCardsToPlayer());		// dealer passes 1 card to player 
		System.out.println(bjp.getBjh() + " the actual cards in players hand");
		System.out.println(bjp.getBjh().getHandValue()  +  " players hand value after being dealt a card");	//prints out players card value
		
		bjd.addCardFromDealer(bjd.passCardsToPlayer());   	// dealer passes 1 card to dealer
		
		bjp.addCardFromDealer(bjd.passCardsToPlayer());	//second card
		System.out.println(bjp.getBjh().getHandValue() + " player hand value");
		bjd.addCardFromDealer(bjd.passCardsToPlayer()); 
		System.out.println(bjp.getBjh() + " the actual cards in players hand");
		
	} //menu
	
	
	

} //class



