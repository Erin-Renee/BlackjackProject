package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackPlayer {
	
	BlackJackHand bjh = new BlackJackHand();
	
	public BlackjackPlayer() {
		
	}
	
	public void addCardFromDealer(Card card) {
		bjh.addCard(card);
		
	}

	public BlackJackHand getBjh() {
		return bjh;
	}

	public void setBjh(BlackJackHand bjh) {
		this.bjh = bjh;
	}
	
}//class
