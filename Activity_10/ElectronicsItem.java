/**
 * ElectronicsItem class. Inherits from InventoryItem.
 *
 * Activity 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.05.22
 */
 
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   
/**
 * Shipping cost static value.
 */
   public static final double SHIPPING_COST = 1.5;
   
/**
 * Constructor for ElectronicsItem.
 *
 * @param nameIn - name input
 * @param priceIn - price input
 * @param weightIn - weight input
 */
 
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
/**
 * Calculate cost method (overrided).
 *
 * @return cost
 */
 
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}