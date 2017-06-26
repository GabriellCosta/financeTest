package com.gabriellcosta.financetest.cell;

import static org.junit.Assert.assertNotNull;

import android.support.test.InstrumentationRegistry;
import org.junit.Before;
import org.junit.Test;

public class CellViewFactoryTest {

  private CellViewFactory factory;

  @Before public void setup() {
    factory = new CellViewFactory(InstrumentationRegistry.getTargetContext());
  }

  @Test public void whenCreate_ShouldNotReturnNull() {
    assertNotNull(factory.create(null));
  }

}