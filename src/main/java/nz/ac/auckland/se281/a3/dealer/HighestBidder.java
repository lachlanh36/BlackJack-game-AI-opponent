package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;
import nz.ac.auckland.se281.a3.Player;

import java.util.List;

public class HighestBidder implements DealerStrategies {


    public Participant.Action decideAction(Hand hand, List<Player> players) {
        int highestBet= players.get(0).getHand().getBet();
        int value = players.get(0).getHand().getScore();
        for(Player p: players) {
            if(p.getHand().getBet()>highestBet) {
                highestBet=p.getHand().getBet();
                value =p.getHand().getScore();
            }
        }



        if(hand.getScore()<17&&value==21) {
            return Participant.Action.HIT;
        } else if (value==21) {
            return Participant.Action.HOLD;
        }

        if (hand.getScore()>=value || value>21) {
            return Participant.Action.HOLD;
        }
        else {
            return Participant.Action.HIT;
        }
    }
    }


