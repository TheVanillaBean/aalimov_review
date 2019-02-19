package main.java;

/**
 * class for matrix positions
 */
import java.lang.*;  // for class Exception

public class InvalidOperationException extends RuntimeException {

        /**
         * Constructs a <code>InvalidOperationException</code>
         * with no detail message.
         */
        public InvalidOperationException() {
                super();
        }

        /**
         * Method: InvalidOperationException(String message)
         * Inputs: String message
         * Returns: InvalidOperationException 
         * Description: This method returns an InvalidOperationException after calling super() with the message parameter passed in.
         */
        public InvalidOperationException(String message) {
                super( message );
        }
}

