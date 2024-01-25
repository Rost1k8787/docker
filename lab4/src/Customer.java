import java.util.Vector;

class Customer {

    public String _name;
    private Vector<MovieRental> _movieRentals = new Vector<>();
    private Vector<VideoGameRental> _videoGameRental = new Vector<>(); 

    public Customer(String name) {
        _name = name;
    }

    public void addMovieRental(MovieRental arg) {
        _movieRentals.addElement(arg);
    }

    public void addVideoGameRental(VideoGameRental arg) {
        _videoGameRental.addElement(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + _name + "\n";

        calculateMovieRentals(totalAmount, frequentRenterPoints, result);

        
        calculateVideoGameRentals(totalAmount, frequentRenterPoints, result);

       
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private void calculateMovieRentals(double totalAmount, int frequentRenterPoints, String result) {
        for (MovieRental movieRental : _movieRentals) {
            double thisAmount = calculateAmountForMovie(movieRental);
            frequentRenterPoints += calculateFrequentRenterPointsForMovie(movieRental);
            
            result += "\t" + movieRental.getMovie()._title + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
    }

    private void calculateVideoGameRentals(double totalAmount, int frequentRenterPoints, String result) {
        for (VideoGameRental videoGameRental : _videoGameRental) {
            frequentRenterPoints += videoGameRental.getFrequentRenterPoints();
            result += "\t" + videoGameRental.getVideoGame() + "\t" + String.valueOf(videoGameRental.getCharge()) + "\n";
            totalAmount += videoGameRental.getCharge();
        }
    }

    private double calculateAmountForMovie(MovieRental movieRental) {
        double thisAmount = 0;

        switch (movieRental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (movieRental.getDaysRented() > 2)
                    thisAmount += (movieRental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += movieRental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (movieRental.getDaysRented() > 3)
                    thisAmount += (movieRental.getDaysRented() - 3) * 1.25;
                break;
        }

        return thisAmount;
    }

    private int calculateFrequentRenterPointsForMovie(MovieRental movieRental) {
        int frequentRenterPoints = 1;

        if ((movieRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && movieRental.getDaysRented() > 1)
            frequentRenterPoints++;

        return frequentRenterPoints;
    }
}
