package capriotti.anthony.CardTest;

/**
 * Created by anthonycapriotti on 1/27/17.
 */
import capriotti.anthony.Card;
import capriotti.anthony.Card.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    Card test;

    @Before
    public void setup(){
         test = new Card(1, 12);
    }


    @Test
    public void suitTest(){
        Suit expected = Suit.HEARTS;
        Suit actual = test.getSuit();
        assertEquals("Testing the suit type",expected,actual);

    }

    @Test
    public void rankTest(){
        Rank expected = Rank.KING;
        Rank actual = test.getRank();
        assertEquals("Testing rank",expected,actual);
    }


}
