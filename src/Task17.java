import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("Avaliable options:");
            for (MenuOption option : MenuOption.values()) {
                System.out.println(option);
            }
            System.out.println("Enter your choice: ");
            String input = sc.nextLine().toUpperCase();
            MenuOption choice = MenuOption.valueOf(input);

            switch (choice) {
                case START -> System.out.println("Starting the program.");
                case STOP -> System.out.println("Stopping the program.");
                case EXIT -> System.out.println("Exiting the program.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid option.");
        }
    }
}
