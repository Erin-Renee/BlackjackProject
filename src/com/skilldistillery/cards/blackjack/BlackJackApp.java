package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJackApp {
	private BlackJackDealer dealer = new BlackJackDealer();
	private Player player = new Player();

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.intro();

	} // main

	public BlackJackApp() {

	} // constructor//

	public void intro() {

		System.out.println("~*~*~*~ Welcome to Casino Royal ~*~*~*~");
		System.out.println("Let me show you around, here is the black jack table.");
		int introchoice = 100;
		boolean keepgoing = true;
		while (keepgoing) {
			try {
				System.out.println("Would you like to play?");
				System.out.println("Press (1) to play " + "\n (2) to quit");
				introchoice = kb.nextInt();
				keepgoing = false;
				switch (introchoice) {
				case 1:
					menu();
					break;
				case 2: 
					goodBye();
					break;
				default:
					System.out.println("Please choose one of the menu options (1 or 2)");
				}
			} catch (Exception e) {
				System.out.println(e);
				kb.nextLine();
			}
		}
	} // intro

	public void menu() {

	

	} // menu

	public void anotherRound() {
		System.out.println("what would you like to do?");
		System.out.println("1: hit " + "\n2: Pass");
		int choice1 = kb.nextInt();

		player.addCardFromDealer(dealer.passCardsToPlayer()); // Third card
		System.out.print("your card: ");
		System.out.println(player.getBjh());
		System.out.print("your hand value is: ");
		System.out.println(player.getBjh().getHandValue());
		System.out.println();
		player.getBjh().isBlackJack();
		player.getBjh().isBust();

		System.out.print("Dealers card: ");
		System.out.println(dealer.getBjh());

		System.out.print("Dealers hand value is: ");
		System.out.println(dealer.getBjh().getHandValue());
		dealer.getBjh().isBlackJack();
		dealer.getBjh().isBust();
		System.out.println();

	}

	public void goodBye() {
		System.out.println("goodbye");
	}

} // class







/*
 * System.out.println("Dealer is getting deck"); System.out.println(); // goes
 * to BlackJackDealer() gets getBlackjackdealersdeck() method which // accesses
 * Deck which has a createDeck() method
 * dealer.getBlackjackdealersdeck().createDeck(); // creates deck, passes it to
 * the backjack dealers deck. // bjd.getBlackjackdealersdeck().shuffle(); //
 * shuffles dealers deck
 * 
 * // System.out.println(bjp.getBjh().getHandValue() + " players hand value");
 * // //prints out PLAYERS hand (which should be zero since player hasnt
 * received // cards) System.out.println("Dealer passses you a card: ");
 * player.addCardFromDealer(dealer.passCardsToPlayer()); // dealer passes 1 card
 * to player System.out.print("your card: ");
 * System.out.println(player.getBjh());
 * System.out.print("your hand value is: ");
 * System.out.println(player.getBjh().getHandValue());// prints out players card
 * value System.out.println();
 * 
 * System.out.println("The dealer gets one card... ");
 * dealer.addCardFromDealer(dealer.passCardsToPlayer()); // dealer passes 1 card
 * to dealer System.out.print("Dealers card: ");
 * System.out.println(dealer.getBjh());
 * 
 * System.out.print("Dealers hand value is: ");
 * System.out.println(dealer.getBjh().getHandValue()); System.out.println();
 * 
 * System.out.println("You receive a second card... ");
 * player.addCardFromDealer(dealer.passCardsToPlayer()); // second card
 * System.out.print("your card: "); System.out.println(player.getBjh());
 * System.out.print("your hand value is: ");
 * System.out.println(player.getBjh().getHandValue()); //playerTurn();
 * //dealerTurn(); // bjp.getBjh().isBust(); // bjp.getBjh().isBlackJack();
 * 
 * if (player.getBjh().isBlackJack()) { System.out.println("you WIN!!");
 * intro(); } else { System.out.println(); } if (player.getBjh().isBust()) {
 * System.out.println("you LOSE!!"); intro(); } else { System.out.println(); }
 * 
 * System.out.println("the dealer gets a second card face down");
 * dealer.addCardFromDealer(dealer.passCardsToPlayer()); System.out.println();
 * anotherRound();
 */