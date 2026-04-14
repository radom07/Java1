import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public static double getDouble() {
        double number = sc.nextDouble();
        sc.nextLine();
        return number;
    }
}
