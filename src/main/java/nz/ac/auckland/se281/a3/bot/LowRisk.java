package nz.ac.auckland.se281.a3.bot;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;

import java.util.Random;

public class LowRisk implements Strats {

    @Override
    public Participant.Action decideAction(Hand hand) {
        if (hand.getScore() > 16) {
            return Participant.Action.HOLD;
        } else {
            return Participant.Action.HIT;
        }

    }

    @Override
    public int makeABet() {
        Random rand = new Random();
        int bet = (rand.nextInt(41) + 10);
        System.out.println(bet + "is the bots bet");
        return bet;
    }

}


