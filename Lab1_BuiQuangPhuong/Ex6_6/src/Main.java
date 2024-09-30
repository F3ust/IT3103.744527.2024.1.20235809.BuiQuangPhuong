import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        System.out.print("Please enter the size of matrices (n x m): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix_1 =  new int[n][m];
        int[][] matrix_2 =  new int[n][m];
        int[][] matrix_sum =  new int[n][m];
        int sum = 0;

        System.out.println("Please enter element of matrix 1: ");
        for(int i = 0; i <= n-1; ++i) {
            for (int j = 0; j <= m-1; ++j) {
                matrix_1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Please enter element of matrix 2: ");
        for(int i = 0; i <= n-1; ++i) {
            for (int j = 0; j <= m-1; ++j) {
                matrix_2[i][j] = sc.nextInt();
                matrix_sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        System.out.println("The sum of two matrices is: ");
        for(int i = 0; i <= n-1; ++i) {
            for (int j = 0; j <= m-1; ++j) {
                System.out.print(matrix_sum[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}