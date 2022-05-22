import java.util.Scanner;
import java.text.DecimalFormat;
 /**
  * Program that takes user input and solves an equation.
  * 
  *
  * Project 03
  * @author Emily Hollingshead - Comp 1210 - 005
  * @version 02.04.22
  */
public class MathExpression {

/**
 * Prompts for input and outputs appropiate result.
 * 
 *
 * @param args Command line arguments - not used.
 */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double result = 0;
      
      //request user input
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //solve for result
      double x2 = 0; //x^2
      double x3 = 0; //x^3
      double x4 = 0; //x^4
      double x5 = 0; //x^5
      double absTop = 0; //abs value in dividend
      double dividend = 0;
      double divisor = 0;
      
      x2 = Math.pow(x, 2); 
      x3 = Math.pow(x, 3);
      x4 = Math.pow(x, 4);
      x5 = Math.pow(x, 5);
      
      absTop = Math.abs(3 + (3 * x) + (3 * x2) + (3 * x3) + (3 * x4));
      dividend = Math.sqrt(absTop) + (3 * x5);
      divisor = Math.abs(x) + 3;
      result = dividend / divisor;
      
      //changed println to /n
      System.out.print("Result: " + result);
      
      //number of characters on sides of decimal point
      String resultString = " ";
      resultString = Double.toString(result);
      int decimalPoint = 0;
      int length = 0;
      decimalPoint = resultString.indexOf(".");
      length = resultString.length();
      
      int before = 0;
      int after = 0;
      
      before = decimalPoint;
      after = length - (before + 1);
      
      System.out.print("\n# of characters to left of "
         + "decimal point: " + before);
      System.out.print("\n# of characters to right of "
         + "decimal point: " + after);
         
      //New format result
      
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      System.out.print("\nFormatted Result: " + df.format(result));
   }
}