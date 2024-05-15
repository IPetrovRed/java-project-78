package hexlet.code.schemas;

import java.util.Map;

public final class MapSchema<T> extends BaseSchema<Map<String, T>> {

    public MapSchema shape(Map<String, BaseSchema<T>> schemas) {
        schemas.forEach((key, schema) ->
                addCheck(key, s -> schema.isValid(s.get(key)))
        );
        return this;
    }

    public MapSchema required() {
        required = true;
        return this;
    }

    public MapSchema sizeof(Integer size) {
        addCheck("mapSize", m -> m.size() == size);
        return this;
    }
}
