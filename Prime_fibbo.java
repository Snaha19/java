import java.util.*;
import java.io.*;

class second{
    int a=0,b=1,c=0,COUNT=0;
    void fibbo(){
        for (int i=1;;i++){
            c=a+b;
            a=b;
            b=c;
            int count=0;
            for(int j=1;j<=a;j++){
                if(a%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(a);
                COUNT++;
                if(COUNT==8){
                    break;
                }
                
            }

        }
    }
}




class Prime_fibbo {
    public static void main(String[] args) {
        second s=new second();
        s.fibbo();    
    }
}
