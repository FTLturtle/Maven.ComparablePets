package io.zipcoder;

/**
 * @author leon on 03/02/2019.
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args);
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        out.format(val + "\n", args);
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextLine();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) throws InputMismatchException {
        println(prompt, args);
        int result = scanner.nextInt();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) throws InputMismatchException{
        println(prompt, args);
        double result = scanner.nextDouble();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) throws InputMismatchException{
        println(prompt, args);
        float result = scanner.nextFloat();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) throws InputMismatchException{
        println(prompt, args);
        long result = scanner.nextLong();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }
}