import java.util.Scanner;

/**
 *Simple program to display someones name, age, and gender. 
 *Calculations for age in minutes, age in centuries and max heart
 *rate are also included.
 *
 * Activity 02
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 01.25.22
 */
public class AgeStatistics {

/**
 * Asks for and/or displays the information listed in the above section.
 *
 * @param args Command line arguments - not used.
 */

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompt user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt user for age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt user for gender:
      System.out.print("Enter your gender (1 for female"
         + " and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
         
      //display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { //calculate male MRH
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
      
   }
   
}