import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Pitcher class test file.   
*
* Project 10
* @author Emily Hollingshead - Comp 1210 - 005
* @version 04.13.22
*/

public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * Getter tests.
    */
   @Test public void getterTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
         
      Assert.assertEquals("getWins Test", 22, p3.getWins());
      Assert.assertEquals("getLosses Test", 4, p3.getLosses());
      Assert.assertEquals("getEra Test", 2.85, p3.getEra(), 0.00001);
   }
   
   /**
    * Setters tests.
    */
    
   @Test public void setterTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
      
      //set wins  
      p3.setWins(20);
     
      Assert.assertEquals("setWins Test", 20, p3.getWins());
      
      //set losses
      p3.setLosses(2);
      
      Assert.assertEquals("setLosses Test", 2, p3.getLosses());
      
      //set era
      p3.setEra(4.31);
      
      Assert.assertEquals("setEra Test", 4.31, p3.getEra(), 0.000001);
   }
   
   /**
    * Total earnings test.
    */
    
   @Test public void totalEarningsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
         
      Assert.assertEquals("totalEarnings Test", 248181.81818181818, 
         p3.totalEarnings(), 0.00001); 
   }
   
  /**
   * Stats test.
   */
   
   @Test public void statsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
         
      Assert.assertEquals("stats Test", "22 wins, 4 losses, 2.85 ERA", 
         p3.stats());
   }
   
  /**
   * To string method.
   */
   
   @Test public void toStringTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
         
      Assert.assertEquals("toString Test", true, 
         p3.toString().contains("(class Pitcher)"));
   }
}
