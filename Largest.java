import java.util.Scanner;;
public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two num");
        int a=in.nextInt();
        int b=in.nextInt();
         int result=Math.max(a, b);
         System.out.println("largest of the two num is :"+result);
    }
}
