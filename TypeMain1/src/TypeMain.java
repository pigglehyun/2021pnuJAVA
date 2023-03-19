import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        final String str = scanner.nextLine();

        printType(str);

        System.out.println("Type conversion to int...");
        int str2int = Integer.valueOf(str);
        printType(str2int);

        System.out.println("Type conversion int to float...");
        float int2float = (float)str2int;
        printType(int2float);

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
