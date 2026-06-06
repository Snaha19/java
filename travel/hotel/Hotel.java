package travel.hotel;


public class Hotel{
    String hotelname;
    String location;
    int price;

    public Hotel(String hotelname,String location,int price){
        this.hotelname=hotelname;
        this.location=location;
        this.price=price;
    }
    public void getDetails(){
        System.out.println("hotel name :"+hotelname);
        System.out.println("location :"+location);
        System.out.println("price :"+price);

    }
}
