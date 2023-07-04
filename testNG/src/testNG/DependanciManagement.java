package testNG;

import org.testng.annotations.Test;

public class DependanciManagement {
	@Test()
	public void highschool(){
		System.out.println("High school");
	}
	@Test(dependsOnMethods = "highschool" )
	public void higrschool(){
		System.out.println("higr school");
	}
	@Test(dependsOnMethods = "highschool")
	public void College(){
		System.out.println("college school");
	}

}
