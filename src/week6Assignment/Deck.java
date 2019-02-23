package week6Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// Fields
	private List<Card> cards = new ArrayList<Card>();
	private String[] suits = new String[] {"Hearts", "Diamonds", "Clubs", "Spades"};
	private int[] values = new int[] {
			2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
	};
	
	// Methods
	public Deck() {
		for (String suit : suits) {
			int i = 2;
			for (int value : values) {
				cards.add(new Card(value + " of " + suit, i++));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);			
	}
	
	public Card draw() {
		return cards.remove(0);
	}	
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
}
