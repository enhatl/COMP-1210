import javax.swing.JOptionPane;
/**
 * DivisionDriver class. Main method/driver method.
 *
 * Activity 11
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 04.19.22
 */
 
public class DivisionDriver {

   /**
    * Main method. Driver for Division class.
    *
    * @param args - not used
    */
    
   public static void main(String[] args) {
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
   
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         String result = "Integer division: \n" 
            + Division.intDivide(num, denom) + "\n\nFloating pint division: \n"
            + Division.decimalDivide(num, denom);
            
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.", "Error",
            JOptionPane.ERROR_MESSAGE); 
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error", 
            JOptionPane.ERROR_MESSAGE);
      }
   }
}