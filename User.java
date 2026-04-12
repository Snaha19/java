import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int negsum=0;
        int possum=0;
        int evenpsum=0;
        
        int oddsum=0;
        System.out.println("enter numbers :");
        while(true){
            int n=in.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                negsum=negsum+n;
            }
            if(n>0){
                possum=possum+n;
            }
            if(n>0 && n%2==0){
                evenpsum=evenpsum+n;
            }
            
            if(n>0 && n%2!=0){
                oddsum=oddsum+n;
            }
            
        }
        System.out.println("sum of neg num is :"+negsum);
        System.out.println("sum of pos num is :"+possum);
        System.out.println("sum of even pos num is :"+evenpsum);
        System.out.println("sum of odd pos num is :"+oddsum);
    }
}
