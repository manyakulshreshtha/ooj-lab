abstract class Shape{
    int dim1;
    int dim2;

    Shape(int d1,int d2){
        dim1=d1;
        dim2=d2;
    }
    
    abstract void printArea();
}

class Rectangle extends Shape{
        Rectangle(int l,int w) {
        super(l, w);
    }
     @Override
     void printArea(){
        double area=dim1*dim2;
        System.out.println("Rectangle: "+area);
     }
    
}

class Triangle extends Shape {

    Triangle(int b, int h) {
        super(b, h);
    }

     @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {

    Circle(int r) {
        super(r, 0); }
    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}
public class prog4 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape triangle = new Triangle(10, 15);
        Shape circle = new Circle(7);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
