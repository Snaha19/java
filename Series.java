import java.util.*;
import java.io.*;
public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        demo obj=new demo();
        obj.seri(n);
    }
}

class demo{
    float res=0;
    int f=1;
    int fact(int n){
        for(int i=1;i<=n;i++){
                f=f*i; 
    }
    return f;
}
    void seri(int n){
        for (int i=1;i<=n;i++){
            res=res+((float)1/(float)(fact(i)));
        }
        System.out.println(res);
    }
}
