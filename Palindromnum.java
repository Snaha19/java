import java.util.Scanner;
public class Palindromnum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any num to check");
    int num=sc.nextInt();
    int n=num;
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    // System.out.println(rev);
    // System.out.println(num);
    if(rev==num){
        System.out.println("palindrom num");
    }
    else{
        System.out.println("not a palindrom");
    }
   } 
}
