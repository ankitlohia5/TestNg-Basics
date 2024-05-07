package demo.TestngBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAttributes {

	//@Test(description="TC1")  
	@Test()
	public void testcase1() {
		System.out.println("This is testcase1- Payment Functionality");
	}
	
	
	@Test()  
	public void testcase2() {
		System.out.println("This is testcase2- Login Functionality");
		//Assert.fail();
	}
	
	
	@Test(dependsOnMethods={"testcase2","testcase1"})  
	public void Login() {
		System.out.println("Login Success");
	}
}
