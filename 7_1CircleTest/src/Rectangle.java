public class Rectangle implements  MyComparable{
    private int width;
    private int height;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int compareTo(Object other){
        if(!(other instanceof Rectangle)) return -2;
        int result = 0;
        if((this.height * this.width) < (((Rectangle) other).height) * ((Rectangle) other).width) result = -1;
        if((this.height * this.width) == (((Rectangle) other).height) * ((Rectangle) other).width) result = 0;
        if((this.height * this.width) > (((Rectangle) other).height) * ((Rectangle) other).width) result = 1;
        return result;
    }

    public boolean equal(Object other){
        if(!(other instanceof Rectangle)) return false;
        return (this.height == ((Rectangle) other).height && this.width == ((Rectangle) other).width);
    }

    public String toString(){
        return ( "Rectangle{area="+this.width*this.height+"}");
    }

}
