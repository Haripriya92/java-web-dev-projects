package org.launchcode;

import java.util.Scanner;

public class SessionPractice {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        System.out.println("This Women+ cohort like summer.");
        String answer = input.nextLine();
        if(Quiz.checkQuestion(answer, "f")){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        Quiz.askQuestion("Today is Friday");
        answer = input.nextLine();
        if(Quiz.checkQuestion(answer, "f")){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }



//        System.out.println("You said: "+ answer);
    }
}
