package Parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {

	public class Sum {
		@Test
		@Parameters({ "a", "b" })
		public void add(int c, int d) {
			int sum = c + d; // 7 + 7
			System.out.println("Sum of two numbers : " + sum);
		}
	}
}
