package org.launchcode.studios;


import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");

        float radius = input.nextFloat();

        input.close();

// double area = Math.PI*radius*radius;

        System.out.println("Area of Circle is "+Circle.getArea(radius)+".");


    }
}

