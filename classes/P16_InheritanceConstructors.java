package classes;

class Cricket{
    public Cricket(){
        System.out.println("Score = 0");
    }
    public Cricket(int x){
        System.out.println("Score = "+x);
    }
}

class Wicket extends Cricket{
    public Wicket(){
        System.out.println("Wicket = 0");
    }
    public Wicket(int x ,int y){
        super(x);
        System.out.println("Wicket = "+y);
    }
}

class Over extends Wicket{
    public Over(){
        System.out.println("Over = 0");
    }
    public Over(int x, int y, int z){
        super(x,y);
        System.out.println("Over = "+y);
    }
} 

public class P16_InheritanceConstructors {
    public static void main(String[] args) {
    //    Over o = new Over(); 
    //    Over o2 = new Over(122,3,25);   Not Using error occuring.
       new Over(); 
       new Over(122,3,25); 
    }
}
