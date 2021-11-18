package bai2;

import java.util.Scanner;

public class DateTime {
    private Integer ngay,thang,nam;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay= sc.nextInt();
        System.out.println("Nhap thang: ");
        thang= sc.nextInt();
        System.out.println("Nhap nam: ");
        nam= sc.nextInt();
    }
    public void Xuat(){
        System.out.println(ngay+"/"+thang+"/"+nam);
    }
}
