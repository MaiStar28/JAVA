package bai1;

import java.net.SocketOption;
import java.util.Scanner;

public class SanPham {
    protected String maSP,tenSP,tenHang,ngayNhap;


    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sp: ");
        maSP= sc.nextLine();
        System.out.println("Nhap ten sp: ");
        tenSP= sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang= sc.nextLine();
        System.out.println("Nhap ngay nhap: ");
        ngayNhap= sc.nextLine();
    }
    public void Xuat(){
        System.out.printf(" %-20s %-20s %-20s %-20s", maSP, tenSP, tenHang, ngayNhap);
    }
}
