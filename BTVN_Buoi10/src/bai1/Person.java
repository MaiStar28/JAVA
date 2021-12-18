package bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Person implements Comparable<Person>{
    private int id;
    private String name;
    private String address;
    public Person(){
    }
    public Person(String name,String address,int id){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap id: ");
        id= sc.nextInt();
        System.out.println("Nhap name: ");
        sc.nextLine();
        name=sc.nextLine();
        System.out.println("Nhap address: ");
        address=sc.nextLine();
    }
    public int compareTo(Person o){
        return getId() - o.getId();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
