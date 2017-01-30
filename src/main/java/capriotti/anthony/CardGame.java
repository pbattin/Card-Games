package capriotti.anthony;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by prestonbattin on 1/27/17.
 */
public abstract class CardGame {

    static Scanner input = new Scanner(System.in);
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
