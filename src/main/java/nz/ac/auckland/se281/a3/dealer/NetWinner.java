package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;
import nz.ac.auckland.se281.a3.Player;

import java.util.List;

public class NetWinner implements DealerStrategies {

    public Participant.Action decideAction(Hand hand, List<Player> players){
        System.out.println("NetWinner is being used\n it is being used\n");

        int highestNetWins= 0;
        int valToBeat;
        valToBeat = 0;
        for(Player p: players) {
            if(p.netWins>highestNetWins) {
                highestNetWins=p.netWins;
                valToBeat=p.getHand().getScore();}}

                System.out.println(valToBeat);

                if(hand.getScore()<17&&valToBeat==21) {
                    return Participant.Action.HIT;
                } else if (valToBeat==21) {
                    return Participant.Action.HOLD;
                }

                if (hand.getScore()>=valToBeat ) {
                    return Participant.Action.HOLD;
                }
                else {
                    return Participant.Action.HIT;
                }
    }}



