import java.util.Scanner;

public class Arrange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        String[][] seatingArrangement = new String[rows][columns];

        System.out.println("Enter the student names:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Seat (" + (i + 1) + "," + (j + 1) + "): ");
                seatingArrangement[i][j] = scanner.next();
            }
        }

        System.out.println("\nSeating Arrangement:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seatingArrangement[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}