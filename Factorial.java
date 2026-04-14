import java.util.Scanner;;
public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("input num");
        int n=in.nextInt();
        int result;
        demo obj=new demo();
        result=obj.fact(n);
        System.out.println("Factorial of "+n+" is "+result);


}
}
class demo{
    int fact(int n){
        int f = 1;
        if(n==0||n==1){
            return 1;
        }
        else{
            for(int i=1;i<=n;i++){
                f=f*i;
            }
            return f;
        }

    }
}
