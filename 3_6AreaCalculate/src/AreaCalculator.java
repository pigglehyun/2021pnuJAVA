import jdk.jshell.execution.JdiExecutionControl;
import java.util.Locale;
import java.util.Scanner;


enum Shape {
    TRIANGLE, RECTANGLE, CIRCLE,QUIT, INVALID
}

public class AreaCalculator {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);

        while (true){
            final Shape shape = getShape(scanner);
            if(shape == Shape.QUIT){
                System.out.println("Bye");
                break;
            }
            switch (shape){
                case TRIANGLE:
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    System.out.printf("Area of Triangle: %.2f\n ",(base * height) / 2);
                    break;
                case RECTANGLE:
                    double rw = scanner.nextDouble();
                    double rh = scanner.nextDouble();
                    System.out.printf("Area of Rectangular: %.2f\n ",rw * rh);
                    break;
                case CIRCLE:
                    double cr = scanner.nextDouble();
                    System.out.printf("Area of Triangle: %.2f\n",Math.PI * cr * cr);
                    break;
                case INVALID:
                    System.out.println("Invalid");
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }

    public static Shape getShape(Scanner scanner){
        final String cmd = scanner.next();
        Shape shape;
        try {
            shape = Shape.valueOf(cmd.toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException e){
            shape = Shape.INVALID;
        }
        return shape;

    }
}

