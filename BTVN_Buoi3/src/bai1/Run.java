package bai1;

public class Run {
    public static void main(String[] args) {
        Person ps1=new Person("Mai",19,"Nữ","Game");
        Person ps2=new Person();
        System.out.println(ps1.toString());
        ps2.setAge(18);
        ps2.setName("Trang");
        ps2.setGender("Nữ");
        ps2.setHobby("Xem phim");
        System.out.println(ps2.toString());
    }
}
