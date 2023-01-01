class MyException extends Exception{
    @Override
    public String toString() {
        return "It Worked 1";
    }
    @Override
    public String getMessage() {
        return super.getMessage() + " It Worked 2";
    }
}
public class P26_ExceptionClass {
    public static void main(String[] args) {
        int a = 10;
        if (a > 2) {
            try {
                throw new MyException();
                // throw new ArithmeticException("Excepyon");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}