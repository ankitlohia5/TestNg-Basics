package Parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider = "loginfunctionality")
	public void myTest(String username, String password) {
		//driver.findelementby.id("username").senkeys(username);
		//driver.findelementby.id("password").senkeys(password);
		System.out.println("Username Is : " + username);
		System.out.println("Password Is : " + password);
		
	}

//	@DataProvider(name = "data-provider")
//	public Object[][] dpMethod() {
//		return new Object[][] { { "First,Value, test, test1" }, { "Second-Value" }, { "Third-Value" }, { "Fourth-Value" } };
//
//	}
	
	@DataProvider(name = "loginfunctionality")
	public Object[][] credentials() {
		return new Object[][] {
			
			{"user1","password1"},
			{"user2", "password2"}
				
				
			};
			
		}
	
	}
	
	//Real Time Examples
	// Username, PW-  Login functionality 
	//

