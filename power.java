import java.util.*;
import java.io.*;
import java.math.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base :");
        int x=sc.nextInt();
        System.out.println("enter exponient :");
        int y=sc.nextInt();
        demo d=new demo();
        d.print(x,y);

    }
}
class demo{
    void print(int x,int y){
        System.out.println(" "+(int)Math.pow(x, y));
    }
}
