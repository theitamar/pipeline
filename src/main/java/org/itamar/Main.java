package org.itamar;

import java.util.Scanner;

/**
 * This is the pipeline main class
 *
 *
 *
 *
 *
 *
 */
public class Main {
    /**

     First assignment:
       - Add new steps to the pipeline that will replace the following characters in the strings:

        b *
        c %
        f &
        d !
        o @
        m ^

        In this assignment you should change replaceAs to ne called replaceAll and get, as well as the input, the char it
        needs to replace and the replacement char to replace with.
     */


    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        String data;
        do {
            data = readContent();

            // Single stage in out pipeline
            data = replaceAs(data);

            System.out.print(data);
            System.out.print("\n");
        } while (!data.isEmpty());
    }

    private static String replaceAs(String input) {
        return input.replace('a', '§');
    }

    public static String readContent() {
        return reader.nextLine();
    }
}
