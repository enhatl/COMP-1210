import java.util.Comparator;
/**
 * NameComparator class. Compares names for BallPlayer objects.
 *
 * Project 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.13.22
 */
 
public class NameComparator implements Comparator<BallPlayer> {

/**
   * Compare method.
   *
   * @param p1 - player 1
   * @param p2 - player 2
   * @return -x, 0, x if p1 is less, equal, or greater than p2
   */
   
   public int compare(BallPlayer p1, BallPlayer p2) {
      //seperation of first and last names
      String p1Name = p1.getName();
      String p2Name = p2.getName();
      String[] p1FirstLast = p1Name.split(" ");
      String[] p2FirstLast = p2Name.split(" ");
      
      String p1FirstName = p1FirstLast[0].toLowerCase();
      String p1LastName = p1FirstLast[1].toLowerCase();
      String p2FirstName = p2FirstLast[0].toLowerCase();
      String p2LastName = p2FirstLast[1].toLowerCase();
      
      int value = p1LastName.compareTo(p2LastName);
      
      if (value == 0) { //first names equal
         value = p1FirstName.compareTo(p2FirstName);
      }
      
      return value;    
   } 

   
}