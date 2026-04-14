import java.util.Scanner;
import java.lang.Math;
public class Sequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n :");
        int n=in.nextInt();
        demo obj=new demo();
        obj.seq(n);

    }
}

class demo{
    void seq(int n){
        int a=-1,b=1,c=0,j=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                
                System.out.print(" "+(int)Math.pow(2,j)+",");
                j++;
                
                
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
