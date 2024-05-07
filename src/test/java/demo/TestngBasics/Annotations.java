package demo.TestngBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@Test
	public void testTC1() {
		System.out.println("TC1");
	}
	
	@Test(groups= {"SmokeTest"}) 
	//@Test
	public void testTC2() {
		System.out.println("TC2");
	}
	
	@BeforeTest
	public void testA1() {
		System.out.println("A1");
	}
	
	@AfterTest
	public void testA2() {
		System.out.println("A2");
	}
	
	@BeforeClass
	public void testBefore() {
		System.out.println("BEFORE");
	}
	
	
	@AfterClass
	public void testTeardown() {
		System.out.println("Teardown");
	}
	
	@BeforeSuite
	public void testBS() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void testAS() {
		System.out.println("After Suite");
	}
	
	@BeforeGroups(groups= {"SmokeTest"}) 
	public void testBG() {
		System.out.println("Before GROUP");
	}
	
	@AfterGroups(groups= {"SmokeTest"}) 
	public void testAG() {
		System.out.println("After GROUP");
	}
	
}
