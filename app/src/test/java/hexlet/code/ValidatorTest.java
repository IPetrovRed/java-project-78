package hexlet.code;

import hexlet.code.schemas.MapSchema;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidatorTest {
    private Validator v;

    @BeforeEach
    void setup() {
        v = new Validator();
    }

    @Test
    void string() {
        Assertions.assertNotNull(v.string());
    }

    @Test
    void number() {
        Assertions.assertNotNull(v.number());
    }

    @Test
    void map() {
        Assertions.assertNotNull(v.map());
    }

    @Test
    void validateMapSchemaMethod() {
        MapSchema mapSchema = new MapSchema();
    }
}
