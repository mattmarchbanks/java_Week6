package week6Assignment;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player("Kaleigh");
		Player player2 = new Player("Dominic");
		int draws = 0;
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			int p1 = player1.flip().getValue();
			int p2 = player2.flip().getValue();
			System.out.println("ROUND " + (i + 1));
			System.out.println("Player 1 card value: " + p1);
			System.out.println("Player 2 card value: " + p2);
			if (p1 == p2) {
				System.out.println("Draw!");
				draws++;
			} else {
				if (p1 > p2) {
					System.out.println("Player 1's point!");
					player1.incrementScore();
				} else {
					System.out.println("Player 2's point!");
					player2.incrementScore();
				}
			}
			System.out.println();
		}
		System.out.println("RESULTS");
		System.out.println("Player 1's score: " + player1.getScore());
		System.out.println("Player 2's score: " + player2.getScore());
		System.out.println("Draws: " + draws);
		if (player1.getScore() == player2.getScore()) {
			System.out.println("Tie game!");
		} else if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		} else {System.out.println("Player 2 wins!");}
	}
}
