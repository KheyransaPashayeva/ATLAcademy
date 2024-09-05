package lesson27;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
        System.out.println("this status borrow");
    }
}
