import java.util.Scanner;
public class Case {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    char ch=in.next().trim().charAt(0);
    if(ch>='a' && ch<='z'){
        System.out.println("lowercasw");
    }
    else if(ch>='A' && ch<='Z'){
        System.out.println("uppercase");
    }
    else{
        System.out.println("enter alphabet to check");
    }
    }
  }  

