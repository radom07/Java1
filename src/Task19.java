public class Task19 {
    public static void main(String[] args) {
        menu();
        int choice = 0;
        do {
            System.out.print("Enter your choice: ");
            choice = Input.getInt();
            int[] numbers;
            switch (choice) {
                case 1:
                    numbers = getNumbers();
                    System.out.println("Result: " + addition(numbers));
                    break;
                case 2:
                    numbers = getNumbers();
                    System.out.println("Result: " + substraction(numbers));
                    break;
                case 3:
                    numbers = getNumbers();
                    System.out.println("Result: " + multiplication(numbers));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    private static int multiplication(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    private static int substraction(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    private static int addition(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    private static void menu() {
        System.out.println("Menu:");
        System.out.println("    > 1 - addition");
        System.out.println("    > 2 - subtraction");
        System.out.println("    > 3 - multiplication");
        System.out.println("    > 4 - exit");
    }

    private static int[] getNumbers() {
        int[] numbers = new int[2];
        System.out.print("Enter 'a': ");
        numbers[0] = Input.getInt();
        System.out.print("Enter 'b': ");
        numbers[1] = Input.getInt();
        return numbers;
    }
}