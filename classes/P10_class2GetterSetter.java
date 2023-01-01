package classes;

class Employee {
    int salary;
    String name;
    public void setSalary(int s) {
        salary=s;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class P10_class2GetterSetter {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Sahil");
        e1.setSalary(20000);
        System.out.println("sal = "+ e1.getSalary()+" Name = "+e1.getName());
    }
}
