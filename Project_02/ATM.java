import java.util.Scanner;
   /**
 * Program that takes user input of an integer and
 * translates the number into the types of dollar bills
 * that would equate to the input.
 *
 * Project 02
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 01.27.22
 */
public class ATM {

/**
 * Prompts for input and outputs dollar bill equivalents.
 * 
 *
 * @param args Command line arguments - not used.
 */

   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      int total = 0;
      int twenties = 0;
      int totalTwenties = 0;
      int tens = 0;
      int totalTens = 0;
      int fives = 0;
      int totalFives = 0;
      int ones = 0;
                     
      //Prompt for money 'inserted'. 
      System.out.print("Enter the amount: ");
      total = userInput.nextInt(); 
          
      //Compute the expected output.
      if (total > 500) { //input too big.   
         System.out.println("Limit of $500 exceeded!");
      }
      
      if (total < 0) { //false input.
         System.out.println("Invalid Input");
      }
      
      if (0 < total && total < 500) {
         System.out.println("Bills by denomination:");
         //twenties
         twenties = total / 20;
         totalTwenties = twenties * 20;
         System.out.println("\t$20: " + twenties);
         //tens
         tens = (total - totalTwenties) / 10;
         totalTens = tens * 10;
         System.out.println("\t$10: " + tens);
         //fives
         fives = (total - totalTwenties - totalTens) / 5;
         totalFives = fives * 5;
         System.out.println("\t$5: " + fives);
         //ones
         ones = total - totalTwenties - totalTens - totalFives;
         System.out.println("\t$1: " + ones);
         //total summation
         System.out.println("$" + total + " = (" + twenties + " * $20) + ("
            + tens + " * $10) + (" + fives + " * $5) + (" + ones + " * $1)");
      }
   }
   
}
