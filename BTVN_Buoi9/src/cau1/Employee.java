package cau1;

public class Employee extends Person{
    private int salary;
    public Employee(){
    }
    public Employee(String name,String address,int salary){
        super(name, address);
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee name: "+super.getName());
        System.out.println("Employee address: "+super.getAddress());
        System.out.println("Employee salary: "+salary);
    }
}
