import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args){
        System.out.println("Enter two numbers:");

        Scanner scan = new Scanner(System.in);

        final int M = scan.nextInt();
        final int N = scan.nextInt();
        int [][]matrix = new int[M][N];
        matrix[0][0] = 1;

        for (int i = 0 ; i < M; i++){
            for(int k = 0 ; k < N ; k++){
                System.out.print(matrix[i][k]);

                if(k < N-1) {
                    matrix[i][k+1] = matrix[i][k] + 1;
                    System.out.print(", ");
                }
                if((k == N-1) && (i < M-1)){
                    matrix[i+1][0] = matrix[i][k] + 1;
                    System.out.println();
                }
            }

        }
        scan.close();
    }
}
