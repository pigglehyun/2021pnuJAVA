import shape.Shape;

import java.lang.Math;
public class Triangle extends Shape {
    int a, b ,c ;

    public Triangle(int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
//@overide
    public  double getArea(){
        int s = (this.a + this.b + this.c)/2;
        double area = Math.sqrt((s*(s-this.a)*(s-this.b)*(s-this.c)));
        return (area);
    }
    public  double getLength(){
        return ( a + b + c);
    }
    public void draw(){
        System.out.printf("Triangle,Area: %.2f, Length: %.2f",getArea(),getLength());
    }
}
