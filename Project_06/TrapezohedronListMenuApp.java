import java.util.ArrayList;
//import java.text.DecimalFormat;
//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Takes a list of trapezohedron objects and performs actions on them.
 * 
 * Project 06
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.25.22
 */
public class TrapezohedronListMenuApp {
 /**
  * Sets up main function for the program.
  *
  * @param args - Standard commandline arguments
  * @throws FileNotFoundException if file is not found
  */
   public static void main(String[] args) throws FileNotFoundException { 
      Scanner userInput = new Scanner(System.in);
      String listName = "*** no list name assigned ***";
      ArrayList<Trapezohedron> trapListArray = new ArrayList<Trapezohedron>();
      TrapezohedronList trapList = new TrapezohedronList(listName, 
         trapListArray);
      System.out.print("Trapezohedron List System Menu"
         + "\nR - Read File and Create Trapezohedron List"
         + "\nP - Print Trapezohedron List"
         + "\nS - Print Summary"
         + "\nA - Add Trapezohedron"
         + "\nD - Delete Trapezohedron"
         + "\nF - Find Trapezohedron"
         + "\nE - Edit Trapezohedron"
         + "\nQ - Quit");
         
      char codeChar = 'Q';
      do {
         System.out.print("\nEnter Code [R, P, S, A, D, F, E, or Q]: ");
         codeChar = userInput.nextLine().toUpperCase().charAt(0);
         switch (codeChar) {
            case 'R': //works
               System.out.print("\tFile name: ");
               String fileName = userInput.nextLine();
               trapList = trapList.readFile(fileName);
               System.out.print("\tFile read in and Trapezohedron List" 
                  + " created\n");
               break;
            case 'P': //works
               System.out.print("\n" + trapList.toString());
               break;
            case 'S': //works
               System.out.print("\n" + trapList.summaryInfo() + "\n");
               break;
            case 'A': //works
               System.out.print("\tLabel: ");
               String labelIn = userInput.nextLine().trim();
               System.out.print("\tColor: ");
               String colorIn = userInput.nextLine().trim();
               System.out.print("\tShort Edge: ");
               double shortEdgeIn = Double.parseDouble(userInput.nextLine());
               
               boolean added = trapList.addTrapezohedron(labelIn, colorIn,
                  shortEdgeIn);
               if (added) {
                  System.out.print("\t*** Trapezohedron added ***\n");
               }
               break;
            case 'D':
               System.out.print("\tLabel: ");
               String labelDelete = userInput.nextLine();
               Trapezohedron trapToDelete = trapList.findTrapezohedron(
                  labelDelete);
               if (trapToDelete != null) {
                  trapList.deleteTrapezohedron(labelDelete);
                  String deletedName = trapToDelete.getLabel();
                  System.out.print("\t\"" + deletedName + "\" deleted\n");
               }
               else {
                  System.out.print("\t\"" + labelDelete + "\" not found\n");
               }                  
               break;
            case 'F':
               System.out.print("\tLabel: ");
               String labelFind = userInput.nextLine();
               Trapezohedron found = trapList.findTrapezohedron(labelFind);
               if (found != null) {
                  System.out.print(found.toString() + "\n");
               }
               else {
                  System.out.print("\t\"" + labelFind + "\" not found\n");
               }
               break;
            case 'E':
               System.out.print("\tLabel: ");
               String labelEdit = userInput.nextLine();
               System.out.print("\tColor: ");
               String colorNew = userInput.nextLine();
               System.out.print("\tShort Edge: ");
               double shortEdgeNew = Double.parseDouble(userInput.nextLine());
               
               boolean trapEdited = trapList.editTrapezohedron(labelEdit, 
                  colorNew, shortEdgeNew);
               if (trapEdited) {
                  System.out.print("\t\"" + labelEdit + "\" successfully"
                     + " edited\n");
               }
               else {
                  System.out.print("\t\"" + labelEdit + "\" not found\n");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***"); 
         } 
      } while (codeChar != 'Q');
   }
}