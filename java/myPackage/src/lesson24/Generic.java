package lesson24;

import java.util.Optional;

public class Generic {
    public static void main(String[] args) {
        requiredNonNull(null);
    }

    public static <T> Optional<T> requiredNonNull(T data) {
        if (data == null) {
            return Optional.empty();
        }
        return Optional.of(data);
    }

}
