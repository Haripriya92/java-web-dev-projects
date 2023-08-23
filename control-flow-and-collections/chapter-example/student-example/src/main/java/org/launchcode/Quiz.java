package org.launchcode;

public class Quiz {
    public static void askQuestion(String question){
        System.out.println( question+ "t/f");
    }

    public static boolean checkQuestion( String answerGiven, String correctAnswer){
        return answerGiven.equals(correctAnswer);
    }


}
