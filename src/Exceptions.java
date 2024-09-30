import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        /**
         * Checked Exceptions: These are checked at compile-time.
         * Examples : IOException, SQLException.
         * Unchecked Exceptions: These occur at runtime and are not checked at compile-time.
         * Examples : NullPointerException, ArrayIndexOutOfBoundsException.
         * Errors: These are serious issues
         * Examples : OutOfMemoryError, StackOverflowError.
         * All exception and error types are subclasses of the class Throwable. The hierarchy is as follows:
         *
         * Throwable
         * Exception
         * IOException
         * SQLException
         * …
         * Error
         * OutOfMemoryError
         * StackOverflowError
         * …
         */
        try {
            // Code that may throw an exception
        } catch (NullPointerException e) {
            // Code to handle the exception
        }

        try {
            int[] anArray = {1, 2, 3};
            System.out.println(anArray[10]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            int[] anArray = {1, 2, 3};
            System.out.println(anArray[2]);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        System.out.println("Program still running");
    }


    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public void myMethod() throws IOException {
        // Code that may throw an IOException
    }
}
