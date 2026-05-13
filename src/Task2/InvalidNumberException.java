package Task2;

class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
