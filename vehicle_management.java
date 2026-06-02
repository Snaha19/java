class vehicle{
    String brand;
    String model;
    int year;
    vehicle(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("brand :"+brand);
        System.out.println("model : "+model);
        System.out.println("year :"+year);
    }
}

class car extends vehicle{
    String fueltype;
    
  
    car(String brand,String model,int year,String fueltype){
        super(brand, model, year);
        this.fueltype=fueltype;
    }
}
class luxaryCar extends car{
    String feature;
    
    luxaryCar(String brand,String model,int year,String fueltype,String feature){
        super(brand,model,year,fueltype);
        this.feature=feature;
    }
        void display(){
        System.out.println("brand :"+brand);
        System.out.println("model : "+model);
        System.out.println("year :"+year);
        System.out.println("fueltype :"+fueltype);
        System.out.println("feature :"+feature);
    }
}
class vehicle_management{
    public static void main(String[] args) {
        luxaryCar l=new luxaryCar("tesla","model 5",2023,"electric","autopilot");
        l.display();
    }
}