package by.epam.javatraining.khadanovich.maintask01.model.exception;

/**
 * My exception, throw when user calls method on an array of zero size
 * @author Tatsiana Khadanovich
 * @version 1.0
 */

public class NullArrayException extends Exception {

    public NullArrayException(String message) {
        super(message);
    }

}