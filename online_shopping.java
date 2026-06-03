class product{
    String productName;
    int price;

    product(String productName,int price){
        this.productName=productName;
        this.price=price;
    }
    void display(){
        System.out.println("loading");
    }
}
class electronics extends product{
    String warrentyPeriod;
    electronics(String productName,int price,String warrentyPeriod){
        super(productName, price);
        this.warrentyPeriod=warrentyPeriod;
    }

}
class smartphone extends electronics{
    String batterylife;
    smartphone(String productName,int price,String warrentyPeriod,String batterylife){
        super(productName, price,warrentyPeriod);
        this.batterylife=batterylife;
    }

    void display(){
        System.out.println("product name :"+productName);
        System.out.println("price :"+price);
        System.out.println("warrenty :"+warrentyPeriod);
        System.out.println("battery life :"+batterylife);
    }

}



class online_shopping {
    public static void main(String[] args) {
        
    
    smartphone s=new smartphone("iphone 17", 999, "1 year", "20 hours");

    
    s.display();
}
}
