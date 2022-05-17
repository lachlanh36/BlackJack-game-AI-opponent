package nz.ac.auckland.se281.a3.bot;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;

import java.util.Random;

public class RandomStrat implements  Strats{

        @Override
        public Participant.Action decideAction(Hand hand) {
            Random rand = new Random();
            int random = rand.nextInt(2);
            if (random == 0) {
                return Participant.Action.HOLD;
            }
            else {
                return Participant.Action.HIT;
            }
        }

        @Override
        public int makeABet() {
            Random rand = new Random();
            return rand.nextInt(100) + 1;
        }

}
