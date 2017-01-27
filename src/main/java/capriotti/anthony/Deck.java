package capriotti.anthony;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by anthonycapriotti on 1/27/17.
 */
public class Deck {

    ArrayList<Card> deck;

    public Deck(){

        deck = new ArrayList<Card>(52);
        //Card temp;
        //int deckSize = 52;
        //double remainingElement = 0;

        for(int suit = 0; suit < 4; suit++){
            for(int rank = 0; rank < 13; rank++){
                deck.add(new Card(suit, rank));
            }
        }

       /* while(deckSize > 0){
            remainingElement = Math.floor(Math.random() * deckSize--);


        }*/
    }

    public int getDeckSize(){
        return deck.size();
    }



}
