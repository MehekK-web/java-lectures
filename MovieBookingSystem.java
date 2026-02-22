// Custom Exception
class SeatNotAvailableException extends Exception {

    public SeatNotAvailableException(String message) {
        super(message);
    }
}
class Movie {

    private String movieName;
    private int availableSeats;

    // Constructor
    public Movie(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    // Method to book tickets
    public void bookTicket(int seats) throws SeatNotAvailableException {

        System.out.println("Requesting " + seats + " seats for " + movieName);

        // Check seat availability
        if (seats > availableSeats) {
            throw new SeatNotAvailableException(
                "Seats not available! Only " + availableSeats + " seats left."
            );
        }

        // Booking successful
        availableSeats -= seats;
        System.out.println("Booking successful!");
        System.out.println("Remaining seats: " + availableSeats);
    }
}
public class MovieBookingSystem {

    public static void main(String[] args) {

        Movie movie = new Movie("Avengers", 5);

        try {
            movie.bookTicket(3);   // Successful booking
            movie.bookTicket(2);   // Successful booking
            movie.bookTicket(1);   // Exception occurs
        }
        catch (SeatNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}