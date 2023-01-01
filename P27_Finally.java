public class P27_Finally {
    static public int sum() {
        int a = 10;
        // int b = 0;
        int b = 10;
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I am Running");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        int a = 10;
        // int b = 0;
        int b = 2;
        while (true) {
            try {
                System.out.println(a/b);
            } 
            catch (Exception e) {
                System.out.println(e);
                break;
            } 
            finally {
                System.out.println("I am Still Running at b "+b);
            }
            b--;
        }
    }
}
