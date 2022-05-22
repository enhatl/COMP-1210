import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Takes a list of trapezohedron objects and performs actions on them.
 * 
 * Project 05
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.18.22
 */
public class TrapezohedronList { 

//FIELDS

   private String trapListName = "";
   private ArrayList<Trapezohedron> trapListArray 
      = new ArrayList<Trapezohedron>();
     
//CONSTRUCTOR

/**
 * Sets up the information for a list to be created.
 *
 * @param trapListNameIn - name of the list requested
 * @param trapListArrayIn - list of requested trapezohedron objects
 */
 
   public TrapezohedronList(String trapListNameIn,
      ArrayList<Trapezohedron> trapListArrayIn) {
      trapListName = trapListNameIn;
      trapListArray = trapListArrayIn;
   } 
   
//METHODS

/**
 * Get name method.
 *
 * @return name of list
 */
 
   public String getName() {
      return trapListName;
   }
   
/**
 * Method to find the number of trapezohedrons. 
 *
 * @return int value for number of traps
 */
 
   public int numberOfTrapezohedrons() {
      int output = trapListArray.size();
      if (trapListArray.size() == 0) {
         return 0;
      }
      else {
         return output;
      }
   }
   
/**
 * Total surface area method.
 *
 * @return total surface area for all traps in list
 */
 
   public double totalSurfaceArea() {
      double output = 0;
      if (trapListArray.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         while (index < trapListArray.size()) {
            Trapezohedron trap = trapListArray.get(index);
            output += trap.surfaceArea();
            index++;
         }
         return output;
      }
   }
   
/**
 * Total volume method.
 *
 * @return total volume for all traps in list
 */
 
   public double totalVolume() {
      double output = 0;
      if (trapListArray.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         while (index < trapListArray.size()) {
            Trapezohedron trap = trapListArray.get(index);
            output += trap.volume();
            index++;
         }
         return output;
      }
   }

/**
 * Average surface area method.
 *
 * @return avg surface area for all traps in list
 */
 
   public double averageSurfaceArea() {
      double output = 0;
      if (trapListArray.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         int size = trapListArray.size();
         double total = 0;
         while (index < size) {
            Trapezohedron trap = trapListArray.get(index);
            total += trap.surfaceArea();
            index++;
         }
         output = total / size;
         return output;
      } 
   }
   
/**
 * Average volume method.
 *
 * @return - average for all volumes
 */
 
   public double averageVolume() {
      double output = 0;
      if (trapListArray.size() == 0) {
         return 0;
      }
      else {
         int index = 0;
         int size = trapListArray.size();
         double total = 0;
         while (index < size) {
            Trapezohedron trap = trapListArray.get(index);
            total += trap.volume();
            index++;
         }
         output = total / size;
         return output;
      }
   }
   
/**
 * To string method.
 *
 * @return - string with name of list and the lists contents
 */
 
   public String toString() {
      String output = "";
      output += trapListName + "\n";
      
      int index = 0;
      int size = trapListArray.size();
      while (index < size) {
         output += "\n" + trapListArray.get(index) + "\n";
         index++;  
      }
      return output;
   }
   
/**
 * Summary information method.
 *
 * @return string with a summary of all traps
 */
 
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      String output = "";
      output += "----- Summary for " + trapListName + " -----";
      output += "\nNumber of Trapezohedrons: " + numberOfTrapezohedrons();
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      output += " square units";
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      output += " square units";
      output += "\nAverage Volume: " + df.format(averageVolume());
      output += " cubic units";
      
      return output;
   }
}