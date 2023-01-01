package classes;

import java.util.Scanner;
public class P6_Multiplication_Table {
    static void table(int a){
        for (int i = 1; i <= 10; i++) {
            System.out.println(a+" X "+i+" = "+i*a);
        }
    }
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            // try is used to avoid errorr("message": "Resource leak: 'myObj' is never closed","source": "Java")
            System.out.print("Enter a Number:-");
            int num;
            num = myObj.nextInt();
            table(num);
        }
    }
}
