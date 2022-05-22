import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* ReliefPitcher class test file.   
*
* Project 09
* @author Emily Hollingshead - Comp 1210 - 005
* @version 04.08.22
*/ 
public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Get saves test.
    */
    
   @Test public void getSavesTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
         
      Assert.assertEquals("getSaves Test", 17, p4.getSaves());
   }
   
   /**
    * Set saves test.
    */
    
   @Test public void setSavesTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
      p4.setSaves(10);
      
      Assert.assertEquals("setSaves Test", 10, p4.getSaves());
   }
   
   /**
    * Total earnings test.
    */
    
   @Test public void totalEarningsTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
         
      Assert.assertEquals("totalEarnings Test", 214948.45360824742, 
         p4.totalEarnings(), 0.00001); 
   }
   
  /**
   * Stats test.
   */
   
   @Test public void statsTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
         
      Assert.assertEquals("stats Test", "5 wins, 4 losses, 17 saves, 3.85 ERA", 
         p4.stats());
   }
   
  /**
   * To string method.
   */
   
   @Test public void toStringTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
         
      Assert.assertEquals("toString Test", true, 
         p4.toString().contains("(class ReliefPitcher)"));
   }

}
