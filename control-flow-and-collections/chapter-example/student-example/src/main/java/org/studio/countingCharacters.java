package org.studio;

import java.util.*;

public class countingCharacters {
    public static void characters_counting(String phrase){
        phrase = phrase.toLowerCase();
       // String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = phrase.toCharArray();


        HashMap<Character,Integer> charactersCount = new HashMap<Character, Integer>();
         for(char character: charactersInString){
             if(Character.isLetter(character)) {
                 if (charactersCount.containsKey(character)) {
                     charactersCount.put(character, charactersCount.get(character) + 1);
                 } else {
                     charactersCount.put(character, 1);
                 }
             }
         }
         for(Map.Entry entry:charactersCount.entrySet()){
             System.out.println(entry.getKey()+": "+entry.getValue());
         }
//System.out.println(charactersCount);

    }

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word or phrase to count characters: ");
    String givenInput = input.next();
    characters_counting(givenInput);

}


}
