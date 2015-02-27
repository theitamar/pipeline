package org.itamar;

import java.util.Scanner;

/**
 * This is the pipeline main class
 * b *
 * c %
 * f &
 * d !
 * o @
 * m ^
 */
public class Main {
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
