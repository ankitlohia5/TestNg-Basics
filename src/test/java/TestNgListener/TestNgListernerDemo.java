package TestNgListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNgListener.ListenerTest.class)
public class TestNgListernerDemo{

	@Test     
	public void test1() {
		System.out.println("Test1 Success ****");
	}
	
	@Test()  
	public void test2() {
		System.out.println("Test2 Success *****");
	}

	
	@Test
	public void test3() {
		System.out.println("Test3 Success *****");
		Assert.assertTrue(false);
	}
	}

