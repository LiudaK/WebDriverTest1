package basics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class JunitBasic {
	@Before
	public void beforeMethod(){
		System.out.println("before");		
	}
			
	@Test
	public void testMethod1() {
		System.out.println("test1");
		System.out.println();
	}
	
	@Test
	public void testMethod2() {
		System.out.println("test2");
	}
	
	@After
	public void afterMethod(){
		System.out.println("after");
	}
}