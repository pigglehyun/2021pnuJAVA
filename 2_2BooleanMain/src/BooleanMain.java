import java.util.Scanner;
public class BooleanMain {
    public static void main(String[] args){

        final Scanner scanner = new Scanner(System.in);

        while( scanner.hasNextInt() ) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            System.out.println("Number1 : " + a + ", Number2 : " + b);


            boolean c = ((a - b) > 0);
            boolean d = ((a - b) < 0);
            boolean e = ((a - b) == 0);


            System.out.println("Number1 > Number2 ? " + c);
            System.out.println("Number1 < Number2 ? " + d);
            System.out.println("Number1 == Number2 ? " + e);
        }
        scanner.close();
    }
}
