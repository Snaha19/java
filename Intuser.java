import java.util.Scanner;

public class Intuser {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num");
        int max=Integer.MIN_VALUE;
        while(true){

          int n=sc.nextInt();

          if(n==0){
            
            break;
          }
          if(n>max){
            max=n;
          }

        }
        System.out.println("maxium is : "+max);
        


}
}

