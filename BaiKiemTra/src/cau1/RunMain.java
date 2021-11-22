package cau1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s=sc.nextLine();
        dem(s);
    }
    public static void dem(String s){
        int dem=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'0' && s.charAt(i)<'9'){
                dem++;
            }
        }
        System.out.println("Co "+dem+" ki tu so");
    }

}
