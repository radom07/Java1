import java.util.Optional;

public class Task10 {

    static Optional<String> findInCache(String key) {
        // zwraca wartość tylko dla klucza "A"
        System.out.println("I'm looking in the cache");
        if (key.equals("A")) {
            return Optional.of("A");
        }
        return Optional.empty();
    }

    static Optional<String> findInDatabase(String key) {
        // zwraca wartość tylko dla klucza "B"
        System.out.println("I'm looking in the database");
        if (key.equals("B")) {
            return Optional.of("B");
        }
        return Optional.empty();
    }

    static Optional<String> findDefault(String key) {
        // zawsze zwraca wartość domyślną
        System.out.println("I'm looking in the default");
        return Optional.of("DEFAULT");
    }

    static String findValue(String key) {
        Optional<String> value = findInCache(key)
                .or(() -> findInDatabase(key))
                .or(() -> findDefault(key));
        return value.get();
        // świadomie get() bo mamy ustawiony default
    }

    public static void main(String[] args) {
        System.out.println("findValue(\"A\"): " + findValue("A"));
        System.out.println("==== NEXT CALLS ====");
        System.out.println("findValue(\"B\"): " + findValue("B"));
        System.out.println("==== NEXT CALLS ====");
        System.out.println("findValue(\"C\"): " + findValue("C"));
    }
}
/*
Teoria w pigułce
Leniwa ewaluacja oznacza, że kod (w tym przypadku wyrażenie lambda przekazane do .or()) nie jest wykonywany w momencie
jego zdefiniowania, ale dopiero wtedy, gdy jego wynik jest naprawdę potrzebny.
Jeśli pierwszy Optional zawiera wartość, Java całkowicie ignoruje to, co wpisaliśmy wewnątrz .or(), oszczędzając czas procesora i pamięć.

Metafora/Analogia
Wyobraź sobie, że jesteś głodny i masz w lodówce pizzę z wczoraj (to Twój cache).
Masz też w telefonie aplikację do zamawiania jedzenia (to baza danych), ale zamówienie kosztuje i wymaga czasu.
Podejście gorliwe (eager): Otwierasz lodówkę i jednocześnie zamawiasz nową pizzę przez aplikację, zanim sprawdzisz,
czy ta w lodówce nadaje się do zjedzenia. Marnujesz pieniądze i czas.
Podejście leniwe (lazy - mechanizm .or()): Otwierasz lodówkę. Jeśli jest tam zdatna do zjedzenia pizza, jesz ją.
Aplikację w telefonie uruchomisz tylko wtedy, gdy lodówka okaże się pusta. Telefon leży zablokowany, dopóki nie ma wyraźnej potrzeby, by go użyć.

Przykład kodu
W Twoim kodzie leniwość osiągamy dzięki interfejsowi funkcjonalnemu Supplier (dostawca), który przekazujesz jako lambdę:
 () -> findInDatabase(key). Zapis () -> ... to taka "zamknięta instrukcja", która czeka na wywołanie metody .get() przez samą Javę wewnątrz implementacji .or().

Pułapki/Częste błędy
Największą pułapką jest pomylenie metod leniwych z gorliwymi. Przykładowo, starsza metoda .orElse() jest gorliwa –
wykona kod w swoich nawiasach zawsze, niezależnie od tego, czy Optional jest pusty, czy pełny.
Gdybyś zamiast or() użył tam metod, które nie przyjmują lambdy (dostawcy), Twoja baza danych byłaby odpytywana przy każdym wywołaniu!

Analiza Twojego przypadku: Co i dlaczego się wykonało?
Uruchamiając Twój program, na konsoli zobaczymy dokładnie taki podział sił:
1. Przypadek findValue("A")
Wykonały się metody: findInCache("A")
Dlaczego? findInCache("A") zwraca pełny Optional.of("A"). Ponieważ pierwszy element łańcucha ma wartość, Java uznaje,
że cel został osiągnięty. Dzięki leniwości metody .or(), lambdy prowadzące do bazy danych i wartości domyślnej w ogóle nie zostały uruchomione.
2. Przypadek findValue("B")
Wykonały się metody: findInCache("B") oraz findInDatabase("B")
Dlaczego? Cache dla klucza "B" zwraca Optional.empty(). Główny Optional jest pusty, więc Java musi sięgnąć po pierwszą
alternatywę i odpala lambdę () -> findInDatabase("B"). Ta metoda zwraca pełny Optional.of("B"). Ponieważ mamy już wartość, kolejna metoda alternatywna (findDefault) zostaje pominięta.
3. Przypadek findValue("C")
Wykonały się metody: findInCache("C"), findInDatabase("C") oraz findDefault("C")
Dlaczego? Zarówno cache, jak i baza danych zwracają Optional.empty(). Java jest zmuszona sprawdzić cały łańcuch i po
kolei odpalać wszystkie leniwe lambdy, aż w końcu findDefault ratuje sytuację i zwraca "DEFAULT".
 */