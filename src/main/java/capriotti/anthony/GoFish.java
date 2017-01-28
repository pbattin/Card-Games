package capriotti.anthony;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prestonbattin on 1/27/17.
 */
public class GoFish extends CardGame {

   public ArrayList<Card> playersHand = new ArrayList<>();
   public ArrayList<Card> dealersHand = new ArrayList<>();

    @Override
    public void dealerDraws(){

        dealersHand.add(super.drawOne());
    }

    @Override
    public void playerDraws(){

        playersHand.add(super.drawOne());
    }

    @Override
    protected void setHands(){

        for(int i = 0; i < 7; i++){
            dealerDraws();
            playerDraws();
        }
    }

    public GoFish(){

        super();
        setHands();


    }

    public int getPlayersHandCount() {

        return playersHand.size();
    }

    public void playAskForRank(Card.Rank rank) {

        for (int i = 0; i < dealersHand.size(); i++) {

            if (dealersHand.get(i).getRank() == rank) {

                playersHand.add(dealersHand.get(i));
                dealersHand.remove(i);
            }
        }
    }

    public int getDealersHandCount() {

        return dealersHand.size();
    }

    public void getDealersRanks(){

          Iterator<Card> itr = dealersHand.iterator();
           while (itr.hasNext()) {
               Card rank = itr.next();
               System.out.println(rank.rank);
           }
       }


    public void dealerAskForRank(Card.Rank rank){

            for(int i =0; i < playersHand.size(); i++) {

                if (playersHand.get(i).getRank() == rank) {

                    dealersHand.add(playersHand.get(i));
                    playersHand.remove(i);
                }
            }
    }




}
