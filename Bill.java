import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter num of electricity units consumed");
        int unit=in.nextInt();
        int rate;
        int bill=0;
        if(unit>=1 && unit<=100){
            rate=3;
            bill=unit*rate;
            System.out.println("h"+bill);
        }
        else if(unit>=101){
            rate=5;
            bill=unit*rate;
            System.out.println(bill);
        }
    }
}
