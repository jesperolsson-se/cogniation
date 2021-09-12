/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link AcText}.
 *
 * @since 0.1
 */
public class AcTextTest {

    @Test
    public void provideDescription() {
        final String description = "Foo";
        Assertions.assertEquals(
            description,
            new AcText(description).instructions()
        );
    }
}

