import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Infielder class test file.   
*
* Project 09
* @author Emily Hollingshead - Comp 1210 - 005
* @version 04.08.22
*/
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * Get infielder fielding avg test.
    */
    
   @Test public void getInfielderFieldingAvgTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
         
      Assert.assertEquals("getInfielderFieldingAvg Test", .850, 
         p2.getInfielderFieldingAvg(), 0.000001);
   }
   
   /**
    * Set Infielder fielding avg test.
    */
    
   @Test public void setInfielderFieldingAvgTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
         
      p2.setInfielderFieldingAvg(.750);
      
      Assert.assertEquals("setInfielderFieldingAvg Test", .750, 
         p2.getInfielderFieldingAvg(), 0.000001);
   }
   
   /**
    * Total earnings test.
    */
    
   @Test public void totalEarningsTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
         
      Assert.assertEquals("totalEarnings Test", 237656.25, 
         p2.totalEarnings(), 0.000001);
   }
   
   /**
    * To string test.
    */
    
   @Test public void toStringTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
   
      Assert.assertEquals("toString Test", true, 
         p2.toString().contains("(class Infielder)"));
   }
}
