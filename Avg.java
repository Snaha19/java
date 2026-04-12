import java.util.Scanner;;
public class Avg {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter num");
        int n=in.nextInt();
        int count=0;
    
        double avg;
        int add=0;
        while(n>0){
            int rem=n%10;
            count++;
            
            add=add+rem;
            n=n/10;
        }
        System.out.println(count);
        avg=(double)add/count;
        System.out.println(avg);
    }
}
