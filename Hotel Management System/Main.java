
package HotelManagementSystem;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Hotel info input
        System.out.print("Enter hotel name: ");
        String hotelName = input.nextLine();

        System.out.print("Enter hotel location: ");
        String hotelLocation = input.nextLine();

        Hotel hotel = new Hotel(hotelName, hotelLocation);

        // Room info input
        System.out.print("Enter room number: ");
        int roomNumber = input.nextInt();
        input.nextLine();  // consume newline

        System.out.print("Enter room type (Single/Double): ");
        String roomType = input.nextLine();

        Room room = new Room(roomNumber, roomType);

        // Guest info input
        System.out.print("Enter guest name: ");
        String guestName = input.nextLine();

        System.out.print("Enter guest phone number: ");
        String guestPhone = input.nextLine();

        Guest guest = new Guest(guestName, guestPhone);

        if (room.isAvailable()) {
         Booking booking = new Booking(guest, room);
        
        // Display booking info
        System.out.println("\nHotel: " + hotel.getName() + ", Location: " + hotel.getLocation());
        System.out.println("Guest: " + booking.getGuest().getName() + 
        " booked Room No: " + booking.getRoom().getRoomNumber() + 
        " (" + booking.getRoom().getType() + ")");
        System.out.println("Booked Successfully");
        System.out.println("Room available? " + booking.getRoom().isAvailable());

        // Option to cancel booking
        System.out.print("\nDo you want to cancel the booking? (yes/no): ");
        String cancel = input.nextLine();

        if(cancel.equalsIgnoreCase("yes")) {
            booking.cancel();
            System.out.println("Booking cancelled.");
            System.out.println("Room available? " + booking.getRoom().isAvailable());
        } else {
            System.out.println("Booking confirmed. Enjoy your stay!");
        }
        }
        else {
                
        System.out.println("Sorry! Room is already booked.");
                
        }
        
        input.close();
    }
}


