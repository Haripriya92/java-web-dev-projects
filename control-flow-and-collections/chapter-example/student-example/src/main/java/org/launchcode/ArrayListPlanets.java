package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListPlanets {
    public static void main(String[] args){
        ArrayList<String> planets = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        Collections.sort(planets);

        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);
    }
}
