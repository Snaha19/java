import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("name :");
        String name=sc.nextLine();
        //System.out.println(name);
        System.out.println("email :");
        String email=sc.nextLine();
        //System.out.println(email);
        System.out.println("password :");
        String password=sc.nextLine();
        //System.out.println(password);

        validateEmail(email);
        password(password);
    }

    static void validateEmail(String email){
        // if(email.contains("@")){
            
        //       String[] arr=email.split("@");
        //           for (int i=0;i<arr.length;i++){
        //                System.out.println(arr[i]);
        //              }
        //   }  
        //  else{
        //     System.out.println("invalid");
        // }

        int a=email.indexOf("@");
        System.out.println(email.substring(a,email.length()));
    }

    static void password(String password){
        boolean res=false;     
        
        
        if (password.contains("~!@#$%^&*()_+*?><:?/;'[]{}|\'")){
                             res=true;
                     } 
                    
                    
        // if(password.length()>8){
        //     for(char ch:password.toCharArray()){
        //         if (Character.isUpperCase(ch) && Character.isDigit(ch) )
                     
        //         }
        //     }
    

        if(res==true){
            System.out.println("valid");

        }
        else{
            System.out.println("missing");
        }}

    }

    

