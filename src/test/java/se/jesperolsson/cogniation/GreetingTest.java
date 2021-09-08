/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.takes.rq.RqFake;
import org.takes.rs.RsPrint;

/**
 * Tests for {@link Greeting}.
 *
 * @since 0.1
 */
public class GreetingTest {

    /**
     * Dummy test. @todo: Should be removed as per #3.
     */
    @Test
    public void greetWithHelloWorld() throws IOException {
        Assertions.assertEquals(
            "Hello, World!",
            new RsPrint(
                new Greeting().act(
                    new RqFake("GET", "/")
                )
            ).printBody()
        );
    }
}
