/**
 * ReliefPitcher class. Stores data and has methods. Derives from Pitcher.
 *
 * Project 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.08.22
 */
 
public class ReliefPitcher extends Pitcher {
   //FIELDS
   
   private int saves;

//CONSTRUCTOR

/**
   * Relief Pitcher constructor.
   *
   * @param numberIn - player number
   * @param nameIn - player name
   * @param positionIn - player position
   * @param baseSalaryIn - player base salary
   * @param bonusAdjFactorIn - player bonus adjustment factor
   * @param battingAvgIn - player batting average
   *
   * @param winsIn - player wins
   * @param lossesIn - player losses
   * @param eraIn - playerearned run average
   * 
   * @param savesIn - player saves
   */
   public ReliefPitcher(String numberIn, String nameIn, String positionIn,
        double baseSalaryIn, double bonusAdjFactorIn, double battingAvgIn, 
        int winsIn, int lossesIn, double eraIn, int savesIn) {
        
      super(numberIn, nameIn, positionIn, baseSalaryIn, bonusAdjFactorIn,
         battingAvgIn, winsIn, lossesIn, eraIn);
      saves = savesIn; 
   }

//METHODS

/**
 * Get saves method.
 *
 * @return saves
 */
 
   public int getSaves() {
      return saves;
   }
/**
 * Set saves method.
 *
 * @param savesIn - saves input
 */
 
   public void setSaves(int savesIn) {
      saves = savesIn;
   }
   
/**
 * Total earnings method.
 *
 * @return total earnings
 */

   public double totalEarnings() {
      double total = baseSalary * bonusAdjFactor * (1 / (1 + era));
      total = total * ((wins - losses + saves) / 30.0);
      return baseSalary + total;
   }
   
/**
 * Stats method.
 *
 * @return string for stats
 */
 
   public String stats() {
      String output = wins + " wins, " + losses + " losses, ";
      output += saves + " saves, " + era + " ERA";
      return output;
   }
   
/**
 * To string method.
 *
 * @return string
 */
 
   public String toString() {
      return super.toString().replace("Pitcher", "ReliefPitcher");
   }
}