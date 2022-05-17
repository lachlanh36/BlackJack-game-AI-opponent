package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;

public class NetWinner implements DealerStrategies {

    public Participant.Action decideAction(Hand hand) {
        return Participant.Action.HOLD;
    }

}

