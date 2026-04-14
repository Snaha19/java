public class sum_prime {
    public static void main(String[] args) {
        
    }
}
class demo{
    void isprime(int n){
            int count=0;
            boolean isprime=false;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    count++;
                    break;
                }   
            }
            if (count==0){
                isprime=true;
            }
            else{
                isprime=false;
            }
    }

}