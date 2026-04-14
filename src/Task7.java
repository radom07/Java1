public class Task7 {
    public static void main(String[] args) {
        int x = 5;
        changeX(x);
        System.out.println("X from main: " + x);
    }

    private static void changeX(int x) {
        x = 10;
        System.out.println("X from method: " + x);
    }
}
