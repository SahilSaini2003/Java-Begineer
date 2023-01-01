package classes;

class Phone{
    public void showTime(){
        System.out.println("Time Is 6");
    } 
    public void on(){
        System.out.println("Phone is starting....");
    } 
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Saa Ree Gaa Maa Paa Dha Nii Saa");
    } 
    public void on(){
        System.out.println("SmartPhone is starting....");
    } 
}
public class P17_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();   // Dynamic Method Dispatch...
        obj.showTime();
        obj.on();   // Runs SmartPhone Method...
        // obj.music();   Throws An Error...
    }
}
