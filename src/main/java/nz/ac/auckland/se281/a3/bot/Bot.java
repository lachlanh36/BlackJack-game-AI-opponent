package nz.ac.auckland.se281.a3.bot;

import nz.ac.auckland.se281.a3.Hand;
import nz.ac.auckland.se281.a3.Player;
import java.util.Random;

/**
 * you should change this class for TASK 1
 */
public class Bot extends Player {
	private final Strats strategy;

	public Bot(String name, String strategyy) {
		super(name);



		this.strategy = StratFactory.createStrat(strategyy);
	}

	@Override
	public Action decideAction(Hand hand) {


		return strategy.decideAction(hand);
	}

	@Override
	public int makeABet() {
		return strategy.makeABet();
	}

}
