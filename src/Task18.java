public class Task18 {
    public static void main(String[] args) {
        System.out.println("NWD(48, 18) = " + nwdRecursion(48, 18)); // Powinno być 6
        System.out.println("NWD(100, 25) = " + nwdRecursion(100, 25)); // Powinno być 25
        System.out.println("NWD(7, 13) = " + nwdRecursion(7, 13));   // Powinno być 1
    }

    public static int nwdRecursion(int a, int b) {
        return b == 0 ? a : nwdRecursion(b, a % b);
    }
}
