
package AirlineReservationSystem;

public class Reservation {
    
    private Passenger passenger;
    private Flight flight;

    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    public void showTicket() {
        System.out.println("\n Reservation Confirmed!");
        System.out.println("Passenger ID: " + passenger.getId());
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Flight Number: " + flight.getNumber());
        System.out.println("Destination: " + flight.getRoute());
    }
    
}
