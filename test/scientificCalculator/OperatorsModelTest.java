/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificCalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mike
 */
public class OperatorsModelTest {
    
    public OperatorsModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addoperation method, of class OperatorsModel.
     */
    @Test
    public void testAddoperation() {
        System.out.println("addoperation");
        float number1 = 5;
        float number2 = 5;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 10;
        float result = instance.addoperation(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of divoperation method, of class OperatorsModel.
     */
    @Test
    public void testDivoperation() {
        System.out.println("divoperation");
        float number1 = 6;
        float number2 = 3;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 2;
        float result = instance.divoperation(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of expoperation method, of class OperatorsModel.
     */
    @Test
    public void testExpoperation() {
        System.out.println("expoperation");
        float number1 = 2;
        float number2 = 2;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 4;
        float result = instance.expoperation(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multoperation method, of class OperatorsModel.
     */
    @Test
    public void testMultoperation() {
        System.out.println("multoperation");
        float number1 = 2;
        float number2 = 3;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 6;
        float result = instance.multoperation(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of suboperation method, of class OperatorsModel.
     */
    @Test
    public void testSuboperation() {
        System.out.println("suboperation");
        float number1 = 5;
        float number2 = 4;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 1;
        float result = instance.suboperation(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of lnoperation method, of class OperatorsModel.
     */
    @Test
    public void testLnoperation() {
        System.out.println("lnoperation");
        float number1 = 1;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 0;
        float result = instance.lnoperation(number1);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of rootoperation method, of class OperatorsModel.
     */
    @Test
    public void testRootoperation() {
        System.out.println("rootoperation");
        float number1 = 4;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 2;
        float result = instance.rootoperation(number1);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of logoperation method, of class OperatorsModel.
     */
    @Test
    public void testLogoperation() {
        System.out.println("logoperation");
        float number1 = 1;
        OperatorsModel instance = new OperatorsModel();
        float expResult = 0;
        float result = instance.logoperation(number1);
        assertEquals(expResult, result, 0.0);
    }
    
}
