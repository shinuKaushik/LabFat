package Labfat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void testlogin1() {
		App myapp = new App();
		Assert.assertEquals(0,myapp.userLogin("bbc","abc@123"));
	}
	
	@Test
	public void testlogin2() {
		App myapp = new App();
		Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
	}
}
