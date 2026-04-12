import java.util.Arrays;
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
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
    }

    private static void task1() {
        System.out.println("Zadanie 1:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void task2() {
        System.out.println("Zadanie 2:");
        String[] names = {"Jan", "Krzysztof", "Anna"};
        for (String name : names) {
            System.out.println("Cześć, " + name + "!");
        }

    }
    // Dla tych prostych ćwiczeń pomijam w zadaniach sprawdzanie, czy użytkownik wprowadzi 0
    // Zakładam, że użytkownik wprowadzi przynajmniej 1 i nie rzuci wyjątkiem ArrayIndexOutOfBoundsException

    public static void task3() {
        System.out.println("Zadanie 3:");
        System.out.print("Podaj liczbę: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void task4() {
        System.out.println("Zadanie 4:");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Suma liczb to: " + sum);
    }

    public static void task5() {
        System.out.println("Zadanie 5:");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Średnia liczb to: " + sum/numbers.length);
    }

    private static void task6() {
        System.out.println("Zadanie 6:");
        int[] numbers = readArrayElements();
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Największy element to: " + max);
    }



    private static void task7() {
        System.out.println("Zadanie 7:");
        int[] numbers = readArrayElements();
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < max) {
                max = numbers[i];
            }
        }
        System.out.println("Najmniejszy element to: " + max);
    }

    private static void task8() {
        System.out.println("Zadanie 8:");
        int[] numbers = readArrayElements();
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));
        System.out.print("Podaj liczbę do policzenia wystąpień: ");
        int x = sc.nextInt();
        int count = 0;
        for (int number : numbers) {
            if (number == x)
                count++;
        }
        System.out.println("Liczba wystąpień: " + count);
    }

    private static void task9() {
        System.out.println("Zadanie 9:");
        int[] numbers = readArrayElements();
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));
        System.out.print("Podaj liczbę do znalezienia: ");
        int x = sc.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (number == x) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Znaleziono");
        else
            System.out.println("Nie znaleziono");
    }
    // Pomijam dla ćwiczeń sprawdzenie czy są przynajmniej 2 elementy itd
    private static void task10() {
        System.out.println("Zadanie 10:");
        int[] numbers = readArrayElements();
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));

        int[] reverseNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[numbers.length - i - 1];
        }
        System.out.println("Tablica odwrotna: " + Arrays.toString(reverseNumbers));
    }

    private static void task11() {
        System.out.println("Zadanie 11:");
        int[] numbers = readArrayElements();
        System.out.println("Utworzona tablica " + Arrays.toString(numbers));

        int tmp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = tmp;
        System.out.println("Po zmianie pierwszy/ostatni: " + Arrays.toString(numbers));
    }

    private static void task12() {
        System.out.println("Zadanie 12:");
        int[] numbers1 = readArrayElements();
        int[] numbers2 = readArrayElements();
        System.out.println("Utworzona pierwsza tablica " + Arrays.toString(numbers1));
        System.out.println("Utworzona druga tablica " + Arrays.toString(numbers2));
        int[] summedArrays = new int[numbers1.length];
        for (int i = 0; i < summedArrays.length; i++) {
            summedArrays[i] = numbers1[i] + numbers2[i];
        }
        System.out.println("Tablica zsumowana " + Arrays.toString(summedArrays));
    }

    private static void task13() {
        System.out.println("Zadanie 13:");
        System.out.print("Podaj napis: ");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }

    private static void task14() {
        System.out.println("Zadanie 14:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void task15() {
        System.out.println("Zadanie 15:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("Suma wszystkich elementów to: " + sum);
    }

    private static void task16() {
        System.out.println("Zadanie 16:");
        int[][] matrix = new int[2][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Podaj " + (j + 1) + " element " + (i + 1) + " wiersza: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Suma wiersza " + (i + 1) + " wynosi: " + rowSum);
        }
    }

    private static void task17() {
        System.out.println("Zadanie 17:");
        int[][] matrix = new int[2][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Podaj " + (j + 1) + " element " + (i + 1) + " wiersza: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                columnSum += matrix[j][i];
            }
            System.out.println("Suma kolumny " + (i + 1) + " wynosi: " + columnSum);
        }
    }

    private static void task18() {
        System.out.println("Zadanie 18:");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Podaj " + (j + 1) + " element " + (i + 1) + " wiersza: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        int secondMax = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > secondMax && matrix[i][j] < max) {
                    secondMax = matrix[i][j];
                }
            }
        }
        int thirdMax = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > thirdMax && matrix[i][j] < secondMax) {
                    thirdMax = matrix[i][j];
                }
            }
        }
        System.out.println("Największy element to: " + max);
        System.out.println("Jest w wierszu " + (maxRow + 1) + " i kolumnie " + (maxCol + 1));
        System.out.println("Trzeci największy element to: " + thirdMax);
    }

    private static void task19() {
        System.out.println("Zadanie 19:");
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Elementy przekątnej:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + ", ");
        }
    }

    private static void task20() {
        System.out.println("Zadanie 20:");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Podaj " + (j + 1) + " element " + (i + 1) + " wiersza: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[] tempRow = matrix[0];
        matrix[0] = matrix[matrix.length - 1];
        matrix[matrix.length - 1] = tempRow;

        System.out.println("Macierz po zamianie wierszy:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            int tempDiag = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length - 1 - i];
            matrix[i][matrix.length - 1 - i] = tempDiag;
        }

        System.out.println("Macierz po zamianie przekątnych:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void task21() {
        System.out.println("Zadanie 20:");
        System.out.println("Wpisz zdanie do sprawdzenia:");
        String input = sc.nextLine();

        String clean = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrom = true;
        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                isPalindrom = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrom) {
            System.out.println("Zdanie jest palindromem");
        } else {
            System.out.println("Zdanie nie jest palindromem");
        }
    }

    private static int[] readArrayElements() {
        System.out.print("Podaj długość tablicy: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Wprowadź " + (i + 1) + " element tablicy:");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
}
