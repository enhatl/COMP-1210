import java.text.DecimalFormat;

/**
 * Square Antiprism list class. Creates a list of SquareAntiprism objects.
 *
 * Project 08
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.01.22
 */
 
public class SquareAntiprismList {
 
//FIELDS
   private String listName;
   private SquareAntiprism[] squareAntiList;
   private int num;
 
//CONSTRUCTOR

/**
 * Constructor for SquareAntiprismList.
 *
 * @param listNameIn - listName input
 * @param squareAntiListIn - array input
 * @param numIn - number of sqAnti objects in array (not length)
 */
 

   public SquareAntiprismList(String listNameIn, 
      SquareAntiprism[] squareAntiListIn, int numIn) {
      
      listName = listNameIn;
      squareAntiList = squareAntiListIn;
      num = numIn;   
   }
 
//METHODS

/**
 * Get name method.
 *
 * @return list name
 */
 
   public String getName() {
      return listName;
   }
 
/**
 * Number of SquareAntiprisms method.
 *
 * @return num of objects
 */
 
   public int numberOfSquareAntiprisms() {
      if (num > 0) {
         return num;
      }
      else {
         return 0;
      }
   }
 
/**
 * Total surface area method.
 *
 * @return total surface area
 */
 
   public double totalSurfaceArea() {
      double total = 0;
      int i = 0;
      
      while (i < num) {
         total += squareAntiList[i].surfaceArea();
         i++;
      }
      return total;
   }
  
/**
 * Total volume method.
 *
 * @return total volume
 */
 
   public double totalVolume() {
      double total = 0;
      int i = 0;
      
      while (i < num) {
         total += squareAntiList[i].volume();
         i++;
      }
      return total;
   }
 
/**
 * Average surface area method.
 *
 * @return avg. surface area
 */
 
   public double averageSurfaceArea() {
      double avg = 0;
      int i = 0;
      
      while (i < num) {
         avg += squareAntiList[i].surfaceArea() / num;
         i++;
      }
      return avg;
   }
 
/**
 * Average volume method.
 *
 * @return avg. volume
 */
 
   public double averageVolume() {
      double avg = 0;
      int i = 0;
      
      while (i < num) {
         avg += squareAntiList[i].volume() / num;
         i++;
      }
      return avg;
   }
 
/**
 * To string method.
 *
 * @return string with summary
 */
 
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of SquareAntiprisms: " + numberOfSquareAntiprisms();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += " square units";
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += " cubic units";
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += " square units";
      result += "\nAverage Volume: " + df.format(averageVolume());
      result += " cubic units";
      
      return result;
   }
 
/**
 * Get list method.
 *
 * @return the array 
 */
 
   public SquareAntiprism[] getList() {
      return squareAntiList;
   }
 
/**
 * Add SquareAntiprism method.
 *
 * @param labelIn - label input
 * @param edgeIn - edge input
 */
 
   public void addSquareAntiprism(String labelIn, double edgeIn) {
      SquareAntiprism s = new SquareAntiprism(labelIn, edgeIn);
      squareAntiList[num] = s;
      num++;
   }
 
/**
 * Find SquareAntiprism method.
 *
 * @param labelIn - label input
 * @return object associated with labelIn
 */
 
   public SquareAntiprism findSquareAntiprism(String labelIn) {
      SquareAntiprism result = null;
      
      for (int i = 0; i < num; i++) {
         if (squareAntiList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = squareAntiList[i];
         }
      }
      
      return result;
   }
 
/**
 * Delete SquareAntiprism method.
 *
 * @param labelIn - label input
 * @return object associated with labelIn
 */
 
   public SquareAntiprism deleteSquareAntiprism(String labelIn) {
      SquareAntiprism result = null;
      for (int i = 0; i < num; i++) {
         if (squareAntiList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = squareAntiList[i];
            for (int j = i; j < num - 1; j++) {
               squareAntiList[j] = squareAntiList[j + 1];
            }
            squareAntiList[num - 1] = null;
            num--;
            //result = squareAntiList[i];
            break;
         }
      }
      return result;
   }
 
/**
 * Edit SquareAntiprism method.
 *
 * @param labelIn - label input
 * @param edgeIn - edge input
 * @return is object successfully edited
 */
 
   public boolean editSquareAntiprism(String labelIn, double edgeIn) {
      boolean result = false;
      for (int i = 0; i < num; i++) {
         if (squareAntiList[i].getLabel().equalsIgnoreCase(labelIn)) {
            squareAntiList[i].setEdge(edgeIn);
            result = true;
         }
      }
      
      return result;
   }
 
/**
 * Find SquareAntiprism with largest volume method.
 *
 * @return object with largest volume
 */ 
 
   public SquareAntiprism findSquareAntiprismWithLargestVolume() {
      SquareAntiprism result = null;
      
      if (num > 0) {
         double largest = squareAntiList[0].volume();
         int i = 0;
         while (i < num) {
            if (largest < squareAntiList[i].volume()) {
               largest = squareAntiList[i].volume();
               result = squareAntiList[i];
            }
            i++;
         }
      }
      return result;
   }
 
}