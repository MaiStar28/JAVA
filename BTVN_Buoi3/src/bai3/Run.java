package bai3;

public class Run {
    public static void main(String[] args) {
        Guns AnhDiep= new Guns("M24",100);
        Guns AnhDoan= new Guns("K98",100);
        while(AnhDiep.getAmmoNumber()!=0 && AnhDoan.getAmmoNumber()!=0){
            AnhDiep.load(AnhDiep.random());
            AnhDoan.shoot(AnhDoan.random());
        }
        if (AnhDiep.getAmmoNumber()<=0 && AnhDoan.getAmmoNumber()>0){
            System.out.println("Anh Diep la nguoi thua");
        } else if (AnhDiep.getAmmoNumber()>0 && AnhDoan.getAmmoNumber()<=0){
            System.out.println("Anh Doan la nguoi thua");
        } else if (AnhDiep.getAmmoNumber()<=0 && AnhDoan.getAmmoNumber()<=0){
            System.out.println("Tran Hoa nhau");
        }
    }
}
