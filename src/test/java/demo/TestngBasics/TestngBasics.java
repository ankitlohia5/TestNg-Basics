package demo.TestngBasics;

import org.testng.annotations.Test;

public class TestngBasics {

	
	@Test
	//@Test(enabled=false)     
	public void test1() {
		System.out.println("Test1 Success");
	}
	
	@Test()  
	public void test2() {
		System.out.println("Test2 Success");
	}

	
	@Test
	public void trt3() {
		System.out.println("Test3 Success");
	}

	
	
	@Test
	public void test4() {
		System.out.println("Test4 Success");
	}


}
