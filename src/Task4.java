public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter number to check is even or not: ");
        int number = Input.getInt();
        if (orEven(number)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    private static boolean orEven(int number) {
        return number % 2 == 0;
    }
}