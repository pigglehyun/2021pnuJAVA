import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args){

        final Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        final int b = scan.nextInt();

        int c = a/b;
        int d = a%b;

        System.out.print(a+" / " +b +" = ");
        System.out.printf("%.3f\n", (double)a/b);

        System.out.print(a + " = " + c+" x "+b+" + " + d);

    }
}
