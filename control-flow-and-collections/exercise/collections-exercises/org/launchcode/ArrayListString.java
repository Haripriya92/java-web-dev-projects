package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListString {
    public static void fiveLetterWord(ArrayList<String> words){
        for (String word : words){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args){
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("carrot");
        wordList.add("grape");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        ArrayList<String> wordSearched = new ArrayList<>();
        for(String word :wordList){
            if(word.length() == numChars){
                wordSearched.add(word);
            }
        }

        fiveLetterWord(wordSearched);
    }

}
