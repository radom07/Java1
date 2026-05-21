import java.util.List;
import java.util.Optional;

public class Task9 {

    static String describeGrade(Optional<Integer> grade) {
        return grade.filter(g -> g >= 4)
                .map(g -> "Good grade: " + g)
                .orElse("Skipped");
    }

    public static void main(String[] args) {
        List<Optional<Integer>> grades = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5)
        );

        System.out.println("Grades: " + grades);
        System.out.println("==== After filtering ====");
        grades.forEach(g -> System.out.println(describeGrade(g)));
    }
}
