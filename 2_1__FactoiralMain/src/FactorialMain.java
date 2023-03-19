import java.util.Scanner;
public class FactorialMain {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        while (scanner.hasNextInt()) {
            final int a = scanner.nextInt();
            for (int i = 1; i <= a; i++) {
                getFactorial(i);
            }
        }
        scanner.close();
    }

    private static long getFactorial(final int n){
        int sum =1;
        for(int i = n ; i>0 ;i--){
            sum *= i ;
        }
        System.out.println("Factorial of "+ n + " = " + sum);
        return 1;
    }
}
