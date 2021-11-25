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
        int randomNum = randomNumGenerator.nextInt(100) + 1;
        int guess = 0;
        int attempts = 5; 

        while(attempts == 0 || guess != randomNum) {
            attempts--;
            System.out.println("Guess a number\n");
            guess = input.nextInt();
            System.out.println("Number of Attepmts: " + attempts);

            if (guess > randomNum) {
              System.out.println("Too High!\n");
            } else if (guess < randomNum){
              System.out.println("Too Low!\n");
            }

            if (guess >= randomNum + 50) {
              System.out.println("FREEZIN ICE COOOLD.\n");
            } else if (guess >= randomNum + 25) {
              System.out.println("Cold, you got drip.\n");
            } else if (guess >= randomNum + 10) {
              System.out.println("Gettin' warm, cozy.\n");
            } else if (guess >= randomNum + 5) {
              System.out.println("It's gettin REAL hot in here.\n");
            }
            if (attempts == 0) {
              System.out.println("You ran out, so not sicko mode\n");
            }
            
        } // ENDWHILE
        System.out.println("Correct!\n");

    } // close main
    
} // close class 