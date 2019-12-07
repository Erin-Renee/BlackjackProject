package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHand {
	public abstract int getHandValue();

	protected List<Card> listofcards = new ArrayList<>();

	public void addCard(Card card) {
		listofcards.add(card);
	}
	
	public void clearHand() {
		listofcards.removeAll(listofcards);
	}//clearhand
	
	public Card getOneCard(int number) {
		return listofcards.get(number);
		
	}

	@Override
	public String toString() {
		String cardsinhand = "";
		for (Card card : listofcards) {
			cardsinhand += card.toString() + "\n";
			System.err.println(card);
			
		}
		return cardsinhand;
	}
	
}