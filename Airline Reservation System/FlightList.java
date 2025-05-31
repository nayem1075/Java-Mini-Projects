
package AirlineReservationSystem;

public class FlightList {
   
    private Flight[] flights;

    public FlightList() {
        flights = new Flight[] {
            new Flight("BG101", "Dhaka to Chittagong"),
            new Flight("BG202", "Dhaka to Cox's Bazar"),
            new Flight("BG303", "Dhaka to Sylhet"),
            new Flight("BG404", "Dhaka to Barisal"),
            new Flight("BG505", "Dhaka to Rajshahi")
        };
    }

    public void showFlights() {
        System.out.println("\nAvailable Flights:");
        for (Flight f : flights) {
            System.out.println("- " + f.getNumber() + " : " + f.getRoute());
        }
    }

    public Flight findFlight(String number) {
        for (Flight f : flights) {
            if (f.getNumber().equalsIgnoreCase(number)) {
                return f;
            }
        }
        return null;
    }
    
}
