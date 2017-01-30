package capriotti.anthony.CardTest;

import capriotti.anthony.Card;
import capriotti.anthony.CheckForPairs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by prestonbattin on 1/28/17.
 */
public class CheckForPairsTest {

    ArrayList<Card> cards;
    CheckForPairs pairs;
    Card card1 = new Card(0,0);


    @Before
    public void setup() {

       cards = new ArrayList<>();

       for(int i = 0; i < 4; i++){

           cards.add(card1);
       }

       pairs = new CheckForPairs();

    }

    @Test
    public void setRankCountTest(){

        pairs.setRankCount(cards);
        int expected = 4;
        int actual = pairs.getAceCount();
        Assert.assertEquals("Checking ace count",expected,actual);

    }

    @Test
    public void getBookTest(){

        pairs.setRankCount(cards);
        Card.Rank expected = Card.Rank.ACE;
        Card.Rank actual = pairs.getBook();
        Assert.assertEquals("Book of Ace should be returned", expected,actual);

    }
}
