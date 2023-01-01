package classes;

interface Bicycle{
    int a = 10;
    void blowHorn();    
}
interface Bike{
    int b = 20;
    void run();
    private void checkLicence(){
        System.out.println("Show Licence");
    } 
    default void licence(){
        checkLicence();
        System.out.println("Noooo");
    }
}
// interface Car extends Bicycle, Bike {                 Inheritance in InterFace 

// }
// class C implements Car{
                            //    contain all methods of Bicycle Bike and car
// }
class MoterCycle {
    public void speed(){
        System.out.println("100 km per hr");
    }
}
class Bullet extends MoterCycle implements Bicycle, Bike{
    int a = 23;
    public void blowHorn(){
        System.out.println("Pee Peeep Pooh");
    }
    public void run(){
        System.out.println("RUn rUN ruN");
    }
}
public class P20_AbstractionInterfaces {
    public static void main(String[] args) {
        Bullet B = new Bullet();
        B.blowHorn();
        B.run();
        B.speed();
        B.licence();
        // System.out.println(B.a + B.b);
    }
}
