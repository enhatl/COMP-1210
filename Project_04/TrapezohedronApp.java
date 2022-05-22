import java.util.Scanner;
/**
* Program that reads data, created a Trapezohedron object
* and then prints the object.
* 
* Project 04
* @author Emily Hollingshead - Comp 1210 - 005
* @version 02.11.22
*/
public class TrapezohedronApp {

/**
  * Requests user input and outputs the correct output.
  *
  * @param args Command line arguments - not used.
  */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      String labelIn = " ";
      String colorIn = " ";
      String shortEdgeInString = " ";
      
      System.out.print("Enter label, color, and short edge length for a"
           + " trapezohedron.\n\tlabel: ");
      labelIn = userInput.nextLine();
      System.out.print("\tcolor: ");
      colorIn = userInput.nextLine();
      System.out.print("\tshort edge: ");
      shortEdgeInString = userInput.nextLine();
      
      double shortEdgeIn = Double.parseDouble(shortEdgeInString);
     
     //is short edge a viable option?
     
      if (shortEdgeIn > 0) {
         Trapezohedron trap = new Trapezohedron(labelIn, colorIn, shortEdgeIn);
         System.out.println("\n" + trap);
      }
      
      else {
         System.out.print("Error: short edge must be greater than zero.");
      }
   } 
}