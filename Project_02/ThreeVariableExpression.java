import java.util.Scanner;
   /**
 * Program that takes 3 inputs and uses them in
 * an equation. The result is then printed
 *
 *
 * Project 02
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 01.27.22
 */
public class ThreeVariableExpression {

/**
 * Asks for variables for x,y, and z. Applies them to the equation.
 *
 * @param args Command line arguments - not used.
 */

   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0; 
      double result = 0;
      double partA = 0;
      double partB = 0;
      
      //Print the result equation. 
      System.out.println("result = (3.5x - 7.75) (2.85y + 6.0)"
         + " (1.5z - 3.1) / xyz");
         
      //Ask for variable inputs.
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      
      //Solve for result.
      partA = (3.5 * x - 7.75) * (2.85 * y + 6.0) * (1.5 * z - 3.1);
      partB = (x * y * z);
      result = partA / partB;
      if (result == 0) { //result is 0
         System.out.println("result is \"undefined\"");
      }
      if (x * y * z == 0) { //result divided by 0
         System.out.println("result is \"undefined\"");
      }
      else { //result is valid
         System.out.println("result = " + result);
      }
   }
   
}
