import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMain {
    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();

        int[] original = new int[n];
        int[] original2 = new int[n];

        for (int i = 0; i < n; i++) {
            original[i] = scan.nextInt();
            original2[i] = original[i];
        }

        int[] shallow = original;
        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(shallow));

        int[] deep = new int[original2.length];
        System.arraycopy(original2, 0, deep, 0, original2.length);
        modifyArray(deep, 1);
        System.out.println("Deep Copy: " + Arrays.toString(deep));

        scan.close();

        }

    private static void modifyArray ( int[] array, int index){
        array[index] = 15;
    }

}
