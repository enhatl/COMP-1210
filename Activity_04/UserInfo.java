/**
 * Program that takes user info and creates an object
 * that contains all the information for the user.
 * 
 * Activity 04
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.08.22
 */
public class UserInfo {

   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constuctor
   
   /**
    * Sets up the basic information for the program.
    *
    * @param firstNameIn - first name of user
    * @param lastNameIn - last name of user
    */
   
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   
   /**
    * Takes the input information and concatnates to a readable
    * format.
    *
    * @return output string
    */

   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      
      return output;
   }
   
   /**
    * Allows user to set a location.
    *
    * @param locationIn - location of user
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * Allows user to set an age.
    *
    * @param ageIn - age of user
    * @return is there an age put in
    */
   
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * Returns the age from above.
    *
    * @return age of user
    */
   public int getAge() {
      return age;
   }
   
   /**
    * Returns the location from above.
    *
    * @return location of user
    */
   public String getLocation() {
      return location;
   } 
   
   /**
    * Allows user to 'log off'.
    *
    */
    
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * Allows user to 'log on'.
    *
    */
    
   public void logOn() {
      status = ONLINE;
   }
}

