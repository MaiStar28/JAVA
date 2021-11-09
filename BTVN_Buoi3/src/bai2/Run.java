package bai2;

public class Run {
    public static void main(String[] args) {
        Array arr1=new Array();
        Array arr2=new Array();
        arr1.inputData();
        arr2.inputData();
        if(arr1.average()>arr2.average()){
            arr1.show();
        }else if(arr1.average()<arr2.average()){
            arr2.show();
        }else{
            System.out.println("Bye");
        }
    }
}
