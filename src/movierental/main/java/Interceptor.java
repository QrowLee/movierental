package movierental;

public interface Interceptor {
    double calculateRentalAmount(Rental rental);

    int calculateFrequentRenterPoints(Rental rental);
}
