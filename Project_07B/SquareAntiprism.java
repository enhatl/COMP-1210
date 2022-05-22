import java.text.DecimalFormat;
/**
 * Square antiprism class, creates a SquareAntiprism object.
 *
 * Project 07A
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 03.18.22
 */
public class SquareAntiprism {

//fields

   private static int count = 0;
   private String label = "";
   private double edge = 0;

//constructor

/**
 * Constructor for SquareAntiprism objects.
 *
 * @param labelIn - label input
 * @param edgeIn - edge input
 */
   public SquareAntiprism(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }

//methods

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
    * Get edge method.
    *
    * @return edge
    */
    
   public double getEdge() {
      return edge;
   }
    
    /**
     * Set edge method.
     *
     * @param edgeIn - edge input
     * @return is there an input
     */
     
   public boolean setEdge(double edgeIn) {
      boolean isEdgeSet = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isEdgeSet = true;
      }
      return isEdgeSet;
   }
   
   /**
    * Height method.
    *
    * @return height
    */
    
   public double height() {
      double output = 0;
      output = 1 - (Math.pow(((1 / Math.cos((Math.PI) / 16))), 2) / 4);
      output = Math.sqrt(output) * edge;
      return output;
   }
   
   /**
    * Surface area method.
    *
    * @return surface area
    */
    
   public double surfaceArea() {
      double output = 0;
      output = Math.sqrt(3) + (Math.cos(Math.PI / 8) / Math.sin(Math.PI / 8));
      output = 4 * output * Math.pow(edge, 2);
      return output;
   }
    
   /**
    * Volume method.
    *
    * @return volume
    */
   public double volume() {
      double output = 0;
      output = Math.sqrt(4 * Math.pow(Math.cos(Math.PI / 16), 2) - 1);
      output = 8 * output * Math.sin(3 * Math.PI / 16) * Math.pow(edge, 3);
      output = output / (12 * Math.pow(Math.sin(Math.PI / 8), 2));
      return output;
   }
    
   /**
    * To String method.
    *
    * @return summary of the created objects
    */
    
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "SquareAntiprism \"" + label + "\" with edge of "
         + df.format(edge) + " units has:\n\t"
         + "height = " + df.format(height()) + " units\n\t"
         + "surface area = " + df.format(surfaceArea()) + " square units\n\t"
         + "volume = " + df.format(volume()) + " cubic units";
      return output;
   }
    
   /**
    * Get count method.
    *
    * @return count
    */
    
   public static int getCount() {
      return count;
   }
    
   /**
    * Reset count method.
    */
    
   public static void resetCount() {
      count = 0;
   }
    
   /**
    * Equals method.
    *
    * @param obj - object to compare
    * @return SquareAntiprism if such exists
    */
    
   public boolean equals(Object obj) {
      if (!(obj instanceof SquareAntiprism)) {
         return false;
      }
      else {
         SquareAntiprism d = (SquareAntiprism) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && (Math.abs(edge - d.getEdge()) < .000001));
      }
   }
    
   /**
    * Hash code method. Required for checkstyle.
    *
    * @return 0
    */
    
   public int hashCode() {
      return 0;
   }
   
   /**
    * Compare to method.
    *
    * @param obj - input of type SquareAntiprism
    * @return int corresponding to the test
    */
    
   public int compareTo(SquareAntiprism obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; //consider equal
      }
      else if (this.volume() < obj.volume()) {
         return -1; //obj volume greater
      }
      else {
         return 1; //implies obj volume is less than
      }
   }
}