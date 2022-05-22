/**
 * OnlineTextItem class. Inherits from InventoryItem.
 *
 * Activity 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.05.22
 */
 
public abstract class OnlineTextItem extends InventoryItem {
   /**
    * Constructor for OnlineTextItem.
    *
    * @param nameIn - name input
    * @param priceIn - price input
    */
 
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
    * Calculate cost method (overrided).
    *
    * @return price
    */
    
   public double calculateCost() {
      return price;
   }
}