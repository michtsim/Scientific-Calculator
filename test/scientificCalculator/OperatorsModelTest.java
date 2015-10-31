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
 * @author Konstantinos
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
        float number1 = 1.0F;
        float number2 = 2.0F;
        OperatorsModel instance = new OperatorsModel();
        instance.addoperation(number1, number2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divoperation method, of class OperatorsModel.
     */
    @Test
    public void testDivoperation() {
        System.out.println("divoperation");
        float number1 = 0.0F;
        float number2 = 0.0F;
        OperatorsModel instance = new OperatorsModel();
        instance.divoperation(number1, number2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expoperation method, of class OperatorsModel.
     */
    @Test
    public void testExpoperation() {
        System.out.println("expoperation");
        float number1 = 0.0F;
        float number2 = 0.0F;
        OperatorsModel instance = new OperatorsModel();
        instance.expoperation(number1, number2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multoperation method, of class OperatorsModel.
     */
    @Test
    public void testMultoperation() {
        System.out.println("multoperation");
        float number1 = 0.0F;
        float number2 = 0.0F;
        OperatorsModel instance = new OperatorsModel();
        instance.multoperation(number1, number2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suboperation method, of class OperatorsModel.
     */
    @Test
    public void testSuboperation() {
        System.out.println("suboperation");
        float number1 = 0.0F;
        float number2 = 0.0F;
        OperatorsModel instance = new OperatorsModel();
        instance.suboperation(number1, number2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalcSol method, of class OperatorsModel.
     */
    @Test
    public void testGetCalcSol() {
        System.out.println("getCalcSol");
        OperatorsModel instance = new OperatorsModel();
        float expResult = 0.0F;
        float result = instance.getCalcSol();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
