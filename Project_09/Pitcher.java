/**
 * Pitcher class. Stores data and has methods. Derives from BallPlayer.
 *
 * Project 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.08.22
 */
 
public class Pitcher extends BallPlayer {
 //FIELDS
 
   protected int wins;
   protected int losses;
   protected double era;

//CONSTRUCTOR

/**
 * Pitcher constructor.
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
 */

   public Pitcher(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn, double bonusAdjFactorIn, double battingAvgIn, 
      int winsIn, int lossesIn, double eraIn) {
      
      super(numberIn, nameIn, positionIn, baseSalaryIn, bonusAdjFactorIn,
         battingAvgIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   
   }

//METHODS

/**
 * Get wins method.
 *
 * @return wins
 */
 
   public int getWins() {
      return wins;
   }
 
/**
 * Set wins method.
 *
 * @param winsIn - wins input
 */
 
   public void setWins(int winsIn) {
      wins = winsIn;
   }
 
/**
 * Get losses method.
 *
 * @return losses
 */
 
   public int getLosses() {
      return losses;
   }
/**
 * Set losses method.
 *
 * @param lossesIn - losses input
 */
 
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }
 
/**
 * Get era method.
 *
 * @return era
 */
 
   public double getEra() {
      return era;
   }
 
/**
 * Set era method.
 *
 * @param eraIn - era input
 */
 
   public void setEra(double eraIn) {
      era = eraIn;
   }
 
/**
 * Total earnings method.
 *
 * @return total earnings
 */
 
   public double totalEarnings() {
      double total = baseSalary * bonusAdjFactor * (1 / (1 + era));
      total = total * ((wins - losses) / 25.0);
      return baseSalary + total;
   }
 
/**
 * Stats method. Overrides from BallPlayer method.
 *
 * @return string for wins losses and era
 */
 
   public String stats() {
      return wins + " wins, " + losses + " losses, " + era + " ERA";
   }
/**
 * To string method.
 *
 * @return string
 */
 
   public String toString() {
      String output = " (class Pitcher)";
      return super.toString() + output;
   }
}