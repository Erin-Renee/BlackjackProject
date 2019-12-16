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
	
	@Override
	public boolean isBlackJack() {
		if (this.getHandValue() == 21) {
			
			return true;
		}else {
			return false;
		}
		} //sBlackJack()
	
	public boolean isBust() {
		if (this.getHandValue() > 21) {
			

			return true;
		}else {
			return false;
		}
	} //isBust()
		public boolean is21() {
			if (this.getHandValue() == 21) {
				

				return true;
			}else {
				return false;
			}
	
		}
	
	
}  //AbstractHand() class




