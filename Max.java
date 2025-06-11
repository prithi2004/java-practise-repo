import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the count of elements greater than all prior elements
        int count = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }

        // Output the result
        System.out.println("Count of elements greater than all prior elements: " + count);

        scanner.close();
    }
}