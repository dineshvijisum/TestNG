package testNG;

import org.testng.annotations.Test;

public class Groupings1 {
	@Test(groups = {"lenovo"})
	public void lenovo() {
		System.out.println("lenovo");
		
	}
	@Test(groups = {"lenovo"})
public void lenovo1() {
		System.out.println("lenovo1");
		
	}
	@Test(groups = {"moto"})
public void moto() {
		System.out.println("moto");
	
}
	@Test(groups = {"moto"})
public void moto1() {
		System.out.println("moto1");
	
}
	@Test(groups = {"vivo"})
public void vivo() {
		System.out.println("vivo");
	
}
	@Test(groups = {"vivo"})
public void vivo1() {
		System.out.println("vivo1");
	
}

}
