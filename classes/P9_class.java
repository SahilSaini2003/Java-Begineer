package classes;

class Student {
    int rollNo = 23;
    String name = "Sam";
    public void printDetails(){
        System.out.println("Your Roll No is "+ rollNo);
        System.out.println("Your Name is "+ name);
    }
    void printDetail(){
        System.out.println("Your Roll No is "+ rollNo);
        System.out.println("Your Name is "+ name);
    }
}
public class P9_class {
    int a;
    public static void main(String[] args) {
        P9_class s =  new P9_class();
        Student s1 =  new Student();
        Student s2 =  new Student();
        s1.rollNo = 20;
        s.a = 100;
        System.out.println(s.a);
        s1.name = "Sahil";
        s2.rollNo = 10;
        s2.name = "Jon";
        s1.printDetails();
        s2.printDetails();
    }
}