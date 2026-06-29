package LombokDemo.Aggregation;

import lombok.Data;

@Data // Daje nam: gettery, settery, toString, equals, hashCode i konstruktor dla pól final/@NonNull
public class UserProfile {
    private final Long id; // Tego pola nie zmienimy (brak settera, bo jest final)
    private String username;
    private String email;
}
