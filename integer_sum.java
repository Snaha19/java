import java.util.*;
import java.io.*;

public class integer_sum {
    public static void main(String[] args) {
        demo obj=new demo();
        int result=obj.sum1();
        System.out.println(" "+result);
    }
}
class demo{
    int sum1(){
        int res=0;
        for (int i=100;i<=200;i++){
            if(i%7==0){
                res+=i;
            }
        }
        return res;
    }
}
