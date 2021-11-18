package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n=sc.nextInt();
        ArrayList<DieuHoa> dieuHoa =new ArrayList<>(n);
        for(int i=0;i<n;i++){
            DieuHoa a=new DieuHoa();
            a.Nhap();
            dieuHoa.add(a);
        }
        int dem=0;
        for(int i=0;i<dieuHoa.size();i++){
            if(dieuHoa.get(i).tenHang.compareTo("Electrolux")==0){
                dem++;
                dieuHoa.get(i).Xuat();
            }
        }
        if(dem==0){
            System.out.println("Khong ton tai");
        }
        DieuHoa min= dieuHoa.get(0);
        for(int i=0;i<dieuHoa.size();i++){
            if(dieuHoa.get(i).getGiaBan()<min.getGiaBan()){
                min=dieuHoa.get(i);
            }
        }
        System.out.println("San pham co gia ban thap nhat: ");
        dieuHoa.get(0).Xuat();
    }
}
