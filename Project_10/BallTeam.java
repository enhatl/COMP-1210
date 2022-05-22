import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
 * BallTeam class. Reads a data file and generates reports.
 *
 * Project 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.13.22
 */
 
public class BallTeam {

//FIELDS

   private String teamName;
   private BallPlayer[] roster;
   private int playerCount;
   private String[] excludedRecords;
   private int excludedCount;
   
   /**
    * Max players allowed.
    */
    
   public static final int MAX_PLAYERS = 24;
   
   /**
    * Max excluded records.
    */
   public static final int MAX_EXCLUDED = 30;

//CONSTRUCTOR

/**
 * BallTeam constructor. No paramaters, initializes fields. 
 */
 
   public BallTeam() {
      teamName = "No Team Name";
      roster = new BallPlayer[24];
      playerCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
   }

//METHODS

/**
 * Get team name method.
 *
 * @return team name
 */
 
   public String getTeamName() {
      return teamName;
   }
 
/**
 * Set team name method.
 *
 * @param teamNameIn - team name input
 */
 
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }
 
/**
 * Get roster method.
 *
 * @return roster
 */
 
   public BallPlayer[] getRoster() {
      return roster;
   }
 
/**
 * Set roster method.
 *
 * @param rosterIn - ballplayer array
 */
 
   public void setRoster(BallPlayer[] rosterIn) {
      roster = rosterIn;
   }
 
/**
 * Get player count method.
 *
 * @return player count
 */
 
   public int getPlayerCount() {
      return playerCount;
   }
 
/**
 * Set player count method.
 *
 * @param playerCountIn - player count to set
 */
 
   public void setPlayerCount(int playerCountIn) {
      playerCount = playerCountIn;
   }
 
/**
 * Get excluded records method.
 *
 * @return excluded records (string array)
 */
 
   public String[] getExcludedRecords() {
      return excludedRecords;
   } 
 
/**
 * Set excluded records method.
 *
 * @param excludedRecordsIn - excluded records string array
 */
 
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
/**
 * Get excluded count method.
 *
 * @return excluded count
 */
 
   public int getExcludedCount() {
      return excludedCount;
   }
   
/**
 * Set excluded count method.
 *
 * @param excludedCountIn - excluded count input
 */
 
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
 
/**
 * Read ball player file method.
 * 
 * @param fileNameIn - file to read
 * @throws FileNotFoundException - if file not found
 */
 
   public void readBallPlayerFile(String fileNameIn) 
      throws FileNotFoundException {
      
      Scanner scanFile = new Scanner(new File(fileNameIn));
      teamName = scanFile.nextLine(); 
      
      while (scanFile.hasNext()) {
         //read each line
         String line = scanFile.nextLine(); 
         Scanner scanLine = new Scanner(line).useDelimiter(",");
         
         //set values per line
         String category = scanLine.next(); 
            //player stats    
         String number = scanLine.next();
         String name = scanLine.next();
         String position = scanLine.next();
         double baseSalary = Double.parseDouble(scanLine.next());
         double bonusAdjFactor = Double.parseDouble(scanLine.next());
         double battingAvg = Double.parseDouble(scanLine.next());
         
         switch(category) {
            
            case "O": //outfielder
            
               double outfielderFieldingAvg = 
                  Double.parseDouble(scanLine.next());
                  
               Outfielder o = new Outfielder(number, name, position, 
                  baseSalary, bonusAdjFactor, battingAvg, 
                  outfielderFieldingAvg);
                  
               //add to appropriate array
               if (playerCount < MAX_PLAYERS) { //room in roster
                  roster[playerCount] = o;
                  playerCount++;
               }
               else if (playerCount >= MAX_PLAYERS && //roster full
                  excludedCount < MAX_EXCLUDED) { //room in excluded
                  
                  excludedRecords[excludedCount] = line;
                  excludedCount++;
               }
               
               break;
            
            case "I": //infielder
               
               double infielderFieldingAvg = 
                  Double.parseDouble(scanLine.next());
                  
               Infielder i = new Infielder(number, name, position, baseSalary,
                  bonusAdjFactor, battingAvg, infielderFieldingAvg);
                  
               //add to appropriate array
               if (playerCount < MAX_PLAYERS) { //room in roster
                  roster[playerCount] = i;
                  playerCount++;
               }
               else if (playerCount >= MAX_PLAYERS && //roster full
                  excludedCount < MAX_EXCLUDED) { //room in excluded
                  
                  excludedRecords[excludedCount] = line;
                  excludedCount++;
               }
               
               break;
            
            case "P": //pitcher
            
               int winsP = Integer.parseInt(scanLine.next());
               int lossesP = Integer.parseInt(scanLine.next());
               double eraP = Double.parseDouble(scanLine.next());
               
               Pitcher p = new Pitcher(number, name, position, baseSalary,
                  bonusAdjFactor, battingAvg, winsP, lossesP, eraP);
                  
               //add to appropriate array
               if (playerCount < MAX_PLAYERS) { //room in roster
                  roster[playerCount] = p;
                  playerCount++;
               }
               else if (playerCount >= MAX_PLAYERS && //roster full
                  excludedCount < MAX_EXCLUDED) { //room in excluded
                  
                  excludedRecords[excludedCount] = line;
                  excludedCount++;
               }
               
               break;
            
            case "R": //relief pitcher
               
               int winsRP = Integer.parseInt(scanLine.next());
               int lossesRP = Integer.parseInt(scanLine.next());
               double eraRP = Double.parseDouble(scanLine.next());
               int savesRP = Integer.parseInt(scanLine.next());
               
               ReliefPitcher rp = new ReliefPitcher(number, name, position,
                  baseSalary, bonusAdjFactor, battingAvg, winsRP, lossesRP, 
                  eraRP, savesRP);
                  
               //add to appropriate array
               if (playerCount < MAX_PLAYERS) { //room in roster
                  roster[playerCount] = rp;
                  playerCount++;
               }
               else if (playerCount >= MAX_PLAYERS && //roster full
                  excludedCount < MAX_EXCLUDED) { //room in excluded
                  
                  excludedRecords[excludedCount] = line;
                  excludedCount++;
               }
            
               break;
               
            default:
               if (excludedCount < MAX_EXCLUDED) {
                  excludedRecords[excludedCount] = "*** invalid category *** " 
                     + line; 
                  excludedCount++;
               }
         }   
      }       
   }
      
/**
 * Generate report method.
 *
 * @return team report
 */
 
   public String generateReport() {
      String report = "---------------------------------------\n";
      report += "Team Report for " + teamName;
      report += "\n---------------------------------------\n\n";
      
      for (int i = 0; i < playerCount; i++) {
         report +=  roster[i] + "\n\n";
      }
      
      return report;
   }
 
/**
 * Generate report by number method.
 *
 * @return report based on number
 */
 
   public String generateReportByNumber() { 
     //natural ordering
      BallPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp);
      
      String report = "---------------------------------------\n";
      report += "Team Report for " + teamName + " (by Number)";
      report += "\n---------------------------------------\n";
      
      for (int i = 0; i < playerCount; i++) {
         report += bp[i].getNumber() + " " + bp[i].getName() + " "; 
         report += bp[i].getPosition() + " " + bp[i].stats() +  "  \n";
         
      }
      report += "\n";
      return report;
   }
 
/**
 * Generate report by name method.
 *
 * @return report based by name
 */ 
 
   public String generateReportByName() { //name order
      BallPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new NameComparator());
   
      String report = "---------------------------------------\n";
      report += "Team Report for " + teamName + " (by Name)";
      report += "\n---------------------------------------\n";
      
      for (int i = 0; i < playerCount; i++) {
         report += bp[i].getNumber() + " " + bp[i].getName() + " "; 
         report += bp[i].getPosition() + " " + bp[i].stats() +  "  \n";
      }
      
      report += "\n";
      
      return report;
   }
 
/**
 * Generate report by earnings method.
 *
 * @return report based on earnings
 */
 
   public String generateReportByEarnings() { //total earnings order
      BallPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new EarningsComparator());
      
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String report = "---------------------------------------\n";
      report += "Team Report for " + teamName + " (by Earnings)";
      report += "\n---------------------------------------\n";
      
      for (int i = 0; i < playerCount; i++) {
         report += df.format(bp[i].totalEarnings()) + " " + bp[i].getNumber();
         report += " " + bp[i].getName() + " " + bp[i].getPosition() + " ";
         report += bp[i].stats() +  "\n";
      }
      
      report += "\n";
      return report;
   }
 
/**
 * Generate excluded records report.
 *
 * @return report of excluded records
 */ 
 
   public String generateExcludedRecordsReport() {
      String report = "---------------------------------------\n";
      report += "Excluded Records Report";
      report += "\n---------------------------------------\n";
      
      for (int i = 0; i < excludedCount; i++) {
         report += excludedRecords[i] + "\n";
      }
      report += "\n";
      
      return report;
   }
}