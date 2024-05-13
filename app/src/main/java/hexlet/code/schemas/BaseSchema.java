package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BaseSchema<T> {
    private final List<Predicate<T>> tests = new ArrayList<>();

    final void addTest(Predicate<T> test) {
        tests.add(test);
    }

    public final boolean isValid(T value) {
        return tests.stream().allMatch(predicate -> predicate.test(value));
    }
}

