/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        int numPeeps = Integer.parseInt(input.next());
        System.out.print("How many pizzas do you have? ");
        int numPizza = Integer.parseInt(input.next());
        System.out.print("How many slices per pizza? ");
        int numSlices = Integer.parseInt(input.next());

        int totalSlices = numSlices * numPizza;
        System.out.println(numPeeps + " people with " + numPizza + " pizzas (" + totalSlices + " slices)");
        int slicesPerPeep = totalSlices / numPeeps;
        System.out.printf("Each person gets %d pieces of pizza.\n", slicesPerPeep);
        int leftovers = totalSlices % numPeeps;
        System.out.println("There are " + leftovers + " leftover slices.");
    }
}
