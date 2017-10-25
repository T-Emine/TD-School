/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.Addition;
import javaapplication1.Division;
import javaapplication1.Multiplication;
import javaapplication1.Soustraction;
import javaapplication1.TestDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 16333
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testMultiplier(){
        Multiplication multi = new Multiplication();
        assertEquals("Sa doit donner 0",0, multi.multiplier(0, 3));
        assertEquals("Sa doit donner 1",1, multi.multiplier(1, 1));
        assertEquals("Sa doit donner 10",10, multi.multiplier(2, 5));
    }
    
    @Test
    public void testAddition(){
        Addition add = new Addition();
        assertEquals("Sa doit donner 0",0, add.additioner(0, 0));
        assertEquals("Sa doit donner -1",-1, add.additioner(1, -2));
        assertEquals("Sa doit donner 7",7, add.additioner(2, 5));
    }
    
    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivision(){
        Division add = new Division();
        assertEquals("Sa doit donner 0",0, add.diviser(0, 0));
        assertEquals("Sa doit donner -1/2",-1/2, add.diviser(1, -2));
        assertEquals("Sa doit donner 1",1, add.diviser(2, 2));
    }
    
    @Test
    public void testSoustraction(){
        Soustraction add = new Soustraction();
        assertEquals("Sa doit donner 0",0, add.soustraire(0, 0));
        assertEquals("Sa doit donner 3",3, add.soustraire(1, -2));
        assertEquals("Sa doit donner -3",-3, add.soustraire(2, 5));
    }
    
    @Test
    public void testInvariant(){
        TestDate date = new TestDate();
        assertEquals("Sa doit être 2010",2010, date.getYear());
    }
}
