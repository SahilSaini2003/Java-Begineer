package classes;

class Cylinder {
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r) {
        this.radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public double CSA(){
        return 2*Math.PI*radius*height;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
    public double TSA(){
        return 2*Math.PI*radius*(height+radius);
    }
};

public class P14_cylinderStoreRadiousHeightAreaVolume {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setHeight(10);
        obj.setRadius(5);
        System.out.println("Radius = "+obj.getRadius()+"cm & Height = "+obj.getHeight()+"cm");
        System.out.println("Total Surface Area = "+obj.TSA()+" sq cm\nCurved Surface Area = "+obj.CSA()+" sq cm\nVolume = "+obj.Volume()+" cubic cm");
    }
}
