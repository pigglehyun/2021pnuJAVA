import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        final String a = scanner.nextLine();

        printType(a);

        System.out.println("Type conversion to int...");
        int b = Integer.parseInt(a);
        printType(b);

        System.out.println("Type conversion to float...");
        float c = (float)b;
        printType(c);


        scanner.close();

    }

    private static void printType(String x){
        System.out.println(x + " is a string");
    }
    private static void printType(int x){
        System.out.println(x + " is an int");
    }
    private static void printType(float x){
        System.out.println(x + " is a float");
    }
}
