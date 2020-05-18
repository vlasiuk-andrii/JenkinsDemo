package my.company;


import static org.testng.Assert.assertEquals;

import logic.Calculator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @BeforeMethod
  public void beforeMethod(){
    System.out.println("Before method");
  }

  @Test
  public void test1Sum() {
    assertEquals(calculator.sum(1,2), 3);
  }

  @Test
  public void test2Sum() {
    assertEquals(calculator.sum(0,345), 345);
  }

  @Test(priority = 0)
  public void test3Sum() {
    assertEquals(calculator.sum(-5,99), 94);
  }

  @Test(priority = 0)
  public void testMultiplyTwoPositiveValues() {
    assertEquals(calculator.multiply(3,4), 12);
  }

  @Test()
  public void testMultiplyZeroValue() {
    assertEquals(calculator.multiply(0,7), 5);
  }

  @Test(timeOut = 30, dependsOnMethods = {"testMultiplyTwoPositiveValues", "testMultiplyZeroValue"})
  public void test4() {
    try {
      Thread.sleep(40);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test6Sum() {
    int r = 11/0;
  }

}