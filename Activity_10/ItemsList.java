/**
 * ItemsList class. Holds array of InventoryItems.
 *
 * Activity 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.12.22
 */
 
public class ItemsList {
 
   //FIELDS
   private InventoryItem[] inventory;
   private int count;
 
   //CONSTRUCTOR
   
   /**
    * Constructor.
    */
    
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   //METHODS
   
   /**
    * AddItem method.
    *
    * @param itemIn - inventory item input
    */
    
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
    
    
   /**
    * CalculateTotal method.
    *
    * @param electronicsSurcharge - electronics surcharge
    * @return total
    */
    
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
    
   }
    
    
   /**
    * To string method.
    *
    * @return string
    */
    
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   } 
   
   
 
}