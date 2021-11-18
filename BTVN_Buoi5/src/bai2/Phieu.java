package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu,tenPhieu;
    private DateTime x=new DateTime();
    private int n;
    ArrayList<SanPham> sanPham=new ArrayList<>(n);
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.print("Nhap ten phieu: ");
        tenPhieu = sc.nextLine();
        x.Nhap();
        System.out.print("Nhap so luong san pham: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            SanPham a = new SanPham();
            a.Nhap();
            sanPham.add(a);
        }
    }
    public void Xuat() {
        System.out.println("Ma phieu: " + maPhieu);
        System.out.println("Ten phieu: " + tenPhieu);
        x.Xuat();
        for (int i = 0; i < n; i++)
            sanPham.get(i).Xuat();
    }
}
