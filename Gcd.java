import java.util.*;
import java.io.*;

public class Gcd {
    public static void main(String[] args) {
        int x,y,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the val of x :");
        x=sc.nextInt();
        System.out.println("enter the val of y :");
        y=sc.nextInt();
        demo obj=new demo();
        result = obj.gcd(x, y);
        System.out.println("Gcd of "+x+","+y+" is "+result);
    }
}
class demo{
    int gcd(int x,int y){
        if (y==0){
            return x;  
              }
        else{
            return gcd(y,x%y);
        }
    }

    public void alpha_print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alpha_print'");
    }
}
