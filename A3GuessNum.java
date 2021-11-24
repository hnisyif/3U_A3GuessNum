/*
*Name: Hussain Nisyif
*Date: November 26th
*Desription: 
*/

import java.util.*;


public class A3GuessNum {

    public static void main(String[] args) {
        // Make a scanner and Random Object.
        Scanner input = new Scanner(System.in);
        Random randomNumGenerator = new Random();

        // Generate a random number from 0 - 20
        int randomNum = randomNumGenerator.nextInt(20) + 1;
        int guess = 0;

        while(guess != randomNum) {
            System.out.println(guess);
            System.out.println("Guess a number");
            guess = input.nextInt();
        } // ENDWHILE
        System.out.println("Correct!");

    } // close main
    
} // close class 