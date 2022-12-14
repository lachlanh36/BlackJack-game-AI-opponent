package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Participant;
import nz.ac.auckland.se281.a3.Player;

import java.util.List;

public class DealerStratFac {

    public static DealerStrategies createDealerStrat(List<Player> players) {
        for (Player pl: players) {
            System.out.println(pl.netWins+"\n net wins");

            if (pl.netWins >= 2) {
                return new NetWinner();
            }}

        return new HighestBidder();

        }

    }

