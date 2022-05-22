import java.util.Comparator;
/**
 * EarningsComparator class. Compares earnings for BallPlayer objects.
 *
 * Project 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.13.22
 */
 
public class EarningsComparator implements Comparator<BallPlayer> {
  
  /**
   * Compare method. Compares by order.
   *
   * @param p1 - player 1
   * @param p2 - player 2
   * @return -x, 0, x based on placement
   */
   
   public int compare(BallPlayer p1, BallPlayer p2) {
      double p1Earnings = p1.totalEarnings();
      double p2Earnings = p2.totalEarnings();
      
      return Double.compare(p2Earnings, p1Earnings);
   }
}