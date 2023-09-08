package demo_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenNumberTest {
	
	@Test
	public void testOddEvenNumber() {
		
		
		 //OddEvenNumber obj=new OddEvenNumber(); 
		 //assertEquals(25,obj.sum(10, 15));
		
		
		OddEvenNumber obj = new OddEvenNumber();
		assertTrue(obj.isEven(10));
	}
	
	@Test
	public void testOddEvenNumber1() {
	
		
		
		OddEvenNumber obj1 = new OddEvenNumber();
		assertTrue(obj1.isOdd(9));
	}

}
