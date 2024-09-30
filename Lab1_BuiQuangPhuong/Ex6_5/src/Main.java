import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bui Quang Phuong - 20235809");
        System.out.print("Please enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Please enter element of array: ");
        for(int i = 0; i <= n-1; ++i) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum value: "+sum);
        System.out.println("Average value: " + (double)sum/n);
    }
}