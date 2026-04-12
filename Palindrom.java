import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String word=in.nextLine();
        
        //method 1:time consumming and space consumming
        
        
        // String rev="";
        // for(int i=word.length()-1;i>=0;i--){
        //     rev=rev+word.charAt(i);
        // }
        //     System.out.println(rev);
        //     System.out.println(word);
            
        // if(rev.equalsIgnoreCase(word)){
        //         //System.out.println(rev);
        //         System.out.println("palindrom");

        //     }
        //     else{
        //         System.out.println("not palindrom");
        //     }

//method 2
StringBuilder sb=new StringBuilder(word);
String rev1=sb.reverse().toString();
if(rev1.equalsIgnoreCase(word)){
                //System.out.println(rev);
                System.out.println("palindrom");

            }
            else{
                System.out.println("not palindrom");
            }



        }
    }

