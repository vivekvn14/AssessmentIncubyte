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
	
	@Test
	public void testNegativeNumber()
	{
		try {
			App.add("-1,2");
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}
		try {
			App.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
	}
	@Test
	public void testNewLine()
	{
		assertEquals(6, App.add("1\n2,3"));
	}
   
}
