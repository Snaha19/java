import java.util.Scanner;


public class Occurence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter any num");
        //let say we want to find the occurences of 5 if any in the input num
        int num=input.nextInt();
        int count=0;
        while(num>0){
           int rem=num%10;
            if(rem==5){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
