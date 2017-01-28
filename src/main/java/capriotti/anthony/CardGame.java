package capriotti.anthony;

/**
 * Created by prestonbattin on 1/27/17.
 */
public abstract class CardGame {

    Deck deck;
    Card card;

   protected CardGame(){

        deck = new Deck();
    }

   protected Card drawOne(){

        return card = deck.drawOne();
    }

   abstract void dealerDraws();

   abstract void playerDraws();

   protected abstract void setHands();


}
