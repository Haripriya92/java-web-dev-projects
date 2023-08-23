package org.launchcode;

public class testContinue {
    public static void main(String[] args){
        int[] someInteger = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt: someInteger
        ) {
            if (oneInt == searchTerm){
                System.out.println("Found it!");
                continue;
            }
            System.out.println("Not here");

        }
    }
}
