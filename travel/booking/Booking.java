package travel.booking;
import travel.flight.Flight;
import travel.hotel.Hotel;

public class Booking {
    public void bookflight(Flight f){
        f.getDetails();
    }
    public void bookhotel(Hotel h){
        h.getDetails();
    }
}
