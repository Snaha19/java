
public class Lcm {
    
    public static void main(String[] args) {
        int a=4;
        int b=5;
        // int lcm=(a>b)?a:b;
        // while (true) {
        //     if(lcm%a==0 &&lcm%b==0)
        //     {System.out.println(lcm);
        //     break;}
        //     lcm++;
        // }
        
        
        int gcd=findGcd(a,b);
        int lcm=a*b/gcd;
        System.out.println(lcm);
         
    }
    public static int findGcd(int a,int b){
            while (b!=0) {
                int temp=b;
                b=a%b;
                a=temp;
                
            }
            return a;
        }
}
