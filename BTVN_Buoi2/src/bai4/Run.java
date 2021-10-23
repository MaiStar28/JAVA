
package bai4;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s=sc.nextLine();
        s=s.trim();
        s=s.replaceAll("[0-9]","");
        s=s.replaceAll("\\s+"," ");
        String[] t=s.split(" ");
        s="";
        for(int i=0;i<t.length;i++){
            s+=t[i].substring(0,1).toUpperCase()+t[i].substring(1).toLowerCase()+" ";
        }
        System.out.println(s);
    }
}
