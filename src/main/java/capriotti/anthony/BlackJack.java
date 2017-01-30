package capriotti.anthony;

/**
 * Created by prestonbattin on 1/29/17.
 */
public class BlackJack extends CardGame {

    private final double MIN_BET = 10;
    private final double MAX_BET = 200;
    private double bet;
    private double playersPot;
    private  final double TWENTY_ONE = 21;
    private double playersPoints;
    private double dealersPoints;




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

        for(int i = 0; i < 2; i++){

            dealerDraws();

            playerDraws();
        }
    }

    public BlackJack(){

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

    public void setBet(double amount){

        bet = amount;
    }

    public void betLose(){

        playersPot -= bet;
    }

    public void betWin(){

        playersPot += bet;
    }

    public void blackJack(){

        playersPot += 1.5 * bet;
    }

    public void push(){

        playersPot = playersPot;
    }

    public void setAce(Card card){

        card.rank = Card.Rank.BLACKJACKACE;

    }

    public void setDealersPoints(Card card){

       dealersPoints += card.rank.getValue();

    }

    public void setPlayersPoints(Card card){

        playersPoints += card.rank.getValue();
    }

}
