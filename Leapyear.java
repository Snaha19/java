import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter year to check");
        int year= in.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.println(year+" is leapyear");

        }
        else{
            System.out.println(year +" is not leap year");
        }
    }
}
