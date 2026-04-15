import java.util.random.*;
import java.io.*;


import java.util.Random;

public class RandomNumbers {

    // public static void generateRandomNumbers() {
    //     Random rand = new Random();

    //     for (int i = 0; i < 5; i++) {
    //         int num = rand.nextInt(100) + 1; // 1 to 100
    //         System.out.println(num);
    //     }
    // }
    public class RandomNumbers {

    public static void generateRandomNumbers() {

        for (int i = 0; i < 5; i++) {
            int num = (int)(Math.random() * 100) + 1; // 1 to 100
            System.out.println(num);
        }
    }

 

    public static void main(String[] args) {
        generateRandomNumbers();
    }
}