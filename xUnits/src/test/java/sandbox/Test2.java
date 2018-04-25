package sandbox;

import org.testng.annotations.Test;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class Test2 {
    
	@Test(groups = "negative")
	public void test2Num1() {
        System.out.println("Test2Num1 - negative");
	}

	@Test(groups = "positive")
    public void test2Num2() {
        System.out.println("Test2Num2 - positive");
    }
}
