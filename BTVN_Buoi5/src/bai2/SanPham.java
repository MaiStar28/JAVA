package bai2;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class SanPham {
    private String maSp,tenSP;
    private Integer soLuong;
    private Double donGia;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sp: ");
        maSp= sc.nextLine();
        System.out.println("Nhap ten sp: ");
        tenSP= sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong= sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia= sc.nextDouble();
    }
    public void Xuat() {
        System.out.printf(" %-20s %-20s %-10d %-15.3f %-15.3f\n", maSp, tenSP, soLuong, donGia, soLuong*donGia);
    }
}
