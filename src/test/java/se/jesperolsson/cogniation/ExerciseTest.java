/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import java.io.IOException;
import org.cactoos.iterator.IteratorOf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.takes.rq.RqFake;
import org.takes.rs.RsPrint;

/**
 * Tests for {@link Exercise}.
 *
 * @since 0.1
 */
public class ExerciseTest {

    @Test
    public void completeSeries() throws IOException {
        final String response = "Foo";
        Assertions.assertEquals(
            String.format("<h1>%s</h1>", response),
            new RsPrint(
                new Exercise(
                    new IteratorOf(
                        (Association) () -> response
                    )
                ).act(
                    new RqFake("GET", "/")
                )
            ).printBody()
        );
    }
}
