import java.io.FileNotFoundException;
/**
 * BallPlayersPart2 class. Main method/driver program.
 *
 * Project 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.13.22
 */
 
public class BallPlayersPart2 {
  
  /**
   * Main method.
   *
   * @param args - not used
   * @throws FileNotFoundException - if file not found
   */
      
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.print("File name expected as command line argument.\n");
         System.out.print("Program ending.");
      }
      else {
         String fileName = args[0];
         BallTeam ballTeam = new BallTeam();
         
         ballTeam.readBallPlayerFile(fileName);
         
         System.out.print(ballTeam.generateReport());  //CORRECT
         System.out.print(ballTeam.generateReportByNumber()); //CORRECT
         System.out.print(ballTeam.generateReportByName()); //CORRECT
         System.out.print(ballTeam.generateReportByEarnings()); //CORRECT
         System.out.print(ballTeam.generateExcludedRecordsReport());
      }
    
   }
  
}