package nz.ac.auckland.se281.a3.bot;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;

public interface Strats {
    public Participant.Action decideAction(Hand hand);

    public int makeABet();
}
