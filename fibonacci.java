import java.util.*;
import java.io.*;

class fibonacci{
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = sc.nextInt();

        demo obj= new demo();
        obj.fibo(x);

        
       
    }
}

class demo{
    void fibo(int n){
        int a=-1,b=1,c=0,sum1=0;
        for(int i=1;i<=n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            sum1+=c;
        
    }
    System.out.println("\n"+sum1);
        
}
}
