package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackJackDealer extends BlackjackPlayer {
	//fields
	private Deck blackjackdealersdeck = new Deck();
	private BlackJackHand dealershand = new BlackJackHand();
	
	//constructor
	public BlackJackDealer() {
		
	}
	
	//methods
	

	public boolean check17() {
		boolean check = true;
		if (dealershand.getHandValue() < 17 ) {
			check = true;
		}else { 
			check = false;
		}
		return check;
	}
		

	public Card passCardsToPlayer() {
		return this.blackjackdealersdeck.dealCard();
	}

	public Deck getBlackjackdealersdeck() {
		return blackjackdealersdeck;
	}

	public void setBlackjackdealersdeck(Deck blackjackdealersdeck) {
		this.blackjackdealersdeck = blackjackdealersdeck;
	}

	public BlackJackHand getDealershand() {
		return dealershand;
	}

	public void setDealershand(BlackJackHand dealershand) {
		this.dealershand = dealershand;
	}
	
}
//getters & setters