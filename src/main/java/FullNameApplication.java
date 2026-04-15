import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {

        // Creating scanner object
        Scanner scanner = new Scanner(System.in);
        StringBuilder fullName = new StringBuilder();

        // Prompting user to enter their first name
        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        fullName.append(firstName.strip()).append(" ");


        // Prompting user to enter their middle name (Optional)
        System.out.print("Middle Name (Optional): ");
        String middleName = scanner.nextLine();
        if(!middleName.isEmpty()) {
            fullName.append(middleName.strip()).append(" ");
        }


        // Prompting user to enter their last name
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        fullName.append(lastName.strip());


        // Prompting user to enter suffix (Optional)
        System.out.print("Suffix (Optional): ");
        String suffix = scanner.nextLine();
        if(!suffix.isEmpty()) {
            fullName.append(", ").append(suffix.strip());
        }

        // Printing user's in
        System.out.println("\nFull name: " + fullName);
    }
}
