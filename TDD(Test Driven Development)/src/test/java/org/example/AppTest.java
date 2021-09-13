package org.example;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static Calculator cal = null;
    static int count=1;
    /**
     * Rigorous Test :-)
     */

    //Before loading the classes -> declare with static
    //Execute before all test methods
    @BeforeClass
    public static void init() {
        cal = new Calculator();
    }

    /*
    @AfterClass
    public static void close(){
        cal = null;
    }
     */


    //After loading the classes
    //Execute before each test methods
    @Before
    public void init2() {
        cal = new Calculator();
        System.out.println("Before is executes : " + count);
        count++;
    }

    @After
    public void close() {
        cal = null;
    }


    @Test
    //@Ignore
    public void divisionWithValidInputs() {
        // Calculator cal =new Calculator();
        // 1. Fail the test case
        double result = cal.division(20, 5);
        assertEquals(4, result, 0.00);

        assertTrue(true);
        /*

        assertFalse();
        assertEquals();
        assertNull();
        assertArrayEquals();
        assertNotEquals();
        assertNotNull();

         */

        // 2. Pass test case by rewriting the code
    }

    // 3. Refactoring the code
    @Test(expected = ArithmeticException.class)
    public void divisionWithZero() {
        // Calculator cal =new Calculator();
        cal.division(20, 0);
    }
}
