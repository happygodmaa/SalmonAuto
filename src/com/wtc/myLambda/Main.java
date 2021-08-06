package com.wtc.myLambda;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Main {

  @Test
  public void m2() {
    Test1 t = new Test1();
    int result = t.add(2, 3);
    Assert.assertEquals(5, result);
  }
}
