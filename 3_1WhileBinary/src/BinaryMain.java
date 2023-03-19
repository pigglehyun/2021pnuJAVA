import java.util.ArrayList;
import java.util.Scanner;

public class BinaryMain {
    public static void main(String[] args){

        final Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a;
        ArrayList <Integer> digits = new ArrayList<>();
        while( a >0 ){
            if(a%2 == 0){
                digits.add(0);
            }
            if(a%2 != 0){
                digits.add(1);
            }
            a = a/2;
        }

        System.out.print("Number "+b+" in Binary Number: ");
        for(int i = digits.size()-1 ; 0<= i ; i--){
            System.out.print(digits.get(i));
        }
        scan.close();
    }
}
