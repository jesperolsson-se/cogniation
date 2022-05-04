/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

import java.util.Iterator;
import org.takes.Request;
import org.takes.Response;
import org.takes.Take;
import org.takes.rs.RsHtml;

/**
 * Exercise for cognitive training or rehabilitation.
 *
 * An exercise is a series of association tasks that can be presented to the user.
 *
 * @since 0.1
 */
public final class Exercise implements Take {

    /**
     * The associations comprising the exercise.
     */
    private final Iterator<Association> associations;

    /**
     * Ctor.
     *
     * @param associations A series of association tasks.
     */
    public Exercise(final Iterator<Association> associations)  {
        this.associations = associations;
    }

    @Override
    public Response act(final Request request) {
        return new RsHtml(
            String.format(
                "<meta charset=\"UTF-8\"><h1>%s</h1>",
                this.associations.next().instructions()
            )
        );
    }
}
