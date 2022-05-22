import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
 /**
 * Program that takes a basketball ticket and returns
 * the relevant information with it.
 * 
 *
 * Project 03
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 02.04.22
 */
public class BasketballTicket {

/**
 * Prompts for input and outputs appropiate result(s).
 * 
 *
 * @param args Command line arguments - not used.
 */

   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String ticket = " ";
   
      System.out.print("Enter ticket code: ");
      ticket = userInput.nextLine();
      
      //trim ticket
      ticket = ticket.trim();
      
      //check length of ticket
      int ticketLength = 0;
      ticketLength = ticket.length();
      
      if (ticketLength < 28) {
         System.out.println("\n*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 28 characters.");
      }
      else {
         String priceString = ticket.substring(0, 6);
         String discountString = ticket.substring(6, 8);
         String time = ticket.substring(8, 12);
         String date = ticket.substring(12, 20);
         String section = ticket.substring(20, 23);
         String row = ticket.substring(23, 25);
         String seat = ticket.substring(25, 27);
         String description = ticket.substring(27, ticketLength);
         
         //convert money related values values
         double price = Double.parseDouble(priceString);
         price = price * 0.01;
         
         double discount = Double.parseDouble(discountString);
         discount = discount * 0.01;
         
         double cost = price - (price * discount);
         
         DecimalFormat dfMoney = new DecimalFormat("$#,##0.00");
         DecimalFormat dfPer = new DecimalFormat("0%");
         
         //date and time changes
         String month = date.substring(0, 2);
         String day = date.substring(2, 4);
         String year = date.substring(4, 8);
         String dateFormatted = month + "/" + day + "/" + year;
         
         String hour = time.substring(0, 2);
         String minute = time.substring(2, 4);
         String timeFormatted = hour + ":" + minute;
         
         //prize # randomizer
         Random generator = new Random();
         int prizeNumber;
         
         prizeNumber = generator.nextInt(999999) + 1;
         
         DecimalFormat dfPN = new DecimalFormat("000000");
         
         
         
         //output
         System.out.println("\nTicket: " + description);
         System.out.println("Date: " + dateFormatted + "   Time: " 
            + timeFormatted);
         System.out.println("Section: " + section + "   Row: " + row
            + "   Seat: " + seat);
         System.out.println("Price: " + dfMoney.format(price) + "   Discount: " 
            + dfPer.format(discount) + "   Cost: " + dfMoney.format(cost));
         System.out.println("Prize Number: " + dfPN.format(prizeNumber));
      }
   
   }
}