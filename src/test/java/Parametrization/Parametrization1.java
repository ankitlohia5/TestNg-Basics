package Parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization1 {

	public class Fruits {
		@Test
		@Parameters("m")
		public void mango(String m) {
			System.out.println("Fruits names are:  ");
			System.out.println(m);
		}

		@Test
		@Parameters("o")
		public void orange(String o) {
			System.out.println(o);
		}
	}
}
