/**
 * Customer class that creates a Customer object.
 *
 * Activity 07B
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 03.22.22
 */
 
public class Customer implements Comparable<Customer> {

//instance variables
   private String name = "";
   private String location = "";
   private double balance = 0;

//constructor

/**
 * Constructor for Customer objects.
 *
 * @param nameIn - name input
 */
   public Customer(String nameIn) { 
      name = nameIn; // sets name to parameter input 
      location = ""; // sets location to empty string 
      balance = 0; // sets balance to 0
   }
//methods

/**
 * Set location method.
 *
 * @param locationIn - location input
 */
 
   public void setLocation(String locationIn) {
      location = locationIn;
   }
 
/**
 * Change balance method.
 *
 * @param amount - amount added to balance
 */
  
   public void changeBalance(double amount) {
      balance = balance  + amount;
   }
  
/**
 * Get location method.
 *
 * @return location
 */
 
   public String getLocation() {
      return location;
   }
/**
 * Get balance method.
 *
 * @return balance
 */
 
   public double getBalance() {
      return balance;
   }
   
/**
 * Set location method. 2nd version.
 *
 * @param city - city input
 * @param state - state input
 */
 
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
/**
 * To string method.
 *
 * @return summary of the object
 */
 
   public String toString() {
      return name + "\n" + location + "\n" + "$" + balance;
   }
   
/**
 * Compare to method.
 *
 * @param obj - object to compare
 * @return an int based on the comparison
 */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; // consider them equal
      }
      else if (this.balance < obj.getBalance()) {
         return -1; // should return negative number
      }
      else {
         return 1; // should return positive number
      }
   }
 
}
 
