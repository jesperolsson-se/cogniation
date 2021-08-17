/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * System tests.
 *
 * @since 0.1
 */
public class MainTest {

    /**
     * Dummy test. @todo: Should be removed as per #3.
     */
    @Test
    public void greetWithHelloWorld() {
        Assertions.assertEquals("Hello, World!", Main.greeting());
    }
}

