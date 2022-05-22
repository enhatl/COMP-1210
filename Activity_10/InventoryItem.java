/**
 * InventoryItem class. Creates the parent class.
 *
 * Activity 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.05.22
 */
 
public class InventoryItem {
 
//FIELDS
   protected String name;
   protected double price;
   private static double taxRate = 0;
 
//CONSTRUCTOR
 
/**
 * Constructor for InventoryItem.
 *
 * @param nameIn - name input
 * @param priceIn - price input
 */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
//METHODS
 
/**
 * Get name method.
 *
 * @return name
 */
  
   public String getName() {
      return name;
   }
/**
 * Calculate cost method.
 *
 * @return cost
 */  

   public double calculateCost() {
      return price * (1 + taxRate);
   } 
/**
 * Set tax rate method.
 *
 * @param taxRateIn - tax rate input
 */
 
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
/**
 * To string method.
 *
 * @return string 
 */ 

   public String toString() {
      return name + ": $" + calculateCost();
   }   
}