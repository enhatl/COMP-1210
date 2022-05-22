import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Program runs the TrapezohedronList methods after taking user input.
 * 
 * Project 05
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.18.22
 */
 
public class TrapezohedronListApp {
  /**
    * User inputs a file name to be read.
	 * Prints the appropriate results of the trapezohedrons in the file. 
	 *
    * @param args - Standard commandline arguments
    * @throws FileNotFoundException if file is not found
    */
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Trapezohedron> trapListArray = new ArrayList<Trapezohedron>();
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = userInput.nextLine();
      
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
      System.out.println("\n" + trapList);
      System.out.println("\n" + trapList.summaryInfo());
   }
}