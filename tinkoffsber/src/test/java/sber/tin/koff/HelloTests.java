package sber.tin.koff;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloTests {

  @Test
  public void testHello() {
    Hello hi = new Hello("Hello, word!");
    Assert.assertEquals(hi.hello, "Hello, word");
  }
}
