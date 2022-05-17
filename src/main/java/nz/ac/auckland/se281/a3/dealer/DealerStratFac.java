package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Participant;
import nz.ac.auckland.se281.a3.Player;
import nz.ac.auckland.se281.a3.bot.Strats;

import java.util.List;

public class DealerStratFac {

    public static DealerStrategies createStrat(List<Player> players) {
        for (Participant pl: players) {
            if (pl.netWins > 2) {
                return new NetWinner();
            }
            else {
                return new HighestBidder();
            }
        }
        return null;
    }
}
