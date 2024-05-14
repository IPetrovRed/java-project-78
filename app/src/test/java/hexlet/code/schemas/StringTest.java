package hexlet.code.schemas;

import hexlet.code.Validator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    public void testString() {
        Validator v = new Validator();
        StringSchema schema = v.string();
        assertThat(schema.isValid("")).isTrue();
        assertThat(schema.isValid(null)).isTrue();
        schema.required();
        assertThat(schema.isValid("")).isFalse();
        assertThat(schema.isValid(null)).isFalse();
//        assertThat(schema.isValid(5)).isFalse();
        assertThat(schema.isValid("what does the fox say")).isTrue();
        assertThat(schema.contains("wh").isValid("what does the fox say")).isTrue();
        assertThat(schema.contains("whattle").isValid("what does the fox say")).isFalse();
        assertThat(schema.isValid("what does the fox say")).isFalse();
    }
}
