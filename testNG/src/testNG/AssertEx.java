package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
	String name="Dinesh";
	boolean value=false;
	
	@Test
	public void checkEqual() {
		Assert.assertEquals(name, "Dinesh");
		Assert.assertTrue(value, "not true");
	}

}
