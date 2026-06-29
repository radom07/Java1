package LombokDemo.Constructors;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor(force = true)       // 1. Konstruktor bezargumentowy 'force = true' ucisza błąd kompilacji dla pól final
@AllArgsConstructor                    // 2. Konstruktor ze wszystkimi 4 polami
@RequiredArgsConstructor               // 3. Konstruktor TYLKO dla pól: id (final) oraz email (@NonNull)
public class Customer {
    private final Long id;          // Pole final -> WYMAGANE przez @RequiredArgsConstructor

    @NonNull
    private String email;           // Pole @NonNull -> WYMAGANE przez @RequiredArgsConstructor

    private String fullName;
    private boolean active = true;
}
