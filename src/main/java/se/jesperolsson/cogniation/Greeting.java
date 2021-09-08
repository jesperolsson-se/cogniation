/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rs.RsText;

/**
 * Dummy class. @todo: Should be removed as per #3.
 *
 * @since 0.1
 */
public final class Greeting implements Take {
    @Override
    public Response act(final Request request) {
        return new RsText("Hello, World!");
    }
}
