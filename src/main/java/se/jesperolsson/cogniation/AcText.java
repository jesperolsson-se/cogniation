/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

/**
 * Association that can be formulated in text.
 *
 * @since 0.1
 */
public final class AcText implements Association {

    /**
     * The text that describes the association.
     */
    private final String content;

    /**
     * Ctor.
     *
     * @param formulation A description of the association.
     */
    public AcText(final String formulation) {
        this.content = formulation;
    }

    @Override
    public String instructions() {
        return this.content;
    }
}

