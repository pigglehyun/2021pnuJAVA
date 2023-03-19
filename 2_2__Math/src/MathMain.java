import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){

        final Scanner scan = new Scanner(System.in);


        System.out.print("Enter a begin number: ");
        final int begin = scan.nextInt();

        System.out.print("Enter an end number: ");
        final int end = scan.nextInt();

        long sum = getSumBetween(begin,end);
        System.out.printf("Sum between %d and %d : %,d%n",begin,end,sum);

        long product = getProductBetween(begin,end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end , product);
    }
    private static long getProductBetween(int a , int b){
        int sum = 1;
        for (int i = a ; i < b+1 ; i++){
            sum *= i;
        }
        return sum;
    }
    private static long getSumBetween(int a , int b){
        int sum = 0;
        for (int i = a ; i < b+1 ; i++){
            sum += i;
        }
        return sum;
    }
}
