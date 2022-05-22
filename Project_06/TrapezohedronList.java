import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Takes a list of trapezohedron objects and performs actions on them.
 * 
 * Project 06
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.25.22
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
   
/**
 * Get list method.
 *
 * @return the array list of trap objects
 */
 
   public ArrayList<Trapezohedron> getList() {
      return trapListArray;
   }
   
/**
 * Read file method.
 *
 * @param fileName - file to read
 * @throws FileNotFoundException if file is not found
 * @return TrapezohedronList object
 */
   public TrapezohedronList readFile(String fileName) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileName));
      String listName = fileScan.nextLine();
      
      while (fileScan.hasNext()) {
         String label = fileScan.nextLine();
         String color = fileScan.nextLine();
         double shortEdge = Double.parseDouble(fileScan.nextLine());
         
         Trapezohedron trap = new Trapezohedron(label, color, shortEdge);
         trapListArray.add(trap);
      }
      fileScan.close();
      TrapezohedronList trapList 
         = new TrapezohedronList(listName, trapListArray);
      return trapList;
   }

/**
 * Add trapezohedron method.
 *
 * @param labelIn - label of trap
 * @param colorIn - color of trap
 * @param shortEdgeIn - short edge of trap
 * @return is trapezohedron added
 */
 
   public boolean addTrapezohedron(String labelIn, String colorIn, 
      double shortEdgeIn) {
      boolean isTrapEntered = false;
      if (labelIn != null && colorIn != null && shortEdgeIn > 0) {
         labelIn = labelIn.trim();
         colorIn = colorIn.trim();
         //Trapezohedron newTrap = new Trapezohedron(labelIn, colorIn, 
            //shortEdgeIn);
         trapListArray.add(new Trapezohedron(labelIn, colorIn, shortEdgeIn));
         isTrapEntered = true;
      }
      return isTrapEntered;
   }
   
/**
 * Find trapezohedron method.
 *
 * @param labelIn - name of trapezohedron to find
 * @return corresponding trapezohedron
 */
 
   public Trapezohedron findTrapezohedron(String labelIn) {
      Trapezohedron trapOutput = null;
      for (int i = 0; i < trapListArray.size(); i++) {
         Trapezohedron trap = trapListArray.get(i);
         String label = trap.getLabel();
         if (label.equalsIgnoreCase(labelIn)) {
            trapOutput = trap;
         }
      }
      return trapOutput;
   }
   
/**
 * Delete trapezohedron method.
 *
 * @param labelIn - name of trap to delete
 * @return corresponding trapezohedron to delete
 */
   public Trapezohedron deleteTrapezohedron(String labelIn) {
      Trapezohedron trapOutput = findTrapezohedron(labelIn);
      trapListArray.remove(trapOutput);
      return trapOutput;
   }
   
/**
 * Edit trapezohedron method.
 *
 * @param labelIn - name of trap to edit
 * @param colorIn - color to change to
 * @param shortEdgeIn - short edge to change to
 * @return is trapezohedron found
 */
 
   public boolean editTrapezohedron(String labelIn, String colorIn,
      double shortEdgeIn) {
      boolean isFound = false;
      Trapezohedron editTrap = findTrapezohedron(labelIn);
      if (editTrap != null) {
         editTrap.setColor(colorIn);
         editTrap.setShortEdge(shortEdgeIn);
         isFound = true;
      }
      return isFound;
   }
}