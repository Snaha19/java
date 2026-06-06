package travel;
import travel.flight.*;
import travel.booking.*;
import travel.hotel.*;


public class travel_company {

    public static void main(String[] args) {
        Flight f=new Flight("A200", "chennai", 15000);
        Hotel h=new Hotel("taj hotel", "chennai", 150000);
        Booking b=new Booking();
        b.bookflight(f);
        b.bookhotel(h);
    }
}
