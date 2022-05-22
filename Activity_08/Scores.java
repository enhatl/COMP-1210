/**
 * Scores class that creates a Scores object.
 *
 * Activity 08
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 03.29.22
 */
 
public class Scores {
 
 //INSTANCE VARIABLES
 
   private int[] numbers;
   
 //CONSTRUCTOR
 
 /**
  * Scores constructor.
  *
  * @param numbersIn - user input for scores
  */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
 //METHODS
     
 /**
  * Find evens method.
  *
  * @return array of all evens
  */
  
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
  
 /**
  * Find odds method.
  *
  * @return array of all odds
  */
  
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
  
 /**
  * Calculate average method.
  *
  * @return average of all elements
  */
  
   public double calculateAverage() {
      double sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      return sum / numbers.length;
   }
  
 /**
  * To string method.
  *
  * @return all scores
  */
  
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
  
 /**
  * To string in reverse method.
  *
  * @return all scores in reverse order
  */
  
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}
