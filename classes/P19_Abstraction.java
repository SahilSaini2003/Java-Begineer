package classes;

abstract class Shape{
    abstract int area(int a,int b);
} 
class Square extends Shape{
    public int area(int a,int b){
        return a*a;
    }
}
class Rectangle extends Shape{
    public int area(int a,int b){
        return a*b;
    }
}
public class P19_Abstraction {
    public static void main(String[] args) {
        // Shape s1 = new Shape();          can't be Created1
        Square s = new Square();
        System.out.println(s.area(5, 0));
        Rectangle r = new Rectangle();
        System.out.println(r.area(4, 5));
    }
}
