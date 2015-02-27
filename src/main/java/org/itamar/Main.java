package org.itamar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This is the pipeline main class
 */
public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data;
        do {
            data = readContent();

            // Single stage in out pipeline
            data = replaceAs(data);

            for (String s : data) {
                System.out.print(s);
                System.out.print("\n");
            }
        } while (!data.isEmpty());
    }

    private static List<String> replaceAs(List<String> input) {
        List<String> output = new LinkedList<>();

        for (int i = 0; i < input.size(); i++) {
            String inputString = input.get(i);
            String replacedValue = inputString.replace('a', '§');
            replacedValue = replacedValue.replace('a', '§');
            output.add(i, replacedValue);
        }

        return output;
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
