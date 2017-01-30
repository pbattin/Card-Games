package capriotti.anthony;

import static capriotti.anthony.CardGame.input;

/**
 * Created by prestonbattin on 1/30/17.
 */
public class BlackJackGame {


    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();
        String choice;
        boolean valid = true, valid2 = true;


        System.out.println("Place your bet");
        blackJack.setBet(input.nextDouble());

        while (blackJack.getBet() > blackJack.getMAX_BET()) {

            System.out.println("The max bet is " + blackJack.getMAX_BET() + ", please " +
                    "lower your bet and bet again");
            blackJack.setBet(input.nextDouble());
        }

        while (blackJack.getBet() < blackJack.getMIN_BET()) {

            System.out.println("The minimum bet is " + blackJack.getMIN_BET() + ", please" +
                    " raise your bet and bet again");
            blackJack.setBet(input.nextDouble());
        }

        System.out.println("You have been dealt a " + blackJack.playersHand.get(0).getRank() + " and a "
                + blackJack.playersHand.get(1).getRank());

        System.out.println("The dealer is showing a " + blackJack.dealersHand.get(0).getRank());
        System.out.println("What would you like to do?");
        input.nextLine();
        choice = input.nextLine();
        blackJack.choice(choice);

        if (choice.equalsIgnoreCase("split") &&
                blackJack.playersHand.get(0).getRank().getValue() == blackJack.playersHand.get(1).getRank().getValue()) {

            System.out.println("Hand one: " + blackJack.splitHand.get(0).getRank() + " " + blackJack.splitHand.get(1).getRank());
            System.out.println("Hand two: " + blackJack.splitHand2.get(0).getRank() + " " + blackJack.splitHand2.get(1).getRank());

            blackJack.setPlayersPoints(blackJack.splitHand);
            while (blackJack.getPlayersPoints() < blackJack.getTWENTY_ONE() && valid) {


                System.out.println("Would you like to hit or stay on the first hand?");
                choice = input.nextLine();

                if (choice.equalsIgnoreCase("hit")) {
                    blackJack.splitHandHit();
                    System.out.println("You drew a " + blackJack.splitHand.get(blackJack.splitHand.size()-1).getRank());
                }
                    blackJack.setPlayersPoints(blackJack.splitHand);

                System.out.println("Points " + blackJack.getPlayersPoints());
                for(int i = 0; i < blackJack.splitHand.size(); i++)
                    System.out.println(blackJack.splitHand.get(i).getRank());


                    for (int i = 0; i < blackJack.splitHand.size(); i++) {
                        if (blackJack.splitHand.get(i).getRank().equals(Card.Rank.ACE)) {
                            if (blackJack.getPlayersPoints() + 10 < blackJack.getTWENTY_ONE()) {
                                System.out.println("Would you like your ace to have a value of 1 or 11");
                                int aceValue = input.nextInt();
                                if (aceValue == 11) {
                                    Card ace11 = new Card(0, 13);
                                    blackJack.splitHand.set(i, ace11);
                                }
                            }
                        } else if (blackJack.getPlayersPoints() > blackJack.getTWENTY_ONE()) {
                            if (blackJack.getPlayersPoints() - 10 < blackJack.getTWENTY_ONE()) {
                                Card ace = new Card(0, 0);
                                blackJack.splitHand.set(i, ace);
                            }
                        }
                    }

                    if (blackJack.getPlayersPoints() > blackJack.getTWENTY_ONE()) {
                        System.out.println("You bust!");
                        blackJack.betLose(blackJack.getBet());
                        valid = false;
                    }
                 else if (choice.equalsIgnoreCase("stay")) {
                    valid = false;
                } else
                    valid = true;

            }

            blackJack.setPlayersPoints(blackJack.splitHand2);
            while (blackJack.getPlayersPoints2() < blackJack.getTWENTY_ONE() && valid2) {


                System.out.println("Would you like to hit or stay on the second hand?");
                choice = input.nextLine();

                if (choice.equalsIgnoreCase("hit")) {
                    blackJack.splitHand2Hit();
                    System.out.println("You drew a " + blackJack.splitHand2.get(blackJack.splitHand2.size()-1).getRank());
                }
                    blackJack.setPlayersPoints2(blackJack.splitHand2);

                System.out.println("Points " + blackJack.getPlayersPoints());
                for(int i = 0; i < blackJack.splitHand2.size(); i++)
                    System.out.println(blackJack.splitHand2.get(i).getRank());

                    for (int i = 0; i < blackJack.splitHand2.size(); i++) {
                        if (blackJack.splitHand2.get(i).getRank() == Card.Rank.ACE) {
                            if (blackJack.getPlayersPoints2() + 10 < blackJack.getTWENTY_ONE()) {
                                System.out.println("Would you like your ace to have a value of 1 or 11");
                                int aceValue = input.nextInt();
                                if (aceValue == 11) {
                                    Card ace11 = new Card(0, 13);
                                    blackJack.splitHand2.set(i, ace11);
                                }
                            }
                        } else if (blackJack.getPlayersPoints2() > blackJack.getTWENTY_ONE()) {
                            if (blackJack.getPlayersPoints2() - 10 < blackJack.getTWENTY_ONE()) {
                                Card ace = new Card(0, 0);
                                blackJack.splitHand2.set(i, ace);
                            }
                        }
                    }

                    if (blackJack.getPlayersPoints2() > blackJack.getTWENTY_ONE()) {
                        System.out.println("You bust!");
                        blackJack.betLose(blackJack.getBet());
                        valid2 = false;
                    } else if (choice.equalsIgnoreCase("stay")) {
                        valid2 = false;
                    } else
                        valid2 = true;

                }
            }
        }
    }


