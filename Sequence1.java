import java.util.*;
import java.io.*;

public class Sequence1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter n :");
         int n=sc.nextInt();
         demo obj=new demo();
         obj.print(n);

     
    }
}

class demo{
    int a=-1,b=1,c=0,j=-1;

    void print(int n){
    for (int i=1;i<=n;i++){
        if(i%2==0){
            
            System.out.print(" "+j+",");
            j=j-3;
            
          



            }

        else{
             c=a+b;
             System.out.print(" "+c+",");
             a=b;
             b=c;
        }
    }
}
}
