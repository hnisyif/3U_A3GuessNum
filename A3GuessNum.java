/*
*Name: Hussain Nisyif
*Date: November 28th
*Desription: 
*/

import java.util.*;

public class A3GuessNum {

    public static void main(String[] args) {

        // Make a scanner and Random Object.
        Scanner input = new Scanner(System.in);
        Random randomNumGenerator = new Random();

        // Random Number Generator and needed variables.
        int randomNum = randomNumGenerator.nextInt(100) + 1;
        int guess = 0;
        int attempts = 5; 
        // For testing
        //System.out.println(randomNum); 

        while(guess != randomNum) {

            System.out.println("Number of Attepmts: " + attempts + "\n");
            System.out.println("Guess a number between 1 and 100.\n");
            guess = input.nextInt();
            attempts--;
          
            if (guess > randomNum) {
              System.out.println("Too High!\n");
            } else if (guess < randomNum){
              System.out.println("Too Low!\n");
            }

            if (guess >= randomNum + 50) {
              System.out.println("FREEZING, WHERE IS THE AC?!\n");

            } else if (guess >= randomNum + 25) {
              System.out.println("Cold, you got drip. \n");

            } else if (guess >= randomNum + 10) {
              System.out.println("It's warm, getting cozy. \n");

            } else if (guess >= randomNum + 5) {
              System.out.println("It's getting REALLY hot in here. \n");

            } else if (guess >= randomNum + 1) {
              System.out.println("BOILING HOT");

            } else if (guess <= randomNum - 50) {
              System.out.println("FREEZING, WHERE IS THE AC?! \n");

            } else if (guess <= randomNum - 25) {
              System.out.println("Cold, you got drip. \n");

            } else if (guess <= randomNum - 10) {
              System.out.println("It's warm, getting cozy. \n");

            } else if (guess <= randomNum - 5) {
              System.out.println("It's getting REALLY hot in here. \n");

            } else if (guess <= randomNum - 1) {
              System.out.println("BOILING HOT");
            }

            if (attempts == 0) {
            break;
            }    

        } // ENDWHILE

      if (guess == randomNum) {
        System.out.println("Correct!\n");
      } else {
        System.out.println("You lose, loser. \n");
        System.out.println("The number you couldn't guess was " + randomNum); 
      }
    
    } // close main
    
} // close class 