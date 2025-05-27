import java.util.Scanner;

public class UserIDChecker {
    public static void main(String[] args) {
      
        String jakeUserId = "12345";
        String jakeName = "Jake";
        int jakeAge = 30;

        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter User ID: ");
        String userInput = scanner.nextLine();


        if (userInput.equals(jakeUserId)) {
            System.out.println("Name: " + jakeName);
            System.out.println("Age: " + jakeAge);
        } else {
            System.out.println("User ID not found.");
        }

       
        scanner.close();
    }
}
