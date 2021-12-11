package cau2;

public class Rectangle implements IShape{
    private double width,length;
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
}
