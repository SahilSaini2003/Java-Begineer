package classes;

import java.util.Scanner;
import java.util.Random;
public class P13_guessTheNumber{
    public static int RandomNum(){
        Random num = new Random();
        int n = num.nextInt(100);
        return n;
    }
    public static void main(String[] args) {
        int count = 1;
        try (Scanner myObj = new Scanner(System.in)) {
            int n = RandomNum();
            System.out.println("Lets Goo And Start the Game");
            System.out.println("Enter a Number:-");
            int guess = myObj.nextInt();
            while (guess != n) {
                if (guess > n) {
                    System.out.println("Lower Number Please.");
                    guess = myObj.nextInt();
                    count++;
                }
                else if (guess < n){
                    System.out.println("Higher Number Please.");
                    guess = myObj.nextInt();
                    count++;
                }
            }
        }
        System.out.format("Hurray! You Got it in %d tries.",count);
    }
} 