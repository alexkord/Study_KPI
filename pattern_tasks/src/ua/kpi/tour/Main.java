package ua.kpi.tour;

public class Main {
    public static void main(String[] args) {
        Tour tour = new Tour.TourBuilder("New York")
                .transferToAirport(false)
                .transferfromAirport(true)
                .flightThere(true)
                .flightBack(true)
                .bookingHotel(false)
                .insurance(true)
                .build();

        System.out.println(tour);
    }
}
