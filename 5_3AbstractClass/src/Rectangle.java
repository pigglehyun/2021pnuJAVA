import shape.Shape;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }
    public  double getArea(){
        return width * height;
    }
    public  double getLength(){
        return 2*(width + height);
    }
    public void draw(){
        System.out.printf("Rectangle,Area: %.2f, Length: %.2f",getArea(),getLength());
    }
}
