package classes;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(){
        System.out.println("I am writing...");
    }
    public void refill(){
        System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Need To Change Nib");
    }
}

public class P21_Practise {
    public static void main(String[] args) {
        
    }
}
