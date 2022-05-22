/**
* Outfielder class. Stores data and has methods. Derives from BallPlayer.
*
* Project 10
* @author Emily Hollingshead - Comp 1210 - 005
* @version 04.13.22
*/
 
public class Outfielder extends BallPlayer {
//FIELDS

   private double outfielderFieldingAvg;

//CONSTRUCTOR

/**
 * Outfielder constructor.
 *
 * @param numberIn - player number
 * @param nameIn - player name
 * @param positionIn - player position
 * @param baseSalaryIn - player base salary
 * @param bonusAdjFactorIn - player bonus adjustment factor
 * @param battingAvgIn - player batting average
 *
 * @param outfielderFieldingAvgIn - outfielder fielding average
 */

   public Outfielder(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn, double bonusAdjFactorIn, double battingAvgIn, 
      double outfielderFieldingAvgIn) {
      
      super(numberIn, nameIn, positionIn, baseSalaryIn, bonusAdjFactorIn,
         battingAvgIn);
      outfielderFieldingAvg = outfielderFieldingAvgIn; 
   }

//METHODS

/**
 * Get outfielder fielding avg method.
 *
 * @return outfielder fielding avg
 */
   
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
/**
 * Set outfielder fielding avg method.
 *
 * @param outfielderFieldingAvgIn - input
 */
 
   public void setOutfielderFieldingAvg(double outfielderFieldingAvgIn) {
      outfielderFieldingAvg = outfielderFieldingAvgIn; 
   }
   
/**
 * Total earnings method.
 *
 * @return total earnings
 */
 
   public double totalEarnings() {
      double total = baseSalary * bonusAdjFactor * battingAvg;
      total = total * outfielderFieldingAvg;
      return baseSalary + total;
   }
   
/**
 * To string method.
 *
 * @return string
 */
 
   public String toString() {
      String output = " (class Outfielder)";
      return super.toString() + output;
   }
 
}