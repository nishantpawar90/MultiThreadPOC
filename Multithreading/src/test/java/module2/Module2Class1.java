package module2;

import org.testng.annotations.Test;

import base.BaseClass;

public class Module2Class1 extends BaseClass {

	@Test
	public void test11() throws InterruptedException {
		System.out.println("Module2 Class1 "+ Thread.currentThread().getName());
	}

}
