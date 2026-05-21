import java.util.Optional;

public class Task8 {

    public static void main(String[] args) {
        Task8 t = new Task8();
        User ala = t.new User("Ala", "ala@mail.com");
        User bob = t.new User("Bob", null);

        System.out.println("ala: " + getUserEmail(Optional.of(ala)));
        System.out.println("bob: " + getUserEmail(Optional.of(bob)));
        System.out.println("empty: " + getUserEmail(Optional.empty()));
    }

    static String getUserEmail(Optional<User> user) {
        return user.flatMap(User::getEmail)
                .orElse("No email");
    }

    class User {
        private String name;
        private String email; // może być null

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() { return name; }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
/*
flatMap
public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> mapper) {
        Objects.requireNonNull(mapper);
        if (isEmpty()) {
            return empty();
        } else {
            @SuppressWarnings("unchecked")
            Optional<U> r = (Optional<U>) mapper.apply(value);
            return Objects.requireNonNull(r);
        }
    }

This method is similar to map(Function), but the mapping function is one whose result is already an Optional, and if invoked,
flatMap does not wrap it within an additional Optional.
Jeśli funkcja, którą wkładasz do środka .map(), zwraca zwykły obiekt (np. String), to .map() opakuje go i dostaniesz Optional.
Jeśli jednak funkcja w środku .map() sama z siebie już zwraca Optional, to .map() i tak wykona swoją pracę
– weźmie ten cały Optional i... zapakuje go w kolejny Optional. W efekcie dostajesz "pudełko w pudełku".
Metoda flatMap robi dokładnie to samo, ale na koniec "niszczy" to dodatkowe, zewnętrzne pudełko (spłaszcza strukturę).

map
public <U> Optional<U> map(Function<? super T, ? extends U> mapper) {
        Objects.requireNonNull(mapper);
        if (isEmpty()) {
            return empty();
        } else {
            return Optional.ofNullable(mapper.apply(value));
        }
    }
 */
