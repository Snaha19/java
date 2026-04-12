import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter principle,time,rate of interest one by one");
        int p=in.nextInt();
        int t=in.nextInt();
        float r=in.nextFloat();

        float si=(p*t*r)/100;
        System.out.println("Simple intersest is :"+si);
    }
}
