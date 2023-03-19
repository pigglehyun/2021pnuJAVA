import java.util.Scanner;

class Triangle{
    private final int base;
    private final int height;

    public Triangle(int base, int height){
        this.base = base ;
        this.height = height;
    }
    public Double getArea(){

        return   (this.base * this.height * (0.500));
    }
    public String toString(){
        System.out.printf("Triangle [base=%d, height=%d, area= %.2f]",this.base,this.height,getArea());
        return "";
    }

}

public class TriangleTest {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();
        Triangle[] triangles = new Triangle[N];


        for(int i = 0 ; i < N ; i++){
            int b = scanner.nextInt();
            int h = scanner.nextInt();
            triangles[i] = new Triangle(b,h);
        }
        for(int k = 0 ; k < N ; k++){
            System.out.println(triangles[k].toString());
        }

    }
}
