
package HotelManagementSystem;

public class Booking {
    
    private Guest guest;
    private Room room;

    public Booking(Guest guest, Room room) {
        this.guest = guest;
        this.room = room;
        room.setAvailable(false);
    }

        public Guest getGuest() { 
        return guest; 
    }
    
    public Room getRoom() { 
        return room; 
    }
    
    public void cancel() {
        room.setAvailable(true);
    }

}
