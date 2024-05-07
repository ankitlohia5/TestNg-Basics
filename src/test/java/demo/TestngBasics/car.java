package demo.TestngBasics;

import org.testng.annotations.Test;

public class car {

	
	
	//@Test(enabled=false)
	@Test(groups= {"SmokeTest"})  
	public void carSpeed() {
		System.out.println("Car Speed Smoke test success");
	}
	
	@Test(groups= {"RegressionTest","SmokeTest"}) 
	public void carFuel() {
		System.out.println("Car Fuel Regression success");
	}
	
	
	@Test
	public void carWindow() {
		System.out.println("Car Window success");
	}
	
	@Test
	public void mobile() {
		System.out.println("Mobile success");
	}

}
