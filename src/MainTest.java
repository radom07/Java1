import java.util.*;

public class MainTest {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
    }

    private static void task1() {
        System.out.println("Zadanie 1:");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        System.out.println("Zadanie 2:");
        System.out.println("Podaj górny zakres:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    private static void task3() {
        System.out.println("Zadanie 3:");
        System.out.println("Podaj górny zakres:");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("Suma: " + sum);
    }

    private static void task4() {
        System.out.println("Zadanie 4:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void task5() {
        System.out.println("Zadanie 5:");
        System.out.println("Podaj napis:");
        String text = sc.nextLine();
        char[] charArray = text.toCharArray();
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') {
                index = i + 1;
                break;
            }
        }
        if (index != 0)
            System.out.println("Pozycja: " + index);
        else
            System.out.println("Nie ma wystapienia 'a'");
    }

    private static void task6() {
        System.out.println("Zadanie 6:");
        System.out.println("Podaj górny zakres:");
        int n = Integer.parseInt(sc.nextLine());
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    private static void task7() {
        System.out.println("Zadanie 7:");
        String pass = "";
        while (!pass.equals("java123")) {
            System.out.println("Podaj hasło:");
            pass = sc.nextLine();
        }
        System.out.println("Zalogowano!");
    }

    private static void task8() {
        // WTF?
        //Napisz program, który zawsze pyta użytkownika o podanie liczby dodatniej (nawet jeśli podał już poprawną), dopóki ta liczba nie będzie większa od zera.
        System.out.println("Zadanie 8:");
        int x;
        do {
            System.out.println("Podaj liczbę dodatnią:");
            x = Integer.parseInt(sc.nextLine());
        } while (x <= 0);
    }

    private static void task9() {
        System.out.println("Zadanie 9:");
        System.out.println("Podaj liczbę dla tabliczki mnożenia:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    private static void task10() {
        System.out.println("Zadanie 10:");
        System.out.println("Podaj liczbę do znalezienia pierwszej większej podzielnej przez 7:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = n + 1; i < 1000000000; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    private static void task11() {
        System.out.println("Zadanie 11:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }

    private static void task12() {
        System.out.println("Zadanie 12:");
        System.out.println("Ile chcesz wprowadzić liczb?");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int input;
        for (int i = 1; i <= n; i++) {
            System.out.println("Podaj " + i + " liczbę: (0 - koniec)");
            input = Integer.parseInt(sc.nextLine());
            if (input == 0)
                break;
            if (input > 0)
                sum += input;
        }
        System.out.println("Suma: " + sum);
    }

    private static void task13() {
        System.out.println("Zadanie 13:");
        String correctLogin = "admin";
        String correctPass = "123";

        for (int i = 0; i < 3; i++) {
            System.out.println("Próba nr " + (i + 1));
            System.out.print("Podaj login: ");
            String login = sc.nextLine();
            System.out.print("Podaj hasło: ");
            String pass = sc.nextLine();
            if (login.equals(correctLogin) && pass.equals(correctPass)) {
                System.out.println("Zalogowano!");
                break;
            }
            if (i == 2)
                System.out.println("Konto zablokowane!");
        }
    }

    private static void task14() {
        System.out.println("Zadanie 14:");
        System.out.print("Podaj początek przedziału: ");
        int start = Integer.parseInt(sc.nextLine());
        System.out.print("Podaj koniec przedziału: ");
        int end = Integer.parseInt(sc.nextLine());
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }
    }

    private static void task15() {
        System.out.println("Zadanie 15:");
        System.out.print("Podaj liczbę do obliczenia silni: ");
        int n = Integer.parseInt(sc.nextLine());
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Silnia z " + n + " to: " + result);
    }

    private static void task16() {
        System.out.println("Zadanie 16:");
        int input = -1;
        while (input < 0) {
            System.out.print("Podaj dodatnią liczbę całkowitą: ");
            input = sc.nextInt();
        }

        int temp = input;
        int digitsNumber = 0;

        if (temp == 0) {
            digitsNumber = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                digitsNumber++;
            }
        }

        System.out.println("Liczba " + input + " ma " + digitsNumber + " cyfr");
    }

    private static void task17() {
        System.out.println("Zadanie 17:");
        System.out.print("Podaj podstawę potęgi: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Podaj wykładnik potęgi: ");
        int y = Integer.parseInt(sc.nextLine());
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        System.out.println(x + "^" + y + " = " + result);
    }

    private static void task18() {
        System.out.println("Zadanie 18:");
        System.out.println("0 - koniec");
        List<Integer> numbers = new ArrayList<>();
        int i = 1;
        int number;
        do {
            System.out.print("Podaj " + i + " liczbe: ");
            number = Integer.parseInt(sc.nextLine());
            numbers.add(number);
            i++;
        } while (number != 0);
        int max = Collections.max(numbers);
        System.out.println("Największa z podanych liczbt to: " + max);
    }

    private static void task19() {
        System.out.println("Zadanie 19:");
        System.out.print("Podaj liczbę ocen: ");
        int numberOfGrades = Integer.parseInt(sc.nextLine());
        double sum = 0;
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Podaj " + i + " ocene: ");
            sum += Double.parseDouble(sc.nextLine());
        }
        System.out.println("Średnia ocen: " + (sum / numberOfGrades));
    }

    private static void task20() {
        System.out.println("Zadanie 20:");
        System.out.print("Podaj napis: ");
        String text = sc.nextLine();
        char[] charArray = text.toCharArray();
        char[] reverseArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reverseArray[i] = charArray[charArray.length - 1 - i];
        }
        System.out.println("Odwrócony napis: " + new String(reverseArray));
    }
}
