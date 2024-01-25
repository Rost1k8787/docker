public class Ps3Game {

    private static double CONSOLE_COST = 299.99;
    private static double CONSOLE_RENTAL_COST = 29.99;
    private static int NUM_DAYS_BASE_PRICE = 4;
    private static double BASE_PRICE = 4;
    private static double EXTRA_PRICE = 1.25;
    private static int FREQUENT_RENTER_POINTS = 2;
    private static String CONSOLE_NAME = "Playstation 3";

    private String _gameName;

    public Ps3Game(String name) {
        _gameName = name;
    }

    public String getGameName() {
        return _gameName;
    }

    public String getConsoleName() {
        return CONSOLE_NAME;
    }

    public double getCharge(int daysRented, boolean consoleRented) {
        double result = BASE_PRICE;
        if (daysRented > NUM_DAYS_BASE_PRICE) {
            result += (daysRented - NUM_DAYS_BASE_PRICE) * EXTRA_PRICE;
        }
        if (consoleRented) {
            result += CONSOLE_RENTAL_COST + daysRented;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented, boolean consoleRented) {
        if (consoleRented && daysRented > NUM_DAYS_BASE_PRICE) {
            return FREQUENT_RENTER_POINTS + daysRented - NUM_DAYS_BASE_PRICE;
        } else {
            return FREQUENT_RENTER_POINTS;
        }
    }

    @Override
    public String toString() {
        return _gameName;
    }
}
