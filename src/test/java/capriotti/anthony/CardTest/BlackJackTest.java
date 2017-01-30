package capriotti.anthony.CardTest;

import capriotti.anthony.BlackJack;
import capriotti.anthony.Card;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/29/17.
 */
public class BlackJackTest {

    BlackJack blackJack;

    @Before
    public void setup(){

        blackJack = new BlackJack();
    }

    @Test
    public void setHandsTest(){

        int expected = 2;
        int actual = blackJack.getDealersHandCount();

        Assert.assertEquals("Testing the intial hand",expected, actual);
    }

    @Test
    public void getMinBetTest(){

        double expected = 10;
        double actual = blackJack.getMIN_BET();
        Assert.assertEquals("Testing min bet", expected, actual,0);
    }

    @Test
    public void getMaxBetTest(){

        double expected = 200;
        double actual = blackJack.getMAX_BET();
        Assert.assertEquals("Testing max bet",expected,actual,0);
    }

    @Test
    public void getTwentyOneTest(){

        double expected = 21;
        double actual = blackJack.getTWENTY_ONE();
        Assert.assertEquals("Testing 21",expected,actual,0);
    }

    @Test
    public void setBetTest(){

        double expected = 100;
        blackJack.setBet(expected);
        double actual = blackJack.getBet();
        Assert.assertEquals("Testing the bet", expected,actual,0);
    }

    @Test
    public void betLoseTest(){

        double expected = -100;
        blackJack.setBet(100);
        blackJack.betLose();
        double actual = blackJack.getPlayersPot();
        Assert.assertEquals("Testing losing result",expected,actual,0);
    }

    @Test
    public void betWinTest(){

        double expected = 100;
        blackJack.setBet(100);
        blackJack.betWin();
        double actual = blackJack.getPlayersPot();
        Assert.assertEquals("Testing losing result",expected,actual,0);

    }

    @Test
    public void blackJackTest(){

        double expected = 150;
        blackJack.setBet(100);
        blackJack.blackJack();
        double actual = blackJack.getPlayersPot();
        Assert.assertEquals("Testing blackJack", expected ,actual,0);

    }

    @Test
    public void pushTest(){

        double expected = 0;
        blackJack.setBet(100);
        blackJack.push();
        double actual = blackJack.getPlayersPot();
        Assert.assertEquals("Testing blackJack", expected ,actual,0);

    }

    @Test
    public void setAceTest(){

        Card card = new Card(0,0);

        blackJack.setAce(card);

        double expected = 11;
        double actual = card.getRank().getValue();
        Assert.assertEquals("Testing setting ace value to 11", expected,actual,0);
    }

    @Test
    public void setDealersPointTest(){

        Card card = new Card(3,10);

        blackJack.setDealersPoints(card);

        double expected = 10;
        double actual = blackJack.getDealersPoints();
        Assert.assertEquals("Testing dealers points",expected,actual,0);
    }

    @Test
    public void setPlayersPointTest(){

        Card card = new Card(3,10);

        blackJack.setPlayersPoints(card);

        double expected = 10;
        double actual = blackJack.getPlayersPoints();
        Assert.assertEquals("Testing dealers points",expected,actual,0);
    }



}
