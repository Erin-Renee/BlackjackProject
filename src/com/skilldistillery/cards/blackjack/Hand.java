package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.AbstractHand;
import com.skilldistillery.cards.common.Card;

public class Hand extends AbstractHand {
	
	
		public Hand() {
			
		} //constructor
		
	@Override
	public int getHandValue() {
		int sum=0;
		for (Card card : listofcards) {
			sum = sum + card.getValue();
		}//foreach

		return sum;
		
	} //getHandValue()
	
	public boolean isBlackJack() {
		if (this.getHandValue() == 21) {
			System.out.println("BLACKJACK!!!!");
			return true;
		}else {
			return false;
		}
		} //sBlackJack()
	
	public boolean isBust() {
		if (this.getHandValue() > 21) {
			System.out.println("Bust!");
			return true;
		}else {
			return false;
		}
		
	
	
	
	} //isBust()
	
}  //AbstractHand() class




