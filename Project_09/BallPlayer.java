import java.text.DecimalFormat;
/**
 * Abstract BallPlayer class. Stores data and has methods.
 *
 * Project 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.08.22
 */
 
public abstract class BallPlayer {
//FIELDS

   protected String number;
   protected String name;
   protected String position;
   protected double baseSalary;
   protected double bonusAdjFactor;
   protected double battingAvg;
   protected static int ballPlayerCount = 0;

//CONSTRUCTOR

/**
 * BallPlayer constructor.
 *
 * @param numberIn - player number
 * @param nameIn - player name
 * @param positionIn - player position
 * @param baseSalaryIn - player base salary
 * @param bonusAdjFactorIn - player bonus adjustment factor
 * @param battingAvgIn - player batting average
 */
 
   public BallPlayer(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn, double bonusAdjFactorIn, double battingAvgIn) {
      number = numberIn;
      name = nameIn;
      position = positionIn;
      baseSalary = baseSalaryIn;
      bonusAdjFactor = bonusAdjFactorIn;
      battingAvg = battingAvgIn;
      ballPlayerCount++;
   }

//METHODS

/**
 * Get number method.
 *
 * @return number
 */
 
   public String getNumber() {
      return number;
   }
 
/**
 * Set number method.
 *
 * @param numberIn - number input
 */
 
   public void setNumber(String numberIn) {
      number = numberIn;
   }
 
/**
 * Get name method.
 *
 * @return name
 */
 
   public String getName() {
      return name;
   }
 
/**
 * Set name method.
 *
 * @param nameIn - name input
 */
 
   public void setName(String nameIn) {
      name = nameIn;
   }
 
/**
 * Get position method.
 *
 * @return position
 */
 
   public String getPosition() {
      return position;
   }
 
/**
 * Set position method.
 *
 * @param positionIn - position input
 */
 
   public void setPosition(String positionIn) {
      position = positionIn;
   }
 
/**
 * Get base salary method.
 *
 * @return base salary
 */
 
   public double getBaseSalary() {
      return baseSalary;
   }
 
/**
 * Set base salary method.
 *
 * @param baseSalaryIn - salary input
 */
 
   public void setBaseSalary(double baseSalaryIn) {
      baseSalary = baseSalaryIn;
   }
 
/**
 * Get bonus adjustment factor method.
 *
 * @return bonus adjustment factor
 */
 
   public double getBonusAdjustmentFactor() {
      return bonusAdjFactor;
   }
 
/**
 * Set bonus adjustment factor method.
 *
 * @param bonusAdjFactorIn - bonus adj factor input
 */
 
   public void setBonusAdjustmentFactor(double bonusAdjFactorIn) {
      bonusAdjFactor = bonusAdjFactorIn;
   }
 
/**
 * Get batting average method.
 *
 * @return batting average
 */
 
   public double getBattingAvg() {
      return battingAvg;
   }
 
/**
 * Set batting average method.
 *
 * @param battingAvgIn - batting avg input
 */
 
   public void setBattingAvg(double battingAvgIn) {
      battingAvg = battingAvgIn;
   }
 
/**
 * Get count method.
 *
 * @return count
 */
 
   public static int getCount() {
      return ballPlayerCount;
   }
 
/**
 * Reset count method.
 */
 
   public static void resetCount() {
      ballPlayerCount = 0;
   }

/**
 * Stats method.
 *
 * @return formatted batting average
 */
 
   public String stats() {
      DecimalFormat df = new DecimalFormat(".000");
      
      return df.format(battingAvg);
   }

/**
 * To string method.
 *
 * @return string 
 */
 
   public String toString() {
      DecimalFormat dfMoney = new DecimalFormat("$#,##0.00");
      String output = number + " " + name + " (" + position + ") " + stats();
      output += "\nBase Salary: " + dfMoney.format(baseSalary);
      output += " Bonus Adjustment Factor: " + bonusAdjFactor;
      output += "\nTotal Earnings: " + dfMoney.format(totalEarnings());
      return output;
   }
 
/**
 * Total earnings method. Abstract method.
 *
 * @return total earnings
 */
 
   public abstract double totalEarnings();
 
}