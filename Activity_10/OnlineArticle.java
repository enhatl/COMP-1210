/**
 * OnlineArticle class. Inherits from OnlineTextItem.
 *
 * Activity 09
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.05.22
 */
 
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
    * Constructor for OnlineArticle.
    *
    * @param nameIn - name input
    * @param priceIn - price input
    */
    
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
    * Set word count method.
    *
    * @param wordCountIn - word count input
    */
    
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}