import java.util.Scanner;;
public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("input num");
        int n=in.nextInt();
        int fact=1;
        if(n==0){
            System.out.println("Factorial of "+n+" is "+fact);

        }
        else{
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factoriall of "+n+" is "+fact);
    }
    }
}
