import java.util.*;
import java.io.*;

class demo {
    void prime_cal(){
        for (int i=1;i<1000;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
class Prime {
    public static void main(String[] args) {
        demo d=new demo();
        d.prime_cal();

    }
}
