import java.util.Scanner;
/**
 * Program that takes user input and converts it
 * to its respective form based on user choice.
 *
 * Activity 03
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.01.22
 */
public class MessageConverter {

/**
 * Prompts for input and outputs appropiate conversion.
 * 
 *
 * @param args Command line arguments - not used.
 */

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String message = " ";
      int outputType = 0;
      String result = " ";
      
      //Request user input
      System.out.print("Type in a message and press enter:\n\t>");
      message = userInput.nextLine();
      
      //Request conversion type
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
   
      //Convert text
      if (outputType == 0) { //as is
         result = message;
         System.out.println("\n" + result);
      }
      else if (outputType == 1) { //trimmed
         result = message.trim();
         System.out.println("\n" + result);
      }
      else if (outputType == 2) { //lowercase
         result = message.toLowerCase();
         System.out.println("\n" + result);
      }
      else if (outputType == 3) { //uppercase
         result = message.toUpperCase();
         System.out.println("\n" + result);
      }
      else if (outputType == 4) { //replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
         System.out.println("\n" + result);
      }
      else if (outputType == 5) { //without first and last character
         result = message.substring(1, message.length() - 1);
         System.out.println("\n" + result);
      }
      else { //invalid output
         result = "Error: Invalid choice input.";
         System.out.println("\n" + result);
      }
   }
}