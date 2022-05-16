package nz.ac.auckland.se281.a3.bot;

public class StratFactory {

    public static Strats createStrat(String type) {
        switch (type) {
            case "LR":
                return new LowRisk();

            case "HR":
                return new HighRisk();

            case "R":
                return new RandomStrat();

            default:
                System.err.println("invalid strategy");
                System.exit(0);
        }
        return null;
    }
}
