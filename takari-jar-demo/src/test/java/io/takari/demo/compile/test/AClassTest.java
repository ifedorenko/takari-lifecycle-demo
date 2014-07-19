package io.takari.demo.compile.test;

import io.takari.demo.compile.AClass;

import org.junit.Assert;
import org.junit.Test;

public class AClassTest {

  @Test
  public void constructor() {
    Assert.assertNotNull(new AClass());
  }
}
