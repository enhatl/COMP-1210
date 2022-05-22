/**
 * InventoryListApp class. Driver program.
 *
 * Activity 10
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.12.22
 */
 
public class InventoryListApp {
  
  /**
   * Main method for driver program.
   *
   * @param args - not used
   */
   
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.print(myItems.toString() + "\n");
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
  
}