package org.launchcode;

public class ForLoops {
//    for loop public static void main(String [] args) {
//        for (int i = 0; i < 10; i++ ) {
//            System.out.println(i);
//        }
//    }

//   for-each loop  public static void main(String [] args) {
//        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};
//
//        for (int i : nums) {
//            System.out.println(i);
//        }
//    }

//    for-each loop for strings
public static void main(String [] args) {
    String msg = "Hello World";

    for (char c : msg.toCharArray()) {
        System.out.println(c);
    }
}
}
