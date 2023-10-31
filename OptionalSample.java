import java.util.Optional;

public class OptionalSample {

    public void sample1(String bar) {
        Optional<String> foo = Optional.ofNullable(bar);
        foo.ifPresent(s -> {
            System.out.println(s);
        });
    }

    public String sample2(String bar) {
        Optional<String> foo = Optional.ofNullable(bar);
        return foo.map(String::toUpperCase).orElse("null");
    }
}
