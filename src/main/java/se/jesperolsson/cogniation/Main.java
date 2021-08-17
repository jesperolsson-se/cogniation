/*
 * Cogniation is licensed under GPL-3.0. More info is found in ${basedir}/LICENSE.
 */
package se.jesperolsson.cogniation;

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
     */
    public static void main(final String... args) {
        System.out.println(greeting());
    }

    /**
     * Dummy method. @todo: Should be removed as per #3.
     * @return A standard greetings message.
     */
    public static String greeting() {
        return "Hello, World!";
    }
}
