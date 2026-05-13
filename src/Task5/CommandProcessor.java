package Task5;

final class CommandProcessor {
    static void processCommand(String cmd) {
        if (cmd.equalsIgnoreCase("ARG")) {
            throw new IllegalArgumentException("bad arg");
        }
        if (cmd.equalsIgnoreCase("STATE")) {
            throw new IllegalStateException("bad state");
        }
    }

    static void demo() {
        try {
            processCommand("ARG");
            processCommand("STATE");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Bad command");
        }
    }
}
