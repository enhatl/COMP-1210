/**
 * OnlineBook class. Inherits from OnlineTextItem.
 *
 * Activity 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.05.22
 */
 
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
    * Constructor for OnlineBook.
    *
    * @param nameIn - name input
    * @param priceIn - price input
    */
    
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * To string method (overrided).
    *
    * @return string
    */
    
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /**
    * Set author method.
    *
    * @param authorIn - author input
    */
    
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
}