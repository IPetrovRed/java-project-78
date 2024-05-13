package hexlet.code.schemas;

import java.util.Map;

public final class MapSchema extends BaseSchema<Map> {
    public void required() {
        addTest(value -> value instanceof Map);
    }

    public void sizeof(Integer sizeof) {
        addTest(value -> value.size() == sizeof);
    }

    public void shape(Map<String, BaseSchema> shape) {
        addTest(value -> {
            return shape.keySet().stream()
                    .map((key) -> {
                        return shape.get(key).isValid(value.get(key));
                    })
                    .allMatch((isValid) -> isValid);
        });
    }
}

