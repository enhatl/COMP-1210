import java.util.ArrayList;
/**
 * Program that holds integer values for various temperatures.
 * 
 * Activity 06
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.21.22
 */
public class Temperatures {

//INSTANCE VARIABLES
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

//CONSTRUCTOR

/**
 * Sets up basic information in the program.
 *
 * @param temperaturesIn - inputed temperatures
 */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
//METHODS

/**
 * Get low temp method.
 *
 * @return - low temperature
 */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
/**
 * Get high temp method.
 *
 * @return - high temperature
 */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high  = temp;
         }
      }
      return high;
   }
   
/**
 * Lower minimum method. Either returns the paramater or the value 
 * from getLowTemp().
 * 
 * @param lowIn - compare the temps to this number
 * @return - lowest temperature, either lowIn and the ArrayList
 */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
/**
 * Higher maximum method. Either returns the paramater or the value 
 * from getHighTemp().
 * 
 * @param highIn - compare the temps to this number
 * @return - highest temperature, either highIn and the ArrayList    
 */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
/**
 * To string method.
 *
 * @return - string of high and low temps
 */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}