package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;
import nz.ac.auckland.se281.a3.Player;

import java.util.List;

public interface DealerStrategies {

        public Participant.Action decideAction(Hand hand, List<Player> players);

}
