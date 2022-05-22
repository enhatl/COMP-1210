/**
 * Imported file for the class BankLoan.
 *
 * Activity 07A
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 03.15.22
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;

 /**
  * Sets up main function for the program.
  *
  * @param customerNameIn - name of customer
  * @param interestRateIn - interest rate of the loan
  */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
/**
 * Borrow from bank method.
 *
 * @param amount - amount borrowed
 * @return if loan was made
 */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/**
 * Pay bank method.
 *
 * @param amountPaid - total paid to bank
 * @return the new balance to be paid
 */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
 /**
  * Get balance method.
  *
  * @return balance
  */  
   public double getBalance() {
      return balance;
   }
/**
 * Set interest rate method.
 *
 * @param interestRateIn - interest rate of loan
 * @return is the interest rate set
 */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
 * Get interest rate method.
 *
 * @return interest rate
 */

   public double getInterestRate() {
      return interestRate;
   }
/**
 * Charge interest method.
 */   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
/**
 * To string method.
 *
 * @return string output
 */   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
/**
 * Is amount valid method.
 *
 * @param amount - amount to be checked
 * @return is amount valid
 */
   public static boolean isAmountValid(double amount) {
      return amount >= 0; 
   }
/**
 * Is in debt method.
 *
 * @param loan - the loan amount, a BankLoan object
 * @return is the person in debt
 */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
/**
 * Get loans created method.
 *
 * @return the loans created
 */
   public static int getLoansCreated() {
      return loansCreated;
   }
/**
 * Reset loans created method.
 */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
}
