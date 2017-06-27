package com.gabriellcosta.financetest.cell;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import android.support.design.widget.TextInputLayout;
import android.support.test.InstrumentationRegistry;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.gabriellcosta.financetest.entity.CellVO;
import com.gabriellcosta.financetest.util.ReaderUtil;
import org.junit.Before;
import org.junit.Test;

public class CellViewFactoryTest {

  private CellViewFactory factory;

  @Before public void setup() {
    factory = new CellViewFactory(InstrumentationRegistry.getTargetContext());
  }

  @Test(expected = IllegalArgumentException.class)
  public void whenCreate_ShouldNotReturnNull() {
    assertNotNull(factory.create(null));
  }

  @Test public void whenCreateWithType1_ShouldCreateTextInputLayout() {
    CellVO read = ReaderUtil.read("cell_field.json", CellVO.class);
    View view = factory.create(read);
    assertTrue(view instanceof TextInputLayout);
  }

  @Test public void whenCreateWithType2_ShouldCreateTextView() {
    CellVO read = ReaderUtil.read("cell_text.json", CellVO.class);
    View view = factory.create(read);
    assertTrue(view instanceof TextView);
  }

  @Test public void whenCreateWithType3_ShouldCreateImage() {
    CellVO read = ReaderUtil.read("cell_image.json", CellVO.class);
    View view = factory.create(read);
    assertTrue(view instanceof ImageView);
  }

  @Test public void whenCreateWithType4_ShouldCreateCheckbox() {
    CellVO read = ReaderUtil.read("cell_checkbox.json", CellVO.class);
    View view = factory.create(read);
    assertTrue(view instanceof CheckBox);
  }

  @Test public void whenCreateWithType5_ShouldCreateButton() {
    CellVO read = ReaderUtil.read("cell_send.json", CellVO.class);
    View view = factory.create(read);
    assertTrue(view instanceof Button);
  }

}