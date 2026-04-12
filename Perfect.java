import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter num");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println("perfect num");
        }
        else{
            System.out.println("not a perfect num");
        }
    }
}
