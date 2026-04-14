public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter age: ");
        int age = Input.getInt();
        System.out.println("Category: " + categoryAge(age));
    }

    private static String categoryAge(int age) {
        if (age > 0) {
            if (age >= 65)
                return "Senior";
            else if (age >= 18)
                return "Adult";
            else if (age >= 12)
                return "Teenager";
            else
                return "Child";
        }
        else return "Invalid age";
    }
}
