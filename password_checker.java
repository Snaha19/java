import java.util.Scanner;

public class password_checker {
  

    static boolean check(String str){
       boolean f=false,r=false,s=false;
        if(str.length()>4){
            f=true;
         }
        

         for(char ch:str.toCharArray()){
            if (Character.isDigit(ch)){
                r=true;
            }
            if(Character.isAlphabetic(ch)){
                s=true;
            }
            
         }
       
           

        return  f && r && s && !Character.isDigit(str.charAt(0)) && !str.startsWith("_") && !str.startsWith("/");
         

    }
    public static void main(String[] args) {
1        String str="/sftyfsxgygfsatr6rt";
        System.out.println(check(str));
    }
}
