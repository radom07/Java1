import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

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
    }

    private static void task1() {
        System.out.println("Zadanie 1:");
        System.out.println("Podaj swój wiek");
        int age = sc.nextInt();
        sc.nextLine();
        if (age <= 0)
            System.out.println("Wiek nieprawidłowy");
        else if (age < 18)
            System.out.println("Nie jesteś pełnoletni");
        else
            System.out.println("Jesteś pełnoletni");
    }

    private static void task2() {
        System.out.println("Zadanie 2:");
        System.out.println("Podaj liczbę całkowitą");
        int integer = sc.nextInt();
        sc.nextLine();
        if (integer % 2 == 0)
            System.out.println("Podana liczba jest parzysta");
        else
            System.out.println("Podana liczba jest nieparzysta");
    }

    private static void task3() {
        System.out.println("Zadanie 3:");
        System.out.println("Podaj swój wiek");
        int age = sc.nextInt();
        sc.nextLine();
        if (age <= 0)
            System.out.println("Wiek nieprawidłowy");
        else if (age < 12)
            System.out.println("Dziecko");
        else if (age < 18)
            System.out.println("Nastolatek");
        else if (age < 65)
            System.out.println("Dorosły");
        else
            System.out.println("Senior");
    }

    private static void task4() {
        System.out.println("Zadanie 4:");
        System.out.println("Podaj temperaturę w stopniach Celsjusza");
        int temp = sc.nextInt();
        sc.nextLine();
        if (temp < 0)
            System.out.println("Mróz");
        if (temp >= 0 && temp <= 15)
            System.out.println("Chłodno");
        if (temp >= 16 && temp <= 25)
            System.out.println("Ciepło");
        if (temp > 25)
            System.out.println("Gorąco");
    }

    // KLASYCZNY SWITCH
    private static void task5() {
        System.out.println("Zadanie 5:");
        System.out.println("Podaj numer dnia tygodnia (1-7)");
        int day = sc.nextInt();
        sc.nextLine();
        switch (day) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieznany dzień");
        }
    }

    // SWITCH EXPRESSIONS
    private static void task6() {
        System.out.println("Zadanie 6:");
        System.out.println("Podaj numer dnia tygodnia (1-7)");
        int day = sc.nextInt();
        sc.nextLine();
        String dayName = switch (day) {
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> "Środa";
            case 4 -> "Czwartek";
            case 5 -> "Piątek";
            case 6 -> "Sobota";
            case 7 -> "Niedziela";
            default -> "Nieznany dzień";
        };
        System.out.println(dayName);
    }

    private static void task7() {
        System.out.println("Zadanie 7:");
        System.out.println("Podaj swój wiek");
        int age = sc.nextInt();
        sc.nextLine();
        String check = (age >= 18) ? "Pełnoletni" : "Niepełnoletni";
        System.out.println(check);
    }

    private static void task8() {
        System.out.println("Zadanie 8:");
        System.out.println("Podaj kategorię produktu:");
        System.out.println("(żywność, książki, usługi, ubrania, elektronika, inne)");
        String productCategory = sc.nextLine();
        int taxRate = switch (productCategory) {
            case "żywność" -> 5;
            case "książki" -> 8;
            case "usługi", "ubrania", "elektronika", "inne" -> 23;
            default -> 0;
        };
        System.out.println("Stawka VAT: " + taxRate + "%");
    }

    private static void task9() {
        System.out.println("Zadanie 9:");
        System.out.println("Podaj a:");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj operator: (+, -, *, /, %");
        String operator = sc.nextLine();
        System.out.println("Podaj b:");
        double b = sc.nextDouble();
        sc.nextLine();
        Double result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Błąd");
                    yield null;
                }
                yield a / b;
            }
            case "%" -> {
                if (b == 0) {
                    System.out.println("Błąd");
                    yield null;
                }
                yield a % b;
            }
            default -> {
                System.out.println("Błąd: nieznany operator");
                yield null;
            }
        };
        if (result != null)
            System.out.println("Wynik: " + result);
    }

    private static void task10() {
        System.out.println("Zadanie 10:");
        System.out.println("Podaj hasło");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Hasło za krótkie");
        }
        else {
            if (Character.isUpperCase(password.charAt(0)))
                System.out.println("OK");
            else
                System.out.println("Hasło musi zaczynać się wielką literą.");
        }
    }

    private static void task11() {
        System.out.println("Zadanie 11:");
        System.out.println("Podaj rok:");
        int year = sc.nextInt();
        sc.nextLine();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        String result = isLeap ? " jest przestępny." : " NIE jest przestępny.";

        System.out.println("Rok " + year + result);
    }

    private static void task12() {
        System.out.println("Zadanie 12:");
        System.out.println("Podaj dzień:");
        int d = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj miesiąc:");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj rok:");
        int y = Integer.parseInt(sc.nextLine());

        try {
            LocalDate date = LocalDate.of(y, m, d);
            System.out.println("Data poprawna: " + date);
        } catch (DateTimeException e) {
            System.out.println("Data niepoprawna");
        }
    }

    private static void task13() {
        System.out.println("Zadanie 13:");
        System.out.println("Kamień (k), Papier (p), Nożyce (n)");
        System.out.print("Twój wybór: ");
        String userChoice = sc.nextLine().toLowerCase();

        Random random = new Random();
        int computerChoice = random.nextInt(3);
        String computerMove = switch (computerChoice) {
            case 0 -> "k";
            case 1 -> "p";
            case 2 -> "n";
            default -> "";
        };

        System.out.println("Komputer wybrał: " + computerMove);

        if (userChoice.equals(computerMove)) {
            System.out.println("Remis");
        } else {
            boolean playerWon = switch (userChoice) {
                case "k" -> computerMove.equals("n");
                case "p" -> computerMove.equals("k");
                case "n" -> computerMove.equals("p");
                default -> {
                    System.out.println("Błędny ruch gracza");
                    yield false;
                }
            };

            if (playerWon)
                System.out.println("Wygrał człowiek");
            else
                System.out.println("Wygrał komputer");
        }
    }
}


