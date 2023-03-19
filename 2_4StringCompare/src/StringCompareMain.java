import java.util.Locale;
import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args){
        final Scanner scan = new Scanner(System.in);
        final String str1 = scan.nextLine();
        final String str2 = scan.nextLine();

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str2.toLowerCase()));
        System.out.println(str1.replace("easy","fun").equalsIgnoreCase(str2));

        scan.close();
    }
}
