package classes;

import java.util.Scanner;
public class P4_Percentage {
    public static void main(String[] args) {
        System.out.println("~~Enter Marks of Subject Out of 100~~");
        try (Scanner myObj = new Scanner(System.in)) {
            // try is used to avoid errorr("message": "Resource leak: 'myObj' is never closed","source": "Java")
            System.out.print("\tEnglish-");
            float Eng = myObj.nextInt();
            System.out.print("\tHindi-");
            float Hin = myObj.nextInt();
            System.out.print("\tMaths-");
            float Mth = myObj.nextInt();
            System.out.print("\tScience-");
            float Sc = myObj.nextInt();
            System.out.print("\tS.S.T-");
            float sst = myObj.nextInt();
            float per = (Eng+Hin+Mth+Sc+sst)/5;
            System.out.print("\t\tPercentage:-"+ per+"%");
        }
    }
}
