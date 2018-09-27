package testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntegrateTest {
  

	@BeforeTest
	public void initSetup() {
		System.out.println("Test Case execution started");
	}
	
	@Test
	public void getDetails() {
		String text = "New";
		int value = 10;
		System.out.println("String value is "+text);
		System.out.println("Integer value is "+value);
	}
	
	@AfterTest
	public void exitSetup() {
		System.out.println("Test Case execution completed");
	}
	
}
