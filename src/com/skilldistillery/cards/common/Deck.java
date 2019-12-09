package com.skilldistillery.cards.common;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class Deck {
	//fields
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	public List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
		Collections.shuffle(deck);
		System.out.println("Shuffling deck...");
		return deck;
	}

	public int checkDeckSize() {
		return cards.size();
	}

//	public void shuffle() {
//		System.out.println("shuffling deck");
//		Collections.shuffle(cards);
//	}

	public Card dealCard() {
		
		return cards.remove(0);
	}

}
//DECK: a deck is created and placed in an array list
//the deck is then shuffled and dealt to dealer and players