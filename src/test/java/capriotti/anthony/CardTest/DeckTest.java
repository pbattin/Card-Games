package capriotti.anthony.CardTest;

/**
 * Created by anthonycapriotti on 1/27/17.
 */

import capriotti.anthony.Deck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

     Deck test;

     @Before
     public void setup(){
         test = new Deck();
     }


    @Test
    public void deckSizeTest(){
         int expected = 52;
         int actual = test.getDeckSize();
         assertEquals("testing the deck size", expected, actual);
        System.out.println(test.getRandomSuit());
    }

    @Test
    public void drawOneTest(){

        int expected = 51;
        test.drawOne();
        int actual = test.getDeckSize();
        assertEquals("Testing drawing a card",expected,actual);
    }

}
