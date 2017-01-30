package capriotti.anthony;

/**
 * Created by prestonbattin on 1/27/17.
 */
@SuppressWarnings("Duplicates")

public class GoFish extends CardGame {

    CheckForPairs checkForPairs = new CheckForPairs();
    int playerBookCount;
    int dealerBookCount;

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

    public void playAskForRank(Card.Rank rank) {

        for (int i = 0; i < dealersHand.size(); i++) {

            if (dealersHand.get(i).getRank() == rank) {

                playersHand.add(dealersHand.get(i));

                dealersHand.remove(i);
            }
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

    public void checkForPlayerPairs(){

        checkForPairs.setRankCount(playersHand);
    }

    public void removePlayerBooks(){

        while(checkForPairs.getBook() != null){

            System.out.println("You have a book of " + checkForPairs.getBook());
            playerBookCount++;

            for(int i = 0; i < getPlayersHandCount(); i++){

                if(playersHand.get(i).getRank().equals(checkForPairs.getBook())){

                    playersHand.remove(i);
                }
            }


        }
    }

    public void checkForDealerPairs(){

        checkForPairs.setRankCount(dealersHand);
    }

    public void removeDealerBooks(){

        while(checkForPairs.getBook() != null){

            System.out.println("You have a book of " + checkForPairs.getBook());
            dealerBookCount++;

            for(int i = 0; i < getPlayersHandCount(); i++){

                if(dealersHand.get(i).getRank().equals(checkForPairs.getBook())){

                    dealersHand.remove(i);
                }
            }


        }
    }




}
