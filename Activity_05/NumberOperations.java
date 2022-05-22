/**
 * Program that holds an integer and performs various operations.
 * 
 * Activity 05
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.15.22
 */
public class NumberOperations {

//instance variables
   private int number;
   
 //constructor
 
  /**
  * Constructor takes integer parameter.
  * 
  * @param numberIn - number input
  */
 
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
 //methods
 
 /**
  * Get the value.
  *
  * @return - is there a value.
  */
   public int getValue() {
      return number; 
   }
   
 /**
  * Odds under method.
  *
  * @return - String value
  */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
  
 /**
  * Powers Two Under method.
  *
  * @return - string value
  */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2;  // get next power of 2
      }
      return output;
   }
  
 /**
  * Is greater method.
  *
  * @param compareNumber - compared number.
  * @return - int value
  */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      if (number < compareNumber) {
         return -1;
      }
      else {
      
         return 0;
      } 
   }
  
 /**
  * To string method.
  *
  * @return - string value
  */
   public String toString() {
      return number + " "; //placeholder
   }
   
}
