import shape.Shape;

public class Circle extends Shape {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public  double getArea(){
        return radius * radius;
    }
    public  double getLength(){
        return ( radius * 2);
    }
    public void draw(){
        System.out.printf("Circle,Area: %.2f, Length: %.2f",getArea(),getLength());
    }
}
