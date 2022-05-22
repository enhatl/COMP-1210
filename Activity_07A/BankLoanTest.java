import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for BankLoan.java.
 *
 * Activity 07A
 * @author Emily Hollingshead - Comp 1210 - 005
 * @version 03.15.22
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      BankLoan loan1 = new BankLoan("Jane", .10); 
      loan1.borrowFromBank(1000.00); 
      loan1.chargeInterest(); 
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001); 
   }
}
