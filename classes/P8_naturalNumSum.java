package classes;

public class P8_naturalNumSum {
    static int Sum(int a) {
        if (a > 0) {
            return a += Sum(a-1);
        } 
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int s = Sum(10);
        System.out.println(s);
    }
}
