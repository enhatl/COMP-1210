/**
 * Infielder class. Stores data and has methods. Derives from BallPlayer.
 *
 * Project 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.13.22
 */

public class Infielder extends BallPlayer { 
//FIELDS

   private double infielderFieldingAvg;

//CONSTRUCTOR

/**
 * Infielder constructor.
 *
 * @param numberIn - player number
 * @param nameIn - player name
 * @param positionIn - player position
 * @param baseSalaryIn - player base salary
 * @param bonusAdjFactorIn - player bonus adjustment factor
 * @param battingAvgIn - player batting average
 *
 * @param infielderFieldingAvgIn - infielder fielding average
 */

   public Infielder(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn, double bonusAdjFactorIn, double battingAvgIn, 
      double infielderFieldingAvgIn) {
      
      super(numberIn, nameIn, positionIn, baseSalaryIn, bonusAdjFactorIn,
         battingAvgIn);
      infielderFieldingAvg = infielderFieldingAvgIn;
   
   }
//METHODS

/**
 * Get infielder fielding avg method.
 *
 * @return infielder fielding avg
 */
   
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
/**
 * Set infielder fielding avg method.
 *
 * @param infielderFieldingAvgIn - input
 */
 
   public void setInfielderFieldingAvg(double infielderFieldingAvgIn) {
      infielderFieldingAvg = infielderFieldingAvgIn; 
   }
   
/**
 * Total earnings method.
 *
 * @return total earnings
 */
 
   public double totalEarnings() {
      double total = baseSalary * bonusAdjFactor * battingAvg;
      total = total * infielderFieldingAvg;
      return baseSalary + total;
   }
   
/**
 * To string method.
 *
 * @return string
 */
 
   public String toString() {
      String output = " (class Infielder)";
      return super.toString() + output;
   }
}