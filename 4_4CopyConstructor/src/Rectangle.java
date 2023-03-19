import java.util.Objects;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;


    public Rectangle(Point p1, Point p2){
        leftTop = new Point(p1.getX(),p1.getY());
        rightBottom = new Point(p2.getX(),p2.getY());
    }

    public Rectangle(Rectangle rectangle){
        Rectangle rect = new Rectangle(rectangle.leftTop, rectangle.rightBottom);
        leftTop = rect.leftTop;
        rightBottom = rect.rightBottom;
    }

    public void moveBy(int x , int y ){
        this.leftTop.setX(this.leftTop.getX() + x);
        this.leftTop.setY(this.leftTop.getY() + y);
        this.rightBottom.setX(this.rightBottom.getX() + x);
        this.rightBottom.setY(this.rightBottom.getY() + y);
    }

    public String toString(){
        System.out.printf("Rectangle[(%d,%d), (%d,%d)]",leftTop.getX(),leftTop.getY(),rightBottom.getX(),rightBottom.getY());
        return "";
    }
    public boolean equals(Object o){
        Rectangle r = (Rectangle) o;
        return leftTop.equals(r.leftTop) && rightBottom.equals(r.rightBottom);
    }

}
