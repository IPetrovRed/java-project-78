package hexlet.code;

import hexlet.code.schemas.StringSchema;
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
        Assertions.assertInstanceOf(StringSchema.class, v.string());
    }

    @Test
    void number() {
        v.number();
        Assertions.assertTrue(true);
    }

    @Test
    void map() {
        v.map();
        Assertions.assertTrue(true);
    }
}
