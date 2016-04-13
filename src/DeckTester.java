/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = {"Giraffes", "Lions"};
		String[] ranks = {"A", "B", "C"};
		int[] pointValues = {2, 1, 6};
		Deck deck1 = new Deck(ranks, suits, pointValues);
		System.out.println(deck1.deal());
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
	}
}
