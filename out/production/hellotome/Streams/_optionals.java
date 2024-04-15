package Streams;

import java.util.Optional;
import java.util.function.Supplier;

public class _optionals {
    public static void main(String[] args) {
//        here if the value is null it will give the elseget output else it will print the value itself
//        Object value = Optional.ofNullable("hello").orElseGet(() -> "something different");
//        Object value = Optional.ofNullable(null).orElseGet(() -> "something different");
        Supplier<IllegalStateException> exception = () -> new IllegalStateException("Exception");
        Object value = Optional.ofNullable(null).orElseThrow(exception);
//        there are also useful methods like ifPresent or ifPresentOrElse
    }
}
