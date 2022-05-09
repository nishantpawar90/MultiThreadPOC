package module1;

import org.testng.annotations.Test;

import base.BaseClass;

public class Module1Class1 extends BaseClass {

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Module1 Class1 "+ Thread.currentThread().getName());

	}

}
