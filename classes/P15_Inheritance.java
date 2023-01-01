package classes;

class Computer{
    private int ram;
    public int getRAM(){
        return ram;
    }
    public void setRAM(int r){
        this.ram = r ;
    }
}

class Pc extends Computer{
    // Inheritance
}

// class Keyboard{
//     private String brand;
//     public String getRAM(){
//         return brand;
//     }
//     public void setRAM(String r){
//         this.brand = r ;
//     }
// }
                            // *** Multilevel Inheritance Not Possible ***
// class Mouse{
//     private String brandM;
//     public String getRAM(){
//         return brandM;
//     }
//     public void setRAM(String r){
//         this.brandM = r ;
//     }
// }

// class Parts extends Keyboard, Mouse{

// }
public class P15_Inheritance {
    public static void main(String[] args) {
        Pc obj = new Pc();
        obj.setRAM(8);
        System.out.println(obj.getRAM());    
    }
}
