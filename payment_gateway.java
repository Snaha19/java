interface upiPayment {
    void viaupi();
}
interface cardpayment {
    void viacard();
}
class onlinePayment implements upiPayment,cardpayment{
    public void viaupi(){
        System.out.println("hi upi");
    }
    public void viacard(){
        System.out.println("hi card");
    }

}

public class payment_gateway {
    public static void main(String[] args) {
        onlinePayment o=new onlinePayment();
        o.viacard();
        o.viaupi();
    }
    
}
