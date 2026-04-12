import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any num");
        int num=in.nextInt();
        int n=num;
        double sum=0;
        int rem=0;
        while(n>0){
         rem=n%10;
            //sum=sum+rem*rem*rem;
            sum=sum+Math.pow(rem,3);
            n=n/10;
        }
        if(num==sum){
            System.out.println("armstrong num");
        }
        else{
            System.out.println("not a armstrong num");
        }
    
    }
}
