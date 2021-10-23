
package bai1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập a= ");
        int a= sc.nextInt();
        System.out.print("Nhập b= ");
        int b= sc.nextInt();
        System.out.print("Nhập c= ");
        int c= sc.nextInt();
        System.out.println("So lon nhat la: " + maxNumber(a, b, c));        
    }
    public static int maxNumber(int a,int b,int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }
}
