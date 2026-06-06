package travel.flight;

public class Flight {
    

    String flightNumber;
    String destination;
    int price;

    public Flight(String flightNumber,String destination,int price){
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.price=price;
    }

    public void getDetails(){
        System.out.println("destination :"+destination);
        System.out.println("flight number :"+flightNumber);
        System.out.println("price :"+price);

    }

} 
