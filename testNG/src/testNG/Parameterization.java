package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterization {
	@Test
	@Parameters("Name")
	//@Parameters("Name1")
	public void printName(String Name) {
		/* String[] one = null; */
		System.out.println(Name);
		/* System.out.println("Name1 is    "+ two); */
		
	}

}
