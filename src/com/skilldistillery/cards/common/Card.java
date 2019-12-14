//card type.
package com.skilldistillery.cards.common;

public class Card {
	//fields
  private Rank rank;
  private Suit suit;
  
  public Card(Rank rank, Suit suit) {
	  //constructors
    this.rank = rank;
    this.suit = suit;
  } //constructor
  
  public int getValue() {
    return rank.getValue();
  } //getValue()

//  @Override
//  public int hashCode() {
//    final int prime = 31;
//    int result = 1;
//    result = prime * result + ((rank == null) ? 0 : rank.hashCode());
//    result = prime * result + ((suit == null) ? 0 : suit.hashCode());
//    return result;
//  } //hashcode()

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Card other = (Card) obj;
    if (rank != other.rank)
      return false;
    if (suit != other.suit)
      return false;
    return true;
  } //equals()

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(rank);
    builder.append(" of ");
    builder.append(suit);
    return builder.toString();
  } //toString
  
} //class
