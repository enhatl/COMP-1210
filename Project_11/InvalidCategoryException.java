/**
 * Invalid Category Exception class.
 *
 * Project 11
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.22.22
 */
 
public class InvalidCategoryException extends Exception {
 /**
  * Constructor for the class.
  *
  * @param category - category to check
  */
  
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
  
}