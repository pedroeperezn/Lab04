/**
 * Exception that handles invalid name substrings for the printNameStartsEndsWith(() method
 * @author Pedro Perez
 * @author Jaskirat Jhatu
 * @version 1.1
 */
class IllegalNameException extends Exception {

    /**
     * Constructor for IllegalNameException.
     */
    IllegalNameException()
    {
        super("bad name");
    }
}