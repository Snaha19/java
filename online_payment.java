abstract class payment{
    String transactionid;
    int amount;

    payment(String transactionid,int amount){
        this.transactionid=transactionid;
        this.amount=amount;
    }
    abstract void proceespayment();
}
class creditcard_payment extends payment{
    creditcard_payment(String transactionid, int amount) {
        super(transactionid, amount);
        
    }

    void proceespayment(){
      double fee=amount*0.02;
      System.out.println("fee :"+fee);
      System.out.println("transaction id :"+transactionid);
      System.out.println("amount :"+(amount+fee));
    }


}
class paypal_payment extends payment{
    paypal_payment(String transactionid, int amount) {
        super(transactionid, amount);
        
    }

    void proceespayment(){
        double fee=amount*0.03;
        System.out.println("fee :"+fee);
        System.out.println("transaction id :"+transactionid);
        System.out.println("amount :"+(amount+fee));
    }
}

// Okay, why do we need a reference of abstract class?

public class online_payment {
    public static void main(String[] args) {
        creditcard_payment c=new creditcard_payment("qsdrstrert123", 1000);
        c.proceespayment();
        paypal_payment p=new paypal_payment("assaeq1", 1000);
        p.proceespayment();
        
    }
}
