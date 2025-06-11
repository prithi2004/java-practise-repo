import java.util.*;

public class Seat {
    private static String[][] seatingChart; // 2D array for seating arrangement
    private static int rows, cols; // Number of rows and columns in the exam hall

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns for the seating arrangement
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();

        // Create a seating chart based on user input
        seatingChart = new String[rows][cols];

        // Initialize the seating chart to "Empty"
        initializeSeatingChart();

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        // Ensure there are enough seats
        if (studentCount > rows * cols) {
            System.out.println("Error: Not enough seats for all students!");
            return;
        }

        // Create a list of students
        List<String> students = new ArrayList<>();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students.add(scanner.nextLine());
        }

        // Randomly assign seats to students
        assignSeats(students);

        // Display the seating arrangement
        displaySeatingChart();

        scanner.close();
    }

    // Method to initialize the seating chart with "Empty" values
    public static void initializeSeatingChart() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seatingChart[i][j] = "Empty"; // Initialize all seats as empty
            }
        }
    }

    // Method to randomly assign students to seats in the chart
    public static void assignSeats(List<String> students) {
        Collections.shuffle(students); // Shuffle the student list randomly

        int studentIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (studentIndex < students.size()) {
                    seatingChart[i][j] = students.get(studentIndex);
                    studentIndex++;
                }
            }
        }
    }

    // Method to display the seating arrangement in a readable format
    public static void displaySeatingChart() {
        System.out.println("\nExam Seating Arrangement:");
        System.out.println("--------------------------");

        // Print column headers
        System.out.print("\t");
        for (int col = 1; col <= cols; col++) {
            System.out.print("Col" + col + "\t");
        }
        System.out.println();

        // Print seating chart row by row
        for (int i = 0; i < rows; i++) {
            System.out.print("Row" + (i + 1) + "\t"); // Row header
            for (int j = 0; j < cols; j++) {
                System.out.print(seatingChart[i][j] + "\t"); // Seat value
            }
            System.out.println();
        }
    }
}
