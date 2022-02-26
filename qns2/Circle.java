package qns2;

public class Circle extends Shape{

    public Circle(double radius,double radius2){
        super(radius,radius2);
    }

    public double area(){
        return super.dim1 * super.dim2 * super.PI;
    }
}
