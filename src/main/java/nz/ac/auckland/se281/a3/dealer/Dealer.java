package nz.ac.auckland.se281.a3.dealer;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Participant;
import nz.ac.auckland.se281.a3.Player;

import java.util.List;

/**
 * 
 * You should change this class for Task 2
 *
 */
public class Dealer extends Participant {

	private final List<Player> players;
	public DealerStrategies dealerStrategies;

	public Dealer(String name, List<Player> players) {
		super(name);

		this.players = players;



	}


	@Override
	public Action decideAction(Hand hand) {
		this.dealerStrategies = DealerStratFac.createDealerStrat(players);
		return dealerStrategies.decideAction(hand, players);


	}

}
