/**
 * Division class.
 *
 * Activity 11
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.19.22
 */
 
public class Division {
 
   /**
    * Int divide method.
    *
    * @param num - numerator
    * @param denom - denominator
    * @return integer answer
    */
    
   public static int intDivide(int num, int denom) {
      try {
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0;
      }  
   }
   
   /**
    * Decimal divide method.
    *
    * @param num - numerator
    * @param denom - denominator
    * @return double answer
    */
    
   public static double decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator cannot"
            + " be zero.");
      }
      double result = (double) num / denom;
      return result;
   }
}