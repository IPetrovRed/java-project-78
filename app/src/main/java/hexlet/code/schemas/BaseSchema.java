package hexlet.code.schemas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public abstract class BaseSchema<T> {
    protected boolean required;
    protected Map<String, Predicate<T>> checks = new LinkedHashMap<>();

    /**
     * Adds a check to the schema.
     *
     * @param checkName The name of the check.
     * @param testCheck The predicate to be used for the check.
     */

    public void addCheck(String checkName, Predicate<T> testCheck) {
        checks.put(checkName, testCheck);
    }

    /**
     * Checks if the given object is valid according to the schema.
     *
     * @param objectForValidation The object to be validated.
     * @return True if the object is valid, false otherwise.
     */

    public boolean isValid(T objectForValidation) {
        if (Objects.equals(objectForValidation, null)) {
            return !required;
        }
        for (String key : checks.keySet()) {
            if (!checks.get(key).test(objectForValidation)) {
                return false;
            }
        }
        return true;
    }
}
