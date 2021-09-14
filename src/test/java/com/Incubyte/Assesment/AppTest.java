package com.Incubyte.Assesment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test
	public void testEmptyString() {
		assertEquals(0, App.add(""));
	}
	@Test
	public void testSingleNumberString() {
		assertEquals(3, App.add("3"));
	}
	@Test
	public void testTwoNumberString() {
		assertEquals(8, App.add("3,5"));
	}
	@Test
    public void testOtherDelimeter(){
    	assertEquals(3, App.add("//;\n1;2"));
    }
	
   
}
