
package AirlineReservationSystem;

public class Flight {
    
    private String number;
    private String route;

    public Flight(String number, String route) {
        this.number = number;
        this.route = route;
    }

    public String getNumber() {
        return number;
    }

    public String getRoute() {
        return route;
    }
    
}
