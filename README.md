## BlackJack Project
For the BlackJack Project we I created 9 classes inside 2 packages. I separated
 the classes specific to blackjack, and classes that could be used for other
 games. The rank and suit class are enum classes, and the abstract hand is an
 abstract class.

###Objectives


Getting comfortable building classes in an Object-Oriented manner.
Building classes whose fields are Objects.
Practice writing methods.
Use collection types to organize and manage data.
Use conditionals to create game logic.

#### Concepts/ topics Covered

buffer reader
ArrayList
override
toString
switch
boolean
Scanner

#### Technology Used
Atom
Eclipse
Github
Macbook Pro


#### Lessons Learned
I got better at calling methods from other classes.


####thinkbox
deck: 52 cards per deck, 1 or more decks
blackjack goal: get to 21 without busting
players are each dealt two cards, one shown with one face down
players then choose to hit or pass
you can keep hitting until you hit 21 or above
double down before second hit
players
all players are playing against dealer
dealer - required to hit um until 17
	separate class from players with special rules
casino
	shuffle and deal cards
deck
blackjack hand
abstract hand
4 suites (each have deck 2-10) (32 total)
aces = 11 or 1 (4 total)
if ace is considered one it is “soft”
(jack, queen, king) = 10 (12 total)

dealer and player have same number == push
over 21 == bust
exactly 21 == blackjack == win
deraler might be interface of player.

shuffle cards

1. place bet
2. shuffle
3. deal card (x2) including dealer
4. remove card dealt
5.
