package Task4;

import java.util.Arrays;

final class SuppressedShowcase {
    static void run() {
        try (DummyResource r = new DummyResource()) {
            r.work();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + " suppressed: " + Arrays.toString(e.getSuppressed()));
        }
    }
}
