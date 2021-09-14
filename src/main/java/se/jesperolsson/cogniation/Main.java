/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import org.cactoos.iterable.IterableOf;
import org.cactoos.iterator.Cycled;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.Exit;
import org.takes.http.FtBasic;

/**
 * Program entry point.
 *
 * @since 0.1
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
                            new IterableOf<>(
                                new AcText("Name three religious festivals."),
                                new AcText("Name three birds."),
                                new AcText("Name three TV shows."),
                                new AcText("Name three car brands."),
                                new AcText("Name three countries."),
                                new AcText("Name three dishes."),
                                new AcText("Name three fruits."),
                                new AcText("Name three toys."),
                                new AcText("Name three pieces of furniture."),
                                new AcText("Name three pieces of clothing."),
                                new AcText("Name three pets."),
                                new AcText("Name three professions."),
                                new AcText("Name three ball games.")
                            )
                        )
                    )
                )
            ), port
        ).start(Exit.NEVER);
    }
}
