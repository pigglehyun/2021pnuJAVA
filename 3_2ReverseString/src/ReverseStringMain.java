import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final String str = scan.nextLine();
        char[] str2char = str.toCharArray();
       // char[] char2 = new char[str2char.length+1];

        int l = 0;
        for(int i = str2char.length -1 ; i >= 0 ; i-- ) {
            System.out.print(str2char[i]);
        }
        scan.close();
    }
}
