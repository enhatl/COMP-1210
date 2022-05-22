import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Square antiprism class test.
 *
 * Project 07A
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 03.18.22
 */

public class SquareAntiprismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Test for 'get' methods.
    */
    
   @Test public void getTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("Test", test.getLabel());
      Assert.assertEquals("getEdgeTest", 1.25, test.getEdge(), 0.0001);
   }
    
   /**
    * Test for setLabel method.
    */
    
   @Test public void setLabelTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("setLabelTest", true, test.setLabel("Test2"));
      Assert.assertEquals("setLabelTestFail", false, test.setLabel(null));
   }
    
   /**
    * Test for setEdge method.
    */
    
   @Test public void setEdgeTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("setEdgeTest", true, test.setEdge(8));
      Assert.assertEquals("setEdgeTestFail", false, test.setEdge(-4));
   }
     
   /**
    * Test for height method.
    */
    
   @Test public void heightTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("heightTest", 1.0753694623287144, 
         test.height(), 0.00001);
   }
    
   /**
    * Test for surfaceArea method.
    */
    
   @Test public void surfaceAreaTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("surfaceAreaTest", 25.91415231213733, 
         test.surfaceArea(), 0.000001);
   }
     
   /**
    * Test for volume method.
    */
    
   @Test public void volumeTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("volumeTest", 8.335853028236595, 
         test.volume(), 0.000001);
   }
     
   /**
    * Test for toString method.
    */
    
   @Test public void toStringTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("toStringTest", true, 
         test.toString().contains("\"Test\""));
   }
    
   /**
    * Test for getCount and resetCount methods.
    */
    
   @Test public void countTest() {
      SquareAntiprism.resetCount();
      
      Assert.assertEquals("resetCountTest", 0, SquareAntiprism.getCount());
     
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      SquareAntiprism test2 = new SquareAntiprism("Test2", 1.25);
      
      Assert.assertEquals("getCountTest", 2, SquareAntiprism.getCount());
   }
     
     
   /**
    * Test for equals method.
   */
    
   @Test public void equalsTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      SquareAntiprism test2 = new SquareAntiprism("Test2", 1.25);
      SquareAntiprism test3 = new SquareAntiprism("Test", 3);
      String test4 = "SquareAntiprism";
      
      Assert.assertEquals("equalsTest", true, test.equals(test));
      Assert.assertEquals("equalsTestFail", false, test.equals(test2));
      Assert.assertEquals("equalsTestFail", false, equals(test4));
      Assert.assertEquals("equalsTestFail", false, test.equals(test3));
      Assert.assertEquals("equalsTestFail", false, test.equals(test4));
   }
    
   /**
    * Test for hashCode method.
    */
    
   @Test public void hashCodeTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      
      Assert.assertEquals("getHashCodeTest", 0, test.hashCode());
   }
   
   /**
    * Test for compare to method.
    */
    
   @Test public void compareToTest() {
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      SquareAntiprism test2 = new SquareAntiprism("Test2", 1.25);
      SquareAntiprism test3 = new SquareAntiprism("Test", 3);
      
      Assert.assertEquals("compareToTest", 0, test.compareTo(test2));
      Assert.assertEquals("compareToTest", 1, test3.compareTo(test));
      Assert.assertEquals("compareToTest", -1, test.compareTo(test3));
   }
}
