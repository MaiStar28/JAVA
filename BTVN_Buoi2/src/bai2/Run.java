
package bai2;

import java.util.Scanner;

public class Run {
    public static void nhap(int[] a,int n){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Nhap a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        System.out.println();
    }
    public static void xuat(int[] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void hienThiMangDao(int[] a,int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
    public static void hienThiMangChiaHet(int[] a,int n){
        System.out.println("So a[1] la: "+a[1]);
        System.out.println("Cac so chia het cho a[1] la: ");
        for(int i=0;i<n;i++){
            if(a[i]%a[1]==0){
                System.out.print(a[i]+ " ");
            }
        }
        System.out.println();
    }
    public static boolean soNguyenTo(int a){
        if(a<2){
            return false;
        }
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void tongSNT(int[] a,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(soNguyenTo(a[i])){
                sum+=a[i];
            }
        }
        System.out.println("Tong cac snt la: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int x;
        do{
            System.out.println("=====BANG LUA CHON========");
            System.out.println("1. Nhap mang n so nguyen");
            System.out.println("2. Hien thi mang vua tao");
            System.out.println("3. Them 1 phan tu vao vi tri k");
            System.out.println("4. Xoa 1 phan tu tai vi tri k");
            System.out.println("5. Hien thi dao nguoc mang");
            System.out.println("6. Hien thi phan tu a[1] va cac so chia hiet cho a[1]");
            System.out.println("7. Xuat tong cac so nguyen to co trong mang");
            System.out.println("8. Thoat");
            System.out.print("Nhap su lua chon: ");
            x=sc.nextInt();
            switch(x){
                case 1:
                    nhap(a,n);break;
                case 2:
                    xuat(a,n);break;
                case 3:
                {
                    System.out.println("Nhap so can chen: ");
                    int val=sc.nextInt();
                    System.out.println("Nhap vi tri can chen");
                    int pos=sc.nextInt();
                    for(int i=n;i>pos-1;i--){
                        a[i]=a[i-1];
                    }
                    a[pos-1]=val;
                    n++;
                    for(int i=0;i<n;i++){
                        System.out.print(a[i]+" ");
                    }
                    System.out.println();
                    break;
                }
                case 4:
                {
                    System.out.println("Nhap vi tri can xoa: ");
                    int pos=sc.nextInt();
                    for(int i=pos-1;i<n-1;i++){
                        a[i]=a[i+1];
                    }
                    n--;
                    for(int i=0;i<n;i++){
                        System.out.print(a[i]+" ");
                    }
                    System.out.println();
                    break;
                }
            
                case 5:
                    hienThiMangDao(a,n);break;
                case 6:
                    hienThiMangChiaHet(a,n);break;
                case 7:
                    tongSNT(a,n);break;
                case 8:
                    System.out.println("Thoat");break;
            }
        }while(x>0 && x<9);
    }
}
