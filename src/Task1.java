public class Task1 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Starting program...");
        Runnable runnable2 = () -> System.out.println("Ending program.");

        runnable1.run();
        new Thread(runnable2).start();
    }
}
