package assignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class P011_AssertClass {
	@Test
	public void test1() {
		System.out.println("test 1 running");
	}	
	@Test
		public void test2() {
			System.out.println("test 2 running");
			int a[] = {1,2,3,4};//expected
			int b[] = {1,2,3,4,5};//actual
			
			assertArrayEquals(a, b);
			assertFalse(true);
	}
	@Test 
	public void test3() {
		System.out.println("test 3 running");
	
			
		}
		
		
	}


