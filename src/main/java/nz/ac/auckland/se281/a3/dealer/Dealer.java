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
	private final int value;

	public Dealer(String name, List<Player> players) {
		super(name);
		int value1;


	this.players = players;
	int highestBet= players.get(0).getHand().getBet();
	value1 = players.get(0).getHand().getScore();
	for(Player p: players) {
		if(p.getHand().getBet()>highestBet) {
			highestBet=p.getHand().getBet();
			value1 =p.getHand().getScore();
			}
	}
		value = value1;
	}


	@Override
	public Action decideAction(Hand hand) {
		return Action.HOLD;
	}

}
