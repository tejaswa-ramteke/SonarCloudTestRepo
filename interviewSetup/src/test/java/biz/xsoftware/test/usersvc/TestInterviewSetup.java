package biz.xsoftware.test.usersvc;

import com.tray.MyLib;
import junit.framework.TestCase;

public class TestInterviewSetup extends TestCase {

	public TestInterviewSetup(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		System.out.println("JUnit setup is running before each test");
	}

	@Override
	protected void tearDown() throws Exception {
	}
	
	public void testSimple() {
		MyLib lib = new MyLib();
		lib.printTest1();
	}

}
