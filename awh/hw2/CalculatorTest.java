import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
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
        //tester = new StaffCalculator(); // Comment me out to test your Calculator
        
        tester = new Calculator();   // Un-comment me to test your Calculator
    }
    
    @Test
    public void testAdd1(){
    	assertEquals(5, tester.add(3,2));
    }
	@Test
    public void testAdd2(){
        assertEquals(0, tester.add(5,-5));
    }
    
    @Test
    public void testAdd3(){
        assertEquals(-5, tester.add(-3,-2));
    }
    
    @Test
    public void testAdd4(){
        assertEquals(2, tester.add(0,2));
    }
    
    @Test
    public void testMultiply1(){
    	assertEquals(7, tester.multiply(7,1));
    }
    
    @Test
    public void testMultiply2(){
    	assertEquals(-7, tester.multiply(7,-1));
    }
    
    @Test
    public void testMultiply3(){
    	assertEquals(-7, tester.multiply(-7,1));
    }
    
    @Test
    public void testMultiply4(){
    	assertEquals(15, tester.multiply(3,5));
    }
    
    @Test
    public void testMultiply5(){
    	assertEquals(-39, tester.multiply(13,-3));
    }
    
    @Test
    public void testMultiply6(){
    	assertEquals(0, tester.multiply(7,0));
    }
    // TASK 1: WRITE JUNIT TESTS
    // YOUR CODE HERE

    /* Run the unit tests in this file. */
    public static void main(String... args) {
        jh61b.junit.textui.runClasses(CalculatorTest.class);
    }       
}