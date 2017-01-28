package capriotti.anthony;

/**
 * Created by anthonycapriotti on 1/27/17.
 */
public class Card {
    public static enum Suit {SPADE, HEARTS, DIAMOND, CLUBS}
    public static enum Rank  {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    Suit suit;
    Rank rank;

    public Card(int suit, int rank){

        this.suit = Suit.values()[suit];
        this.rank = Rank.values()[rank];
    }

    public Suit getSuit() {

        return suit;
    }

    public Rank getRank() {

        return rank;
    }
}

