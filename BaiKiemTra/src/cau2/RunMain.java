package cau2;

import java.util.Scanner;

public class RunMain {
    static Scanner sc= new Scanner(System.in);
    Book a=new Book();
    int choose;
    do{
        System.out.println("=============MENU=======================");
        System.out.println("1.Add book");
        System.out.println("2.Edit book by id");
        System.out.println("3.Delete book by id");
        System.out.println("4.Sort books by name");
        System.out.println("5.Sort books by price");
        System.out.println("6.Show all books");
        System.out.println("7.Edit");
        System.out.println("Nhap lua chon: ");
        choose=sc.nextInt();
        switch (choose){
            case 1:
                add(a);
                break;
        }while(choose!=0);
    }
}

public static void add(Book a){
    System.out.print("Nhap id:");
    a.setId(sc.nextLine());
    System.out.print("Nhap ten:");
    a.setName(sc.nextLine());
    System.out.print("Nhap ng thanh lap:");
    a.setPublisher(sc.nextLine());
    System.out.print("Nhap gia:");
    a.setPrice(sc.nextDouble());
    System.out.print("Nhap ten trang:");
    a.setNumberOfPage(sc.nextLine());
    System.out.print("Nhap tac gia:");
    a.setAuthor(sc.nextLine());
}