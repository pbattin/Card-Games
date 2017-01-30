package capriotti.anthony;

import java.util.ArrayList;

/**
 * Created by prestonbattin on 1/29/17.
 */
public class BlackJack extends CardGame {

    private final double MIN_BET = 10;
    private final double MAX_BET = 200;
    private double bet;
    private double playersPot;
    private final double TWENTY_ONE = 21;
    private double playersPoints, playersPoints2;
    private double dealersPoints;
    ArrayList<Card> splitHand = new ArrayList<>();
    ArrayList<Card> splitHand2 = new ArrayList<>();


    @Override
    public void dealerDraws() {

        dealersHand.add(super.drawOne());
    }

    @Override
    public void playerDraws() {

        playersHand.add(super.drawOne());
    }

    @Override
    protected void setHands() {

        for (int i = 0; i < 2; i++) {

            dealerDraws();

            playerDraws();
        }
    }

    public BlackJack() {

        super();
        setHands();

    }

    public double getMIN_BET() {
        return MIN_BET;
    }

    public double getMAX_BET() {
        return MAX_BET;
    }

    public double getBet() {
        return bet;
    }

    public double getTWENTY_ONE() {
        return TWENTY_ONE;
    }

    public double getPlayersPot() {
        return playersPot;
    }

    public double getPlayersPoints() {
        return playersPoints;
    }

    public double getDealersPoints() {
        return dealersPoints;
    }

    public ArrayList<Card> getSplitHand() {
        return splitHand;
    }

    public ArrayList<Card> getSplitHand2() {
        return splitHand2;
    }

    public void setBet(double amount) {

        bet = amount;
    }

    public void betLose(double amount) {

        playersPot -= amount;
    }

    public void betWin(double amount) {

        playersPot += amount;
    }



    public void blackJack(double amount) {

        playersPot += amount + (1.5 * amount);
    }

    public void push() {

        playersPot += 0;
    }

    public void setBlackJackAce(Card card) {

        card.rank = Card.Rank.BLACKJACKACE;

    }

    public void setAce(Card card) {

        card.rank = Card.Rank.ACE;
    }

    public void setDealersPoints(ArrayList<Card> hand) {

        dealersPoints -= dealersPoints;
        for(Card card: hand) {

            dealersPoints += card.getRank().getValue();
        }
    }


    public void setPlayersPoints(ArrayList<Card> hand){

        playersPoints -= playersPoints;
        for(Card card: hand){

            playersPoints += card.getRank().getValue();
        }
    }

    public void setPlayersPoints2(ArrayList<Card> hand){

        playersPoints2 -= playersPoints2;
        for(Card card: hand){
            playersPoints2 += card.getRank().getValue();
        }
    }

    public double getPlayersPoints2() {
        return playersPoints2;
    }

    public void resetPlayersPoints(){

        playersPoints = 0;
    }


    public void surrender() {

        playersPot += .5 * bet;
    }

    public void split(boolean hand) {

        if (hand == true) {

           splitHand.add(playersHand.get(0));
           splitHand.add(super.drawOne());
           splitHand2.add(playersHand.get(1));
           splitHand2.add(super.drawOne());
        }

       else if (hand == false) {
            System.out.println("You cannot split ranks that are not the same, pick another " +
                    "choice");
            choice(input.nextLine());

        }
    }

    public void doubleDown(boolean win) {

        if (win == true) {

            playersPot += 2 * bet;
        } else
            playersPot -= 2 * bet;

    }

    public void splitHandHit(){

        splitHand.add((super.drawOne()));
    }

    public void splitHand2Hit(){

        splitHand2.add(super.drawOne());
    }

    public void choice(String choice) {

        if (choice.equalsIgnoreCase("surrender")) {

            surrender();
        }

        if (choice.equalsIgnoreCase("split")) {

            split(playersHand.get(0).getRank().getValue() == playersHand.get(1).getRank().getValue());

        }


    }
}
