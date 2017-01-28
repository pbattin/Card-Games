package capriotti.anthony;

import java.util.ArrayList;

/**
 * Created by prestonbattin on 1/28/17.
 */
public class CheckForPairs {

   private int aceCount, twoCount, threeCount, fourCount, fiveCount, sixCount,
            sevenCount, eightCount, nineCount, tenCount, jackCount,
            queenCount, kingCount;

   public void setRankCount(ArrayList<Card> ranks) {


        for (Card rank : ranks) {

            if (rank.getRank().equals(Card.Rank.ACE)) {

                aceCount++;
            }

            if (rank.getRank().equals(Card.Rank.TWO)) {

                twoCount++;
            }

            if (rank.getRank().equals(Card.Rank.THREE)) {

                threeCount++;
            }

            if (rank.getRank().equals(Card.Rank.FOUR)) {

                fourCount++;
            }

            if (rank.getRank().equals(Card.Rank.FIVE)) {

                fiveCount++;
            }

            if (rank.getRank().equals(Card.Rank.SIX)) {

                sixCount++;
            }

            if (rank.getRank().equals(Card.Rank.SEVEN)) {

                sevenCount++;
            }

            if (rank.getRank().equals(Card.Rank.EIGHT)) {

                eightCount++;
            }

            if (rank.getRank().equals(Card.Rank.NINE)) {

                nineCount++;
            }

            if (rank.getRank().equals(Card.Rank.TEN)) {

                tenCount++;
            }

            if (rank.getRank().equals(Card.Rank.JACK)) {

                jackCount++;
            }

            if (rank.getRank().equals(Card.Rank.QUEEN)) {

                queenCount++;
            }

            if (rank.getRank().equals(Card.Rank.KING)) {

                kingCount++;
            }
        }
    }

   public Card.Rank getBook(){

        if(aceCount >= 4){

            aceCount -= 4;
            return Card.Rank.ACE;
        }

        if(twoCount >= 4){

            twoCount -= 4;
            return Card.Rank.TWO;
        }

        if(threeCount >= 4){

            threeCount -= 4;
            return Card.Rank.THREE;
        }

        if(fourCount >= 4){

            fourCount -= 4;
            return Card.Rank.FOUR;
        }

        if(fiveCount >= 4){

            fiveCount -= 4;
            return Card.Rank.FIVE;
        }

        if(sixCount >= 4){

            sixCount -=4;
            return Card.Rank.SIX;
        }

        if(sevenCount >= 4){

            sevenCount -=4;
            return Card.Rank.SEVEN;
        }

        if(eightCount >= 4){

            eightCount -=4;
            return Card.Rank.EIGHT;
        }

        if(nineCount >= 4){

            nineCount -=4;
            return Card.Rank.NINE;
        }

        if(tenCount >= 4){

            tenCount -=4;
            return Card.Rank.TEN;
        }

        if(jackCount >= 4){

            jackCount -=4;
            return Card.Rank.JACK;
        }

        if(queenCount >= 4){

            queenCount -=4;
            return Card.Rank.QUEEN;
        }

        if(kingCount >= 4){

            kingCount -=4;
            return Card.Rank.KING;
        }

       else
            return null;
        }

    public int getAceCount() {
        return aceCount;
    }

    public int getTwoCount() {
        return twoCount;
    }

    public int getThreeCount() {
        return threeCount;
    }

    public int getFourCount() {
        return fourCount;
    }

    public int getFiveCount() {
        return fiveCount;
    }

    public int getSixCount() {
        return sixCount;
    }

    public int getSevenCount() {
        return sevenCount;
    }

    public int getEightCount() {
        return eightCount;
    }

    public int getNineCount() {
        return nineCount;
    }

    public int getTenCount() {
        return tenCount;
    }

    public int getJackCount() {
        return jackCount;
    }

    public int getQueenCount() {
        return queenCount;
    }

    public int getKingCount() {
        return kingCount;
    }
}
