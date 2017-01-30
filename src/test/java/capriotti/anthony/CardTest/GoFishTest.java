package capriotti.anthony.CardTest;

import capriotti.anthony.Card;
import capriotti.anthony.GoFish;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/27/17.
 */
public class GoFishTest {

    GoFish test;

    @Before
    public void setup() {
        test = new GoFish();
    }

    @Test
    public void setPlayersDeckTest() {

        int expected = 7;
        int actual = test.getPlayersHandCount();
        Assert.assertEquals("Testing initial players hand count", expected, actual);
    }

    @Test
    public void playerDrawsTest() {
        test.playerDraws();
        int expected = 8;
        int actual = test.getPlayersHandCount();
        Assert.assertEquals("Testing players hand count after drawing one", expected, actual);
    }

    @Test
    public void setDealersDeckTest() {

        int expected = 7;
        int actual = test.getDealersHandCount();
        Assert.assertEquals("Testing initial dealers hand count", expected, actual);
    }

    @Test
    public void dealerDrawsTest() {
        test.dealerDraws();
        int expected = 8;
        int actual = test.getDealersHandCount();
        Assert.assertEquals("Testing dealers hand count after drawing one", expected, actual);
    }

    @Test
    public void dealerAskForRankTest() {

        int count = 0;

        for (int i = 0; i < test.getPlayersHandCount(); i++) {

            if (test.playersHand.get(i).getRank().equals(Card.Rank.ACE)) {

                count++;
            }
        }
            test.dealerAskForRank(Card.Rank.ACE);
            int expected = 7 - count;
            int actual = test.getPlayersHandCount();
            Assert.assertEquals("If player has Ace, will give them to dealer", expected, actual);
        }

    @Test
    public void playerAskForRankTest() {

        int count = 0;

        for (int i = 0; i < test.getDealersHandCount(); i++) {

            if (test.dealersHand.get(i).getRank().equals(Card.Rank.ACE)) {

                count++;
            }
        }
        test.playAskForRank(Card.Rank.ACE);
        int expected = 7 - count;
        int actual = test.getDealersHandCount();
        Assert.assertEquals("If dealer has Ace, will give them to player", expected, actual);
    }

}

