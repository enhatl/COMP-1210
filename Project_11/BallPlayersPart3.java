import java.io.FileNotFoundException;
/**
 * BallPlayersPart3 class. Main method/driver program.
 *
 * Project 11
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.22.22
 */
 
public class BallPlayersPart3 {
  
  /**
   * Main method.
   *
   * @param args - not used
   */
      
   public static void main(String[] args) {
   
      if (args.length == 0) {
         System.out.print("File name expected as command line argument.\n");
         System.out.print("Program ending.");
      }
      else {
         try {
            String fileName = args[0];
            BallTeam ballTeam = new BallTeam();
            
            ballTeam.readBallPlayerFile(fileName);
            
            System.out.print(ballTeam.generateReport());
            System.out.print(ballTeam.generateReportByNumber());
            System.out.print(ballTeam.generateReportByName());
            System.out.print(ballTeam.generateReportByEarnings()); 
            System.out.print(ballTeam.generateExcludedRecordsReport());
         }
           
         catch (FileNotFoundException e) {
            System.out.print("*** Attempted to read file: " + e);
         }
      }
   } 
}