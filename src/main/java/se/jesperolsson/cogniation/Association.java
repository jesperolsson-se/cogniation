/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

/**
 * An association is a set of related concepts. In our product, associations
 * always exist in the context of a patient who is trying to demonstrate
 * this relatedness.
 *
 * @since 0.1
 */
public interface Association {

    /**
     * A description of a task that would allow the patient to demonstrate
     * that they can make the connection between the concepts.
     * @return Instructions for an association task.
     */
    String instructions();
}
