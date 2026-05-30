import java.util.Scanner;

class title{
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        String new_word="";
        String sentence="java is a programming language";
        for(String ch : sentence.split(" ")) {
            new_word += Character.toUpperCase(ch.charAt(0)) + ch.substring(1) + " ";
        }

        System.out.println(new_word);
    }
}
