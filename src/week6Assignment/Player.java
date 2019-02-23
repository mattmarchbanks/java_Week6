package week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	// Fields
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	// Methods
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Name: " + name);
		System.out.println("Score: " + score);
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
}
