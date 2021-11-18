package bai1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DieuHoa extends SanPham {
    private double congSuat,giaBan;

    public double getGiaBan() {
        return giaBan;
    }


    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap cpng suat: ");
        congSuat= sc.nextDouble();
        System.out.println("Nhap gia ban: ");
        giaBan= sc.nextDouble();

    }
    public void Xuat(){
        super.Xuat();
        System.out.printf(" %-20.3f %-20f \n", congSuat, giaBan);
    }
}
