import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Square antiprism list class test.
 *
 * Project 08
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.01.22
 */

public class SquareAntiprismListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      //Used for coder reference (copy and paste for the tests).
     
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      SquareAntiprism[] squareAntiArray2 = new SquareAntiprism[0];
      
      SquareAntiprism test = new SquareAntiprism("Test", 1.25);
      SquareAntiprism test2 = new SquareAntiprism("Test2", 1.25);
      SquareAntiprism test3 = new SquareAntiprism("Test", 3); 
   }


/**
 * Test for get name method.
 */
 
   @Test public void getNameTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertEquals("getNameTest", "Test List", squareAntiList.getName());
   }
 
/**
 * Test for number of square antiprisms method.
 */
 
   @Test public void numberOfSquareAntiprismsTest() {
     //0 test
      SquareAntiprism[] squareAntiArray2 = new SquareAntiprism[0];
      SquareAntiprismList squareAntiList2 = 
         new SquareAntiprismList("Test List 2", squareAntiArray2, 0);
         
      Assert.assertEquals("0", 0, squareAntiList2.numberOfSquareAntiprisms());
      
      //3 test
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
      
      Assert.assertEquals("Pass", 3, squareAntiList.numberOfSquareAntiprisms());
   }
 
/**
 * Test for total surface area method.
 */
 
   @Test public void totalSurfaceAreaTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertEquals("totalSurfaceAreaTest", 77.7424569,
         squareAntiList.totalSurfaceArea(), 0.00001);
   }
 
/**
 * Test for total volume method.
 */
 
   @Test public void totalVolumeTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertEquals("totalVolumeTest", 25.0075591,
         squareAntiList.totalVolume(), 0.00001);
   }
 
/**
 * Test for average surface area method.
 */
 
   @Test public void averageSurfaceAreaTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertEquals("averageSurfaceAreaTest", 25.9141523,
         squareAntiList.averageSurfaceArea(), 0.00001);
   }
 
/**
 * Test for average volume method.
 */

   @Test public void averageVolumeTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
      
      Assert.assertEquals("averageVolumeTest", 8.33585302,
         squareAntiList.averageVolume(), 0.00001);
   }
 
/**
 * Test for to string method.
 */
 
   @Test public void toStringTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertEquals("toStringTest", true, 
         squareAntiList.toString().contains("Number of SquareAntiprisms: 3"));
   }
 
/**
 * Test for get list method.
 */
 
   @Test public void getListTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertArrayEquals("getListTest", squareAntiArray, 
         squareAntiList.getList());
   }
 
/**
 * Test for add square antiprism method.
 */
 
   @Test public void addSquareAntiprismTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      SquareAntiprism addObj = new SquareAntiprism("TestAdded", 1.25);
      
      squareAntiList.addSquareAntiprism("TestAdded", 1.25);
      SquareAntiprism[] squareAntiArray2 = squareAntiList.getList();
      
      Assert.assertEquals("addSquareAntiprismTest", addObj, 
         squareAntiArray2[3]);
   }
 
/**
 * Test for find square antiprism method.
 */
 
   @Test public void findSquareAntiprismTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
      
      
      Assert.assertEquals("findSquareAntiprismTest Fail", null,
         squareAntiList.findSquareAntiprism("Test1"));
      Assert.assertEquals("findSquareAntiprismTest Pass", squareAntiArray[0],
         squareAntiList.findSquareAntiprism("Test"));
   }
 
/**
 * Test for delete square antiprism method.
 */
 
   @Test public void deleteSquareAntiprismTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
      
      Assert.assertEquals("deleteSquareAntiprismTest Fail", null,
         squareAntiList.deleteSquareAntiprism("Test 1"));
      Assert.assertEquals("deleteSquareAntiprismTest Pass", squareAntiArray[0],
         squareAntiList.deleteSquareAntiprism("Test"));
   }
 
/**
 * Test for edit square antiprism method.
 */
 
   @Test public void editSquareAntiprismTest() {
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 1.25);
      squareAntiArray[2] = new SquareAntiprism("Test3", 1.25);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
      
      //not found   
      Assert.assertEquals("editSquareAntiprismTest Fail", false,
         squareAntiList.editSquareAntiprism("Test 1", 4));
         
      squareAntiList.editSquareAntiprism("Test", 4);
      Assert.assertEquals("editSquareAntiprismTest", true,
         squareAntiList.editSquareAntiprism("Test", 4));
   }
 
/**
 * Test for find square antiprism with largest volume method.
 */
 
   @Test public void findSquareAntiprismWithLargestVolumeTest() {
      SquareAntiprism[] squareAntiArray2 = new SquareAntiprism[0];
      SquareAntiprismList squareAntiList2 = 
         new SquareAntiprismList("Test List 2", squareAntiArray2, 0);
      
      Assert.assertEquals("findLargestVolumeTest Fail", null,
         squareAntiList2.findSquareAntiprismWithLargestVolume());
      
      SquareAntiprism[] squareAntiArray = new SquareAntiprism[20];
      squareAntiArray[0] = new SquareAntiprism("Test", 1.25);
      squareAntiArray[1] = new SquareAntiprism("Test2", 3);
      squareAntiArray[2] = new SquareAntiprism("Test3", 2);
      
      SquareAntiprismList squareAntiList = 
         new SquareAntiprismList("Test List", squareAntiArray, 3);
         
      Assert.assertEquals("findLargestVolumeTest", squareAntiArray[1],
         squareAntiList.findSquareAntiprismWithLargestVolume());
   }
}
