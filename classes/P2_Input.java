package classes;

import java.util.Scanner;
public class P2_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input");
        try (Scanner myObj = new Scanner(System.in)) {
            // try is used to avoid errorr("message": "Resource leak: 'myObj' is never closed","source": "Java")
            System.out.print("Enter Number 1:-");
            int a = myObj.nextInt();
            System.out.print("Enter Number 2:-");
            int b = myObj.nextInt();
            System.out.println(a);
            System.out.println(b);
        }
    }
}
