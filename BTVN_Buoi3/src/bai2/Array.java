package bai2;


import java.util.Scanner;

public class Array {
    private int n;
    private int[] a;
    public void inputData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang: ");
        n= sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
    }
    public void show(){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public int sum(){
        int s=0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        return s;
    }
    public void filter(Boolean flag){
        if(flag){
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.println(a[i]+ " ");
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(a[i]%2!=0){
                    System.out.println(a[i]+ " ");
                }
            }
        }
    }
    public double average(){
        if(n==0){
            return 0;
        }else{
            return (double)sum()/n;
        }
    }
    public Array(){
    }
    public Array(int n,int[] a){
        this.a=a;
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
}
