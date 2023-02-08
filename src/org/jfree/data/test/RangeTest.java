package org.jfree.data.test;

import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;


public class RangeTest {
    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    
    // EXAMPLE
    @Before
    public void setUp() throws Exception { exampleRange = new Range(-1, 1);
    }


    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -1 and 1 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }

    @After
    public void tearDown() throws Exception {
    }
    
    //getLength
//    @Before
//    public void setUpLength() throws Exception { exampleRange = new Range(-1, 1);
//    }


    //length
    @Test
    public void lengthShouldBeTwo() {
        assertEquals("The length of -1 and 1 should be 2",
        2, exampleRange.getLength(), .000000001d);
    }
    
    //lowerBound
    @Test
    public void lowerBoundShouldBeNegOne() {
        assertEquals("The lower bound of -1 and 1 should be -1",
        -1, exampleRange.getLowerBound(), .000000001d);
    }
    
    //upperBound
    @Test
    public void upperBoundShouldBeOne() {
        assertEquals("The upper bound of -1 and 1 should be 1",
        1, exampleRange.getUpperBound(), .000000001d);
    }
    
    //contains
    @Test
    public void containsOneShouldBeTrue() {
    	boolean expected = true;
    	boolean actual = exampleRange.contains(1);
    	assertEquals("The value 1 should exist in the range of -1 to 1", expected, actual);
    }
    
    @Test
    public void containsNegOneShouldBeTrue() {
    	boolean expected = true;
    	boolean actual = exampleRange.contains(-1);
    	assertEquals("The value -1 should exist in the range of -1 to 1", expected, actual);
    }
    
    @Test
    public void containsZeroShouldBeTrue() {
    	boolean expected = true;
    	boolean actual = exampleRange.contains(0);
    	assertEquals("The value 0 should exist in the range of -1 to 1", expected, actual);
    }
    
    @Test
    public void containsTwoShouldBeFalse() {
    	boolean expected = false;
    	boolean actual = exampleRange.contains(2);
    	assertEquals("The value 2 should not exist in the range of -1 to 1", expected, actual);
    }
    
    @Test
    public void containsNegTwoShouldBeFalse() {
    	boolean expected = false;
    	boolean actual = exampleRange.contains(-2);
    	assertEquals("The value -2 should not exist in the range of -1 to 1", expected, actual);
    }
    
    //intersect
    @Test
    public void intersectsShouldBeTrue() {
    	boolean expected = true;
    	boolean actual = exampleRange.intersects(-1, 2);
    	assertEquals("The given range should overlap with the example range",
        expected, actual);
    }
    
    @Test
    public void intersectsShouldBeFalse() {
    	boolean expected = false;
    	boolean actual = exampleRange.intersects(13, 200);
    	assertEquals("The given range should not overlap with the example range",
        expected, actual);
    }
    
//    @After
//    public void tearDownLength() throws Exception {
//    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}


