package qns2;

public abstract class Shape {

    public double dim1,dim2,PI = Math.PI;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract double area();

    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6,6);

        Shape figref;
        figref = r;
        System.out.println("Area of Rectangle is " + figref.area());
        figref = t;
        System.out.println("Area of Triangle is " + figref.area());
        figref = c;
        System.out.println("Area of Circle is " + figref.area());
        figref = e;
        System.out.println("Area of Ellipse is " + figref.area());
        figref = s;
        System.out.println("Area of Square is " + figref.area());
    }  
}

