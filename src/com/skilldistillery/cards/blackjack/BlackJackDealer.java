package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackJackDealer extends Player {
	//fields
	private Deck blackjackdealersdeck = new Deck();
	private Hand dealershand = new Hand();
	
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
		public void dealergetcard(Card card) {
			dealershand.addCard(card);
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

	public Hand getDealershand() {
		return dealershand;
	}

	public void setDealershand(Hand dealershand) {
		this.dealershand = dealershand;
	}
	
}
//getters & setters