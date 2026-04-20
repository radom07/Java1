public class Task15 {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("%s Gęstość(kg/m3) = %.2f%n",
                    p.name(),
                    p.getDensity());
        }
    }
}
