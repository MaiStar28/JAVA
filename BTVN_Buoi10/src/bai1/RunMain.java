package bai1;

import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        List<Person> per=new ArrayList<Person>();
        int n;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Nhap n: ");
            n= sc.nextInt();
            for(int i=0;i<n;i++){
                Person x=new Person();
                x.nhap();
                per.add(x);
            }
        }
        catch (Exception ex){
            System.out.println("Nhap sai du lieu");
        }
        Collections.sort(per);
        System.out.println("Sap xep theo id: ");
        for (Person x : per){
            System.out.println(x.toString());
        }
        Collections.sort(per, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().compareTo(o2.getName())==0){
                    return o2.getAddress().compareTo(o1.getAddress());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println("Sap xep theo name: ");
        for (Person x : per){
            System.out.println(x.toString());
        }
    }
}
