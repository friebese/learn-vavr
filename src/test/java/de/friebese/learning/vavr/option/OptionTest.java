package de.friebese.learning.vavr.option;

import io.vavr.control.Option;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class OptionTest {

    @Test
    public void givenNullValue_whenOptionCreated_thenIsNoneAndNonDefined() {
        Option<String> none = Option.of(null);
        
        assertTrue(none instanceof Option.None);
        assertFalse(none.isDefined());
    }

    @Test
    public void givenNonNullValue_whenOptionCreated_thenIsSomeAndDefined() {
        String value = RandomStringUtils.randomAlphanumeric(1, 10);
        Option<String> some = Option.of(value);
        
        assertTrue(some instanceof Option.Some);
        assertTrue(some.isDefined());
    }
}
