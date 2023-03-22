package maven_pack.maven01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {
	@BeforeSuite
	private void bsuite() {
		System.out.println("bsuite");

	}

	@BeforeTest
	private void btest() {
		System.out.println("btest");

	}

	@BeforeClass
	private void bclass() {
		System.out.println("bclass");

	}

	@BeforeMethod
	private void bmethod() {
		System.out.println("bmethod");

	}

	@Test(priority=4,dataProvider = "My data provider")
	private void test21(String name, int rollno ) {
		 
		System.out.println("my name is"+ name,);
	}

	@Test(invocationCount = 3)
	private void test2() {
		System.out.println("test2");
	}

	@Test
	@Parameters("value")
	private void test3(String value) {
		System.out.println("test3"+value);
	}

	@Test(enabled = false)
	private void test4() {
		System.out.println("test4");
	}

	@Test@Ignore
	private void test5() {
		System.out.println("test5");
	}

	@AfterMethod
	private void amethod() {
		System.out.println("amethod");

	}

	@AfterClass
	private void aclass() {
		System.out.println("aclass");

	}

	@AfterTest
	private void atest() {
		System.out.println("atest");

	}

	@AfterSuite
	private void asuite() {
		System.out.println("asuite");

	}

}
