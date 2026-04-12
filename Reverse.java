import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter any number :");
        int num=input.nextInt();
        int p=0;
        while(num>0){
            // int rem=num%10;
            // p=p*10+rem;
            // num/=10;
            int rem=num%10;
            System.out.print(rem);
            num/=10;
        }
       // System.out.println("the reverse num is :"+p);
    }
}
