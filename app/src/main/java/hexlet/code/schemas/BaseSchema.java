package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class BaseSchema {
    private final List<Predicate<Object>> tests = new ArrayList<>();

    final void addTest(Predicate<Object> test) {
        tests.add(test);
    }

    public final boolean isValid(Object value) {
        return tests.stream().allMatch(predicate -> predicate.test(value));
    }
}
