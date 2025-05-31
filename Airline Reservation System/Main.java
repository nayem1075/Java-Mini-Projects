
package AirlineReservationSystem;

import java.util.Scanner;

public class Main {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FlightList flightList = new FlightList();

        System.out.println("=== Airline Reservation System ===");
        flightList.showFlights();

        System.out.print("\nEnter Flight Number: ");
        String flightNumber = input.nextLine();

        Flight selectedFlight = flightList.findFlight(flightNumber);

        if (selectedFlight != null) {
            System.out.print("Enter Passenger ID: ");
            int passengerId = input.nextInt();
            input.nextLine(); // consume newline

            System.out.print("Enter Passenger Name: ");
            String passengerName = input.nextLine();

            Passenger passenger = new Passenger(passengerId, passengerName);
            Reservation reservation = new Reservation(passenger, selectedFlight);
            reservation.showTicket();
        } else {
            System.out.println("❌ Flight not found.");
        }

        input.close();
    }
    
}
