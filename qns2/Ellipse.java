package qns2;

public class Ellipse extends Shape{
    public Ellipse(double majLen,double minLen){
        super(majLen,minLen);
    }

    public double area(){
        return super.PI * super.dim1 * super.dim2;
    }
}
