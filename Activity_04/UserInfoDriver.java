/**
 * Program that takes user info and calls on another program
 * to format the information in a certain way. Also is added to an object.
 * 
 * Activity 04
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.08.22
 */
 
public class UserInfoDriver {
 /**
  * Inputs information for two objects named user1 and user2.
  * 
  *
  * @param args Command line arguments - not used.
  */

   public static void main(String[] args) {
   
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}