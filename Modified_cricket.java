import java.util.Scanner;

class Cricket{
    
    static class Player{
        String name;
        int score;

        Player(){
            this.name="";
            this.score=0;
            
        }

        Player(String name,int score){
            this.name=name;
            this.score=score;
        }
    

    }
 

    void take_input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of player u want to enter");
        int size=sc.nextInt();
        sc.nextLine();

        Player[] players=new Player[size];

        for (int i=0;i<players.length;i++){
            System.out.println("enter name , score for player :"+(i+1));
            players[i].name= sc.nextLine();
            players[i].score=sc.nextInt();
            

        }

       System.out.println();

        
       
       System.out.println("players details are :");
       for (int i=0;i<players.length;i++){
         System.out.println(players[i].name+" : "+players[i].score);

       }

       
    }

    


}


public class Modified_cricket {
    public static void main(String[] args) {
       Cricket c=new Cricket();
       c.take_input();

    }
    
}
