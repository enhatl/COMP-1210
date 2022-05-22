import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Outfielder class test file.   
*
* Project 09
* @author Emily Hollingshead - Comp 1210 - 005
* @version 04.08.22
*/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * Getters test for all BallPlayer objects.
    */
    
   @Test public void getTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
      
      Assert.assertEquals("getNumber Test", "32", p1.getNumber());
      Assert.assertEquals("getName Test", "Jackie Smith", p2.getName());
      Assert.assertEquals("getPosition Test", "RHP", p3.getPosition());
      Assert.assertEquals("getBaseSalary Test", 150000, p4.getBaseSalary(),
         0.000001);
      Assert.assertEquals("getBonusAdjustmentFactor Test", 1.25,
         p1.getBonusAdjustmentFactor(), 0.000001);
      Assert.assertEquals("getBattingAvg Test", .275, p2.getBattingAvg(), 
         0.000001);
   }
   
   /**
    * Setters test for all BallPlayer objects.
    */
    
   @Test public void setTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
      
      //set number   
      p1.setNumber("10");
         
      Assert.assertEquals("setNumber Test", "10", p1.getNumber()); 
      
      //set name
      p2.setName("John Doe");
      
      Assert.assertEquals("setName Test", "John Doe", p2.getName());
      
      //set position
      p3.setPosition("Side Dancer");
      
      Assert.assertEquals("setPosition Test", "Side Dancer", p3.getPosition());
      
      //set base salary
      p4.setBaseSalary(200000);
      
      Assert.assertEquals("setBaseSalary Test", 200000, p4.getBaseSalary(),
         0.000001);
         
      //set bonus adj factor
      p1.setBonusAdjustmentFactor(2.8);
      
      Assert.assertEquals("setBonusAdjustmentFactor Test", 2.8, 
         p1.getBonusAdjustmentFactor(), 0.000001);
         
      //set batting avg
      p2.setBattingAvg(0.56);
         
      Assert.assertEquals("setBattingAvg Test", 0.56, 
         p2.getBattingAvg(), 0.000001);
   }
   
   /**
    * Stats test.
    */   
   @Test public void statsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
      
      Assert.assertEquals("stats Test", ".375", p1.stats()); 
   }
   
   /**
    * To string test.
    */
   @Test public void toStringTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
         
      Assert.assertEquals("toString Test", true, 
         p1.toString().contains("(class Outfielder)"));
   }
   
   /**
    * Total earnings test.
    */
    
   @Test public void totalEarningsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
         
      Assert.assertEquals("totalEarnings Test", 216796.875, p1.totalEarnings(), 
         0.000001);
   }
   
   /**
    * Get outfielder fielding avg test.
    */
    
   @Test public void getOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
         
      Assert.assertEquals("getOutfielderFieldingAvg Test", .950, 
         p1.getOutfielderFieldingAvg(), 0.000001);
   }
   
   /**
    * Set outfielder fielding avg test.
    */
    
   @Test public void setOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
         
      p1.setOutfielderFieldingAvg(.650);
      
      Assert.assertEquals("setOutfielderFieldingAvg Test", .650, 
         p1.getOutfielderFieldingAvg(), 0.000001);
   } 
    
  /**
   * Count tests.
   */
   
   @Test public void resetCountTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
         
      p1.resetCount();
   
      Assert.assertEquals("resetCount Test", 0, p1.getCount());
   }
   
  /**
   * Get count test.
   */
   
   @Test public void getCountTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 150000, 1.25, 
         .375, .950);
     
      p1.resetCount();
      
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 150000, 2.50, 
         .275, .850);
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 150000, 3.50, .125, 
         22, 4, 2.85);
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
        
      Assert.assertEquals("getCount Test", 3, p1.getCount());
   }
    
}
