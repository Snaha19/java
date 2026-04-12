import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=n;
        int prod=1;
        int sum=0;
        while(num>0){
            int rem=num%10;
            prod=prod*rem;//if they say prod of each digit
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(prod);
        System.out.println(sum);
        //int sub=prod-sum;
        int sub1=n*n-sum;//if just the product need
        
       // System.out.println("after subracting the product and sum of the num  "+n+" the result is "+sub);
        System.out.println("after subracting the product and sum of the num  "+n+" the result is "+sub1);

    }
}
