/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

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
    private Main() { }

    /**
     * Main method.
     * @param args Program arguments.
     * @throws Exception If request cannot be processed.
     */
    public static void main(final String... args) throws Exception {
        final int port = 8080;
        new FtBasic(
            new TkFork(
                new FkRegex(
                    "/", new Greeting()
                )
            ), port
        ).start(Exit.NEVER);
    }
}
