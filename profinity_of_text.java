import java.util.Scanner;

public class profinity_of_text {
    

public static void main(String args[]){
     Scanner sc=new Scanner(System.in);


        String s=sc.nextLine();

        String mal="bad vile suck ugly"; 
        String[] arr=mal.split(" "); 

        for(int i=0;i<arr.length;i++){

        if (s.contains(arr[i]))
            { 
                String new_s=s.replace(arr[i],"***"); 
            System.out.println(new_s);

        }
        }
        }
    }
