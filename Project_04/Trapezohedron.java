import java.text.DecimalFormat;
/**
 * Program that defines objects for the Trapezohedron App.
 * 
 * Project 04
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.11.22
 */
public class Trapezohedron {

   // instance variables
   
   private String label = "";
   private String color = "";
   private double shortEdge = 00;
   
   // constructor
   
   /**
    * Sets up the basic information for the program.
    *
    * @param labelIn - label of the object
    * @param colorIn - color of the trapezohedron
    * @param shortEdgeIn - length of the short edge
    */
   
   public Trapezohedron(String labelIn, String colorIn, double shortEdgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setShortEdge(shortEdgeIn);
   }
   
   // methods
   
   /** 
    * Get label method.
    * 
    * @return label
    */
    
   public String getLabel() {
      return label;
   }
   
   /**
    * Set label method.
    *
    * @param labelIn - label input
    * @return is there an input
    */
   public boolean setLabel(String labelIn) {
      boolean isLabelSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isLabelSet = true;
      }
      return isLabelSet;
   }
   
   /**
    * Get color method.
    *
    * @return string for color field
    */
    
   public String getColor() {
      return color;
   }
    
    /**
     * Set color method.
     *
     * @param colorIn - color input
     * @return is there an input
     */
     
   public boolean setColor(String colorIn) {
      boolean isColorSet = false;
      if (colorIn != null) {
         color = colorIn.trim();
         isColorSet = true;
      }
      return isColorSet;
   }
   
   /**
    * Get short edge method.
    *
    * @return short edge
    */
    
   public double getShortEdge() {
      return shortEdge;
   }
    
    /**
     * Set short edge method.
     *
     * @param shortEdgeIn - short edge input
     * @return is there an input
     */
     
   public boolean setShortEdge(double shortEdgeIn) {
      boolean isShortEdgeSet = false;
      if (shortEdgeIn > 0) {
         shortEdge = shortEdgeIn;
         isShortEdgeSet = true;
      }
      return isShortEdgeSet;
   }
   
   /**
    * Edge length antiprism method.
    *
    * @return length for short edge
    */
    
   public double edgeLengthAntiprism() {
      double output = shortEdge / ((Math.sqrt(5) - 1) / 2);
      return output;
   }
   
   /**
    * Long edge method.
    *
    * @return long edge length
    */
    
   public double longEdge() {
      double output = ((Math.sqrt(5) + 1) / 2) * edgeLengthAntiprism();
      return output;
   }
    
    /**
     * Surface area method.
     *
     * @return calculated surface area
     */
     
   public double surfaceArea() {
      double output = Math.sqrt((25 / 2.0) * (5 + Math.sqrt(5)))
         * Math.pow(edgeLengthAntiprism(), 2);
      return output;
   }
   
   /**
    * Volume method.
    *
    * @return calculated volume
    */
    
   public double volume() {
      double output = (5.0 / 12) * (3 + Math.sqrt(5)) 
         * Math.pow(edgeLengthAntiprism(), 3);
      return output;
   }
   
   /**
    * To string method.
    *
    * @return string with all necessary information
    */
    
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Trapezohedron \"" + label + "\" is \"" + color
         + "\" with 20 edges and 12 vertices.\n";
      output += "\tedge length antiprism = ";
      output += df.format(edgeLengthAntiprism()); 
      output += " units\n"; //same line as above 
      output += "\tshort edge = " + df.format(shortEdge) + " units\n";
      output += "\tlong edge = " + df.format(longEdge()) + " units\n";
      output += "\tsurface area = " + df.format(surfaceArea());
      output +=  " square units\n"; //same line as above
      output += "\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}