public class Alphabet {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.alpha_print();
    }

}
class demo{
    void alpha_print(){
        for(char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
    }

    
}
