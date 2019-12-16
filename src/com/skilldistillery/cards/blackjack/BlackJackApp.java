package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackJackApp {

	private BlackJackDealer dealer = new BlackJackDealer();
	private Player player = new Player();
	// private Hand hand = new Hand();

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.intro();

	} // main

	public BlackJackApp() {

	} // constructor//

	public void intro() {

		System.out.println("~*~*~*~ Welcome to Chips & Blitz ~*~*~*~");
		System.out.println("Let me show you around, here is the black jack table.");
		menu();

	} // intro

	public void menu() {
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
					firstRound();
					break;
				case 2:
					exit();
					break;
				default:
					System.out.println("Please choose one of the menu options (1 or 2)");
				}
			} catch (Exception e) {
				System.out.println(e);
				kb.nextLine();
			}
		}

	} // menu

	public void firstRound() {
		System.out.println("Please be seated, the dealer getting and shuffling the deck.");
		dealer.getBlackjackdealersdeck().createDeck();
		dealer.getBlackjackdealersdeck().shuffle();

		System.out.println(player.getBjh().getHandValue() + " No cards in hand");
		System.out.println("The dealer passes a card to the player");
		player.addCardFromDealer(dealer.passCardsToPlayer());
		System.out.println("your first card is: " + player.getBjh());

		dealer.dealergetcard(dealer.passCardsToPlayer());
		System.out.println("the dealer first card is: " + dealer.getDealershand());

		player.addCardFromDealer(dealer.passCardsToPlayer());
		System.out.println("you are dealt a second card: " + "\n Your hand: " + player.getBjh());
		playersHandValue();

		System.out.println("the dealer is dealt a second card face down. ");
		dealer.dealergetcard(dealer.passCardsToPlayer());

		if (!player.getBjh().isBlackJack() && !dealer.getDealershand().isBlackJack()) {

			playersTurn();

		}
		if (player.getBjh().isBlackJack() || dealer.getDealershand().isBlackJack()) {
			whoWon();
		} else {
			goodBye();
		}

	}

	public void playersTurn() {
		int playerchoice = 100;

//		while (!player.getBjh().isBust() && !dealer.getDealershand().isBust()&& !player.getBjh().is21() && !dealer.getDealershand().is21()) {
//			do {
		System.out.println("1: Hit, 2: Pass, 3: Quit");
		playerchoice = kb.nextInt();
		switch (playerchoice) {
		case 1:
			System.out.println("The dealer passes a card to the player");
			player.addCardFromDealer(dealer.passCardsToPlayer());
			System.out.println("your hand; " + player.getBjh());
			playersHandValue();
			checkPlayer();
			break;
		case 2:
			dealerTurn();
			checkDealer();
			break;
		case 3:
			exit();
			break;
		default:
			System.out.println("Error");
		}
	}

	public void checkPlayer() {
		if (player.getBjh().isBust() || player.getBjh().is21()) {
			whoWon();
		}
	}

	public void checkDealer() {
		if (dealer.getDealershand().isBust() || dealer.getDealershand().is21()) {
			whoWon();
		}
	}

	public void playersHandValue() {
		System.out.print("your hand value is: ");
		System.out.println(player.getBjh().getHandValue());
	}

	public void dealersHandValue() {
		System.out.print("Dealers hand value is: ");
		System.out.println(dealer.getDealershand().getHandValue());
		// dealer.getDealershand().isBust();
	}

	public void dealerTurn() {
		while (!dealer.getDealershand().isBust() && (!(dealer.getDealershand().getHandValue() == 21))) {
			do {
				if (dealer.check17() && !dealer.getDealershand().isBust()) {
					System.out.println("dealer hits");

					dealer.dealergetcard(dealer.passCardsToPlayer());

					System.out.println("Dealers hand:  " + dealer.getDealershand());
					dealersHandValue();
				}
				if (!dealer.check17() && !dealer.getDealershand().isBust()) {
					System.out.println("dealer stays");
					dealersHandValue();
					anotherRound();
				}
			} while (dealer.getDealershand().isBust() || (dealer.getDealershand().getHandValue() == 21));
			whoWon();

		}
	}

	public void anotherRound() {
		System.out.println("what would you like to do?");
		playersTurn();

	}

//	public void tie() {
//		if (dealer.getDealershand().getHandValue() == player.getBjh().getHandValue()) {
//			System.out.println("You and the dealer tied.");
//			goodBye();
//		}
//	}

	public void whoWon() {

		if (dealer.getDealershand().isBlackJack()) {
			System.out.println("Dealer hit BlackJack!!");
			System.out.println("You lost this round");
		}
		if (dealer.getDealershand().isBust()) {
			System.out.println("You WIN!!! $$$$");
			goodBye();
		}
		if (player.bjh.isBlackJack()) {
			System.out.println("You hit BlackJack!!");
			System.out.println("You Win");
		}
		if (player.getBjh().isBust()) {
			System.out.println("DEALER WON, You lost this round");
			goodBye();
		}
		if (dealer.getDealershand().getHandValue() == player.getBjh().getHandValue()) {
			System.out.println("You and the dealer tied.");
			goodBye();
		}

	}

	public void goodBye() {

		System.out.println("Thank you for playing at Chips and Blitz! Goodbye ");
		dealer.getDealershand().clearHand();
		player.getBjh().clearHand();
		dealer.getBlackjackdealersdeck().createDeck();
		intro();

	}

	public void exit() {
		System.out.println("goodbye");
		System.exit(0);
	}
} // class
