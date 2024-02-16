import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        createDeck();
    }

    public void createDeck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public void dealCard() {
        if (cards.size() < 5) {
            System.out.println("Not enough cards in the deck.");
            return;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(cards.remove(0));
        }
    }

    // Implement other methods as per requirements
}
