class C3 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 100) {
            System.out.println("C1  "+i);
            i++;
        }
    }
}
class C4 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 100) {
            System.out.println("C2  "+i);
            i++;
        }
    }
}
public class P23_ThreadingUsingRunnable {
    public static void main(String[] args) {
        C3 obj = new C3();
        Thread t1 = new Thread(obj);
        C4 obj2 = new C4();
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
