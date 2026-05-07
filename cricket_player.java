import java.util.Scanner;

public class cricket_player {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of player u want to enter");
        int size=sc.nextInt();
        sc.nextLine();

        String[] names=new String[size];

        for (int i=0;i<names.length;i++){
            System.out.println("enter name :"+(i+1));
            names[i]= sc.nextLine();
            

        }

       System.out.println();
       System.out.println("enter the runs of individual ");
       int [] scores=new int[size];

       for(int i=0;i<scores.length;i++){
           System.out.println("enter scores of player :"+(i+1));
           scores[i]=sc.nextInt();

       }
        
       
       System.out.println("players name are :");
       for (int i=0;i<names.length;i++){
         System.out.print(names[i]+" ");

       }
        System.out.println();
        System.out.println("players scores are :");
        for (int i=0;i<scores.length;i++){
        System.out.print(scores[i]+" ");

       }

    System.out.println();

    score_calculation s=new score_calculation();
    // s.highest_scorer(names, scores);
    // s.average_run(names, scores);
    // s.buuble_sort(names, scores,size);

    System.out.println("enter player name u want to search :");
    sc.nextLine();
    String find=sc.nextLine();
    s.search_player(names, scores, find);
    }
}

class score_calculation{

    void highest_scorer(String[] names,int[] scores){
        int max=0;
        int index = -1;
        for(int i=0;i<scores.length;i++){
            if(scores[i]>max){
                max=scores[i];
                index=i;
            }
        }
        System.out.println("max score is :"+max);
        System.out.println("max scorer is :"+names[index]);
        
    }

    void average_run(String[] names,int[] scores){
     
        int sum=0;
        int index=-1;
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }

        int avg=sum/scores.length;
        System.out.println("average run :"+avg);

    }

    void buuble_sort(String[] names,int[] scores,int size){
        
        for (int i=0;i<(size-1);i++){
            for(int j=0;j<(size-i-1);j++){
                if(scores[j]>scores[j+1]){


                    int temp_score=scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp_score;


                    String temp_name=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp_name;
                }
            }

        }
        System.out.println("players sorted scores are :");
        for (int i=0;i<size;i++){
           System.out.println(names[i]+" : "+scores[i]);

}
    }

    void search_player(String[] names,int[] scores,String find){
    
    int loc=0;
    for(int k=0;k<names.length;k++){
        if (names[k].equals(find)){
           loc=k;
           break;
        }
        
    }
    if (loc==0) {
        System.out.println("not found ");

    }
    else{
        System.out.println((loc+1)+" is the location of "+find+"\nscore is :"+scores[loc]);
    }

   


}
}