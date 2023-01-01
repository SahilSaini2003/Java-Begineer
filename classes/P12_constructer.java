package classes;

public class P12_constructer {
    int id;
    String name;
    public P12_constructer(int a, String b){
        id = a;
        name = b;
    }
    public void printDetail(){
        System.out.format("My Id is %d & Name is %s",id,name);
    }
    public static void main(String[] args) {
        P12_constructer obj = new P12_constructer(1, "Sahil");
        obj.printDetail();
    }
}
