import java.util.*;
import java.io.*;

public class Sequence2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
         int n=sc.nextInt();
         demo obj=new demo();
         obj.seq(n);
    }
}
class demo{
    void seq(int n){
        int res=1,j=1,r=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                res=res*j;
                System.out.print(" "+res+",");
                j+=1;
            }
            else{
                r=r+2;
                System.out.print(" "+r+",");
            }
        }
    }
}