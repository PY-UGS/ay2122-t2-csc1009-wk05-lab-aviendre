package qns2;

public class Triangle extends Shape{
    public Triangle(double base,double height){
        super(base, height);
    }
    
    public double area(){
        return super.dim1 * super.dim2 / 2 ;
    }
}
