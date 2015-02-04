import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
    /* Do not change this to be private. For silly testing reasons it is public. */
    public Calculator tester;

    /**
     * setUp() performs setup work for your Calculator.  In short, we 
     * initialize the appropriate Calculator for you to work with.
     * By default, we have set up the Staff Calculator for you to test your 
     * tests.  To use your unit tests for your own implementation, comment 
     * out the StaffCalculator() line and uncomment the Calculator() line.
     **/
    @Before
    public void setUp() {
        tester = new Calculator(); // Comment me out to test your Calculator
        
        // tester = new Calculator();   // Un-comment me to test your Calculator
    }
    
    @Test
    public void testAdd1(){
    	assertEquals(5, tester.add(3,2));
    	assertEquals(0, tester.add(5,-5));
    	assertEquals(-5, tester.add(-3,-2));
    	assertEquals(2, tester.add(0,2));
    }

    // TASK 1: WRITE JUNIT TESTS
    // YOUR CODE HERE

    /* Run the unit tests in this file. */
    public static void main(String... args) {
        jh61b.junit.textui.runClasses(CalculatorTest2.class);
    }       
}