package part1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    // DataProvider method
    @DataProvider(name = "testData")
    public Object[][] getData() {
        return new Object[][] {
                { "input1", 10 },
                { "input2", 20 },
                { "input3", 30 }
        };
    }

    // Test method that uses DataProvider
    @Test(dataProvider = "testData")
    public void testMethod(String input, int value) {
        System.out.println("Input: " + input + ", Value: " + value);
        // Add your test logic here
    }
}
