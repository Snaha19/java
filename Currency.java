import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter currency in indian rupess");
        int india=in.nextInt();
        double usd=india/88.795;
        System.out.println("indian currency "+india+" = "+usd+" doller");
    }
}
