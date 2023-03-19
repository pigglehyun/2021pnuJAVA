package shape;
import com.bdobe.*;

public abstract class Shape {
    private int lineColor;

    public Shape(){
        this.lineColor = 1;
    }
    public int getLineColor(){
        return lineColor;
    }
    public void add(Object o){

    }

    public abstract double getArea();
    public abstract double getLength();
    public abstract void draw();
}
