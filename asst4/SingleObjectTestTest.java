/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lohitha Atluri
 */
public class SingleObjectTestTest {
    
    public SingleObjectTestTest() {
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
     * Test of testSingletonInstance method, of class SingleObjectTest.
     */
    @Test
    public void testTestSingletonInstance() {
        System.out.println("testSingletonInstance");
        SingleObjectTest instance = new SingleObjectTest();
        instance.testSingletonInstance();
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
