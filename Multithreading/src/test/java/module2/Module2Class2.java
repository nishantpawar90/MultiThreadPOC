package module2;

import org.testng.annotations.Test;
import base.BaseClass;

public class Module2Class2 extends BaseClass {

	@Test
	public void test12() throws InterruptedException {
		System.out.println("Module2 Class2 "+ Thread.currentThread().getName());

	}

}
