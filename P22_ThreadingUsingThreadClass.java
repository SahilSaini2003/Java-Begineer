class C1 extends Thread{
    public void run(){
        int i = 0;
        while (i < 100) {
            System.out.println("C1  "+i);
            i++;
        }
    }
}
class C2 extends Thread{
    public void run(){
        int i = 0;
        while (i < 100) {
            System.out.println("C2  "+i);
            i++;
        }
    }
}
public class P22_ThreadingUsingThreadClass {
    public static void main(String[] args) {
        C1 obj = new C1();
        C2 obj2 = new C2();
        obj.start();
        obj2.start();
    }
}
