import java.util.Scanner;

public class sum_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        demo obj=new demo();
        obj.check(n);

        
    }
}
class demo{
    void check(String word){
        for(int i=1;i<=word/2;i++){
            if(isprime(i) && isprime(word-i)){
                System.out.println(word+" = "+i+" + "+(word-i));
            }
        }
            
        
    }

    boolean isprime(int n){
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                    
                }   
            }
            return true;

    }

    public void check(String word) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'check'");
    }

}