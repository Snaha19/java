import java.util.*;
import java.io.*;

class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] x=new int[3][3];
        B obj=new B();
        obj.getinput(x);
        obj.sum(x);
        obj.matrix(x);

}
}

class B{
    void getinput(int[][] x){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter elements of array :");
       
//input
    for (int i=0;i<3;i++){
       for(int j=0;j<3;j++){
        x[i][j]=sc.nextInt();
    }
}
    
//output

    System.out.println("the elements of array are :");
    for (int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(x[i][j]+"  ");
    }
    System.out.println();
} 
  


    }

  void sum(int [][] x){
    
    for (int i=0;i<3;i++){
          int s=0,c=0;
        for(int j=0;j<3;j++){
          
            if(j==2){
                s=s-x[i][j];
                
            }
            else{
                s=s+x[i][j];
               
            }
          
            

        }
          System.out.println(s);
    }
    
  }

  void matrix(int[][] x){
    int[][] y;
     for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
          System.out.print(x[i][j]+" ");


        }
        System.out.println();
     }
  }

}