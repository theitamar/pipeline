package org.itamar;

import java.util.LinkedList;
import java.util.List;
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
        List<String> data;
        do {
            data = readContent();

            for (String s : data) {
                s = replaceChar(s, 'b', '*');
                s = replaceChar(s, 'a', '§');
                s = replaceChar(s, 'c', '%');
                s = replaceChar(s, 'd', '!');
                s = replaceChar(s, 'o', '@');
                s = replaceChar(s, 'm', '^');
                System.out.print(s);
                System.out.print("\n");
            }
        } while (!data.isEmpty());
    }

    private static String replaceChar(String replacedValue, char s, char d) {
        return replacedValue.replace(s, d);
    }

    public static List<String> readContent() {
        List<String> arr = new LinkedList<>();

        String next;
        do {
            next = reader.nextLine();
            if (!next.equals("end") && !next.trim().equals("")) {
                arr.add(next);
            }
        } while (!next.equals("end") && !next.trim().equals(""));

        return arr;
    }
}
