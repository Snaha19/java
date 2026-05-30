import java.util.Scanner;

class domain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url="https://www.google.com/search?q=java";
        String str=url.split("/")[2];
        System.out.println(str.substring(str.indexOf(".")+1));
        

        
    }
}