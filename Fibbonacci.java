import java.util.Scanner;
public class Fibbonacci {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //just the nth term require
    System.out.print("enter the no of term u want to see :");
    // int n=in.nextInt();
    // int a=0;
    // int b=1;
//     int count=2;
//     int c=0;
//     if(n==1){
//         System.out.println(a);
//     }
//     else if(n==2){
//         System.out.println(b);
//    }
//    else{
//     while(n>count){
        
//         c=a+b ;//next fibbo num
        
//         a=b;//shift a forward
//         b=c;//shift b forward
//         count++;
//     }
    
//     System.out.println(c);
//    } /


//whole fibbo series
    int n=in.nextInt();
    int a=0;
    int b=1;
    int c=0;
    for(int i=1;i<=n;i++){
        System.out.print(a+" ");//for whole series
        c=a+b;
        a=b;
        b=c;
    }

    //for term only
    // for(int i=3;i<=n;i++){
    //     c=a+b;
    //     a=b;
    //     b=c;
    // }
    // System.out.println(c);
    
}
}
