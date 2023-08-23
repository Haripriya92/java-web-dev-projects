package org.launchcode;

import java.util.Scanner;
public class StringExtension {
    public static void main(String[] args) {
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a term to search for: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        boolean found = aliceSentence.toLowerCase().contains(searchTerm);

        if (found) {
            int index = aliceSentence.toLowerCase().indexOf(searchTerm);
            int length = searchTerm.length();

            System.out.println("Search term found at index: " + index);
            System.out.println("Length of the search term: " + length);

            aliceSentence = aliceSentence.replaceFirst("(?i)" + searchTerm, ""); // Remove the word
            System.out.println("Updated sentence: " + aliceSentence);
        } else {
            System.out.println("Search term not found.");
        }

        scanner.close();
    }
}
