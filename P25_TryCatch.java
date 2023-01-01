import java.util.Scanner;

public class P25_TryCatch {
    public static void main(String[] args) {
        int [] a = {45, 47, 89};
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter The Index to be Used :- ");
            int b = scan.nextInt();
            System.out.print("Enter The Number to be Divided By :- ");
            int c = scan.nextInt();
            try {
                System.out.format("The Number Present at %d is %d\n",b,a[b]);
                System.out.println("Divide Result: "+ a[b]/c);
            } 
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception Occured "+ e);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index not Available! "+ e);
            }
            catch (Exception e) {
                System.out.println("Failed To Run!\nReason: " + e);
            }
        }
    }
}
