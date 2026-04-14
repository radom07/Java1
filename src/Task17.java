public class Task17 {
    public static void main(String[] args) {
        System.out.println("NWD(48, 18) = " + nwdIteration(48, 18)); // Powinno być 6
        System.out.println("NWD(100, 25) = " + nwdIteration(100, 25)); // Powinno być 25
        System.out.println("NWD(7, 13) = " + nwdIteration(7, 13));   // Powinno być 1
    }

    public static int nwdIteration(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
