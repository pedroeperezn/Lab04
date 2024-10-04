/**
 * Exception that handles an illegal property for the getLongest() method
 * @author Pedro Perez
 * @version 1.0
 */
class IllegalNovelPropertyException extends RuntimeException {

    IllegalNovelPropertyException()
    {
        super("Bad Property");
    }
}
