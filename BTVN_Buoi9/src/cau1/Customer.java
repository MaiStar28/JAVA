package cau1;

public class Customer extends Person{
    private int balance;
    public Customer(){
    }
    public Customer(String name,String address,int balance){
        super(name,address);
        this.balance=balance;
    }
    public void display(){
        System.out.println("Customer name: "+super.getName());
        System.out.println("Customer address: "+super.getAddress());
        System.out.println("Customer balance: "+balance);
    }
}
