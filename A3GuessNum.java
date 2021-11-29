/*
*Name: Hussain Nisyif
*Date: November 28th
*Desription: 
*/

import java.util.*;
import java.util.Scanner;

public class A3GuessNum {

    public static void main(String[] args) {

        // Make a scanner and Random Object.
        Scanner input = new Scanner(System.in);
        Scanner yesOrNo = new Scanner(System.in);
        Random randomNumGenerator = new Random();

        // Random Number Generator and needed variables.
        int randomNum = randomNumGenerator.nextInt(100) + 1;
        String cond ="";
        int guess = 0;
        int attempts = 5; 
        boolean isNum;

        // For testing
        //System.out.println(randomNum); 

        while(guess != randomNum) {

            System.out.println("Number of Attepmts: " + attempts + "\n");
            System.out.println("Guess a number between 1 and 100.\n");

            if (input.hasNextInt()) {
              guess = input.nextInt();
              isNum = true;
              attempts--;
              
            } else {
              System.out.println("Please enter a number only! \n");
              isNum = false;
              input.next();
            }
               
            

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
              System.out.println("You lose, loser. \n");
              System.out.println("Do you wish to play again? yes or no?\n");
              cond = yesOrNo.nextLine();

              if (!cond.equals("yes")) {
                break;

              } else if (cond.equals("yes"))
                randomNum = randomNumGenerator.nextInt(100) + 1;
                attempts += 5;
              } 

        } // ENDWHILE
        
        if (guess == randomNum) {
          System.out.println("Correct!\n");

        } else {
          System.out.println("Biggest L you've taken, G. \n");
          System.out.println("The number you couldn't guess was " + randomNum + ".\n"); 
        }
    
    } // close main
    
} // close class 