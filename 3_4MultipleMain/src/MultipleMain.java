import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int num = scan.nextInt();

        if((num % 2 == 0) && (num % 3 == 0)){
            System.out.println(num+" is a multiple of 2 and 3");
        }
        else if(num % 2 == 0){
            System.out.println(num+" is a multiple of 2");
        }
        else if(num % 3 == 0){
            System.out.println(num+" is a multiple of 3");
        }
        else {
            System.out.println(num+" is not a multiple of 2 and 3");
        }
        scan.close();
    }
}
