package jvm;

import org.junit.Test;

public class JVMStackTest {

	@Test
	//jdk1.6 depp of stack is 11381
	//jdk1.8 depp of stack is 5852
	public void testJVMStack() {
		JVMStack jvmStack = new JVMStack();
		jvmStack.recursion();
	}

}
