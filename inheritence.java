interface FitnessTracker{


    public void countSteps(int stepsCount);
    public void calculateCalories(int stepCount);
}

interface NotificationReceiver{
  
    public void receiveNotification(String notificationMess);
    public void displayNotification(String mess);
}



class Smart_watch implements FitnessTracker,NotificationReceiver{
    String watchBrand="sonata";
    String model="a132";

    void showTime(){
        System.out.println("current time ");
    }

    void display(){
        System.out.println(watchBrand);
        System.out.println(model);
    }

    public void countSteps(int stepsCount){
        System.out.println("stepcount is : "+stepsCount);
    }
    public void calculateCalories(int stepCount){
        System.out.println("calories :"+stepCount*0.5);
    }
    public void receiveNotification(String notificationMess){
        System.out.println(notificationMess);
    }
    public void displayNotification(String mess){
        System.out.println(mess+" good day ");
    }

}

class inheritence{
    public static void main(String[] args) {
        Smart_watch sc=new Smart_watch();
        sc.display();
        sc.showTime();
        sc.countSteps(100);
        sc.calculateCalories(100);
        sc.receiveNotification("hello");
        sc.displayNotification("welcome");
    
    }
}
