public class Task12 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = Input.getInt();
        boolean primeCheck = isPrime(number);
        if (primeCheck)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
