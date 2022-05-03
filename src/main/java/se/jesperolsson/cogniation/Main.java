/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import java.io.File;
import org.cactoos.iterable.Mapped;
import org.cactoos.iterator.Cycled;
import org.cactoos.text.Split;
import org.cactoos.text.TextOf;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.Exit;
import org.takes.http.FtBasic;

/**
 * Program entry point.
 *
 * @since 0.1
 * @checkstyle ClassDataAbstractionCouplingCheck (50 lines). Object graph construction.
 */
public final class Main {

    /**
     * Ctor.
     */
    private Main() {
    }

    /**
     * Main method.
     *
     * @param args Program arguments.
     * @throws Exception If request cannot be processed.
     */
    public static void main(final String... args) throws Exception {
        final int port = 8080;
        new FtBasic(
            new TkFork(
                new FkRegex(
                    "/",
                    new Exercise(
                        new Cycled<>(
                            new Mapped<>(
                                text -> new AcText(text.asString()),
                                new Split(
                                    new TextOf(new File("Exercises", "en_us")),
                                    new TextOf("[\r\n]+")
                                )
                            )
                        )
                    )
                )
            ), port
        ).start(Exit.NEVER);
    }
}
