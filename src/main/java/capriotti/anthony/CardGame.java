package capriotti.anthony;

import java.util.ArrayList;

/**
 * Created by prestonbattin on 1/27/17.
 */
public abstract class CardGame {

   private Deck deck;
   public ArrayList<Card> playersHand = new ArrayList<>();
   public ArrayList<Card> dealersHand = new ArrayList<>();

   protected CardGame(){

        deck = new Deck();
    }

   protected Card drawOne(){

        return deck.drawOne();
    }

   abstract void dealerDraws();

   abstract void playerDraws();

   protected abstract void setHands();

   public int getPlayersHandCount() {

        return playersHand.size();
    }

   public int getDealersHandCount() {

        return dealersHand.size();
    }

}
