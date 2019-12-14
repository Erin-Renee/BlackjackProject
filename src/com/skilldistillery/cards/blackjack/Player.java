package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cards.common.Card;

public class Player {
	ArrayList<Object> Ai = new ArrayList<Object>(4);
	
	Hand bjh = new Hand();
	
	public Player() {
		
	}
	
	public void multiPlayer(ArrayList<Object> Ai) {
		
		
	}
	
	public void addCardFromDealer(Card card) {
		bjh.addCard(card);
		
	}

	public Hand getBjh() {
		return bjh;
	}

	public void setBjh(Hand bjh) {
		this.bjh = bjh;
	}
	
}//class
