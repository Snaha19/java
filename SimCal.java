import java.util.Scanner;
public class SimCal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two num");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int result=0;
        System.out.println("enter operator");
        char op=in.next().trim().charAt(0);
        if(op=='+'){
            result=num1+num2;
            System.out.println(result);
        }
        if(op=='-'){
            result=num1-num2;
            System.out.println(result);
        }
        
        if(op=='*'){
            result=num1*num2;
            System.out.println(result);
        }
        
        if(op=='/'){
            if(num2!=0){
            result=num1+num2;
            System.out.println(result);
        }
        
        else{
            System.out.println("divisor cant be zero");
        }
        }
        if(op=='%'){
            result=num1%num2;
            System.out.println(result);
        }
        


        


    }
}
