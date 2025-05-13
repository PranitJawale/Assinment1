import java.util.Scanner;

public class UserIDChecker {
    public static void main(String[] args) {
        // Define Jake's ID, name, and age
        String jakeUserId = "12345";
        String jakeName = "Jake";
        int jakeAge = 30;

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter User ID: ");
        String userInput = scanner.nextLine();

        // Check if ID matches
        if (userInput.equals(jakeUserId)) {
            System.out.println("Name: " + jakeName);
            System.out.println("Age: " + jakeAge);
        } else {
            System.out.println("User ID not found.");
        }

        // Close the scanner
        scanner.close();
    }
}
