package sandbox;

import org.testng.annotations.Test;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class Test1{
    
	@Test(groups = "negative")
	public void test1Num1() {
        System.out.println("Test1Num1 - negative");
	}


    @Test(groups = "positive")
    public void test1Num2() {
        System.out.println("Test1Num2 - positive");
    }

}
