package com.gabriellcosta.financetest.cell;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.matcher.ViewMatchers.Visibility;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.gabriellcosta.financetest.entity.CellVO;
import com.gabriellcosta.financetest.util.ReaderUtil;
import org.junit.Before;
import org.junit.Test;

public class CellViewParserTest {

  private Context context;

  @Before public void setup() {
    context = InstrumentationRegistry.getContext();
  }

  @Test public void whenCreateTextView_ShouldBeValid() {
    CellVO read = ReaderUtil.read("cell_text.json", CellVO.class);
    TextView parse = CellViewParser.parse(new TextView(context), read);
    assertEquals("Olá, primeiro se apresente com o seu nome:", parse.getText());
    assertEquals(Visibility.VISIBLE.getValue(), parse.getVisibility());
  }

  @Test public void whenCreateCheckbox_ShouldBeValid() {
    CellVO read = ReaderUtil.read("cell_checkbox.json", CellVO.class);
    CheckBox parse = CellViewParser.parse(new CheckBox(context), read);
    assertEquals("Gostaria de cadastrar meu email", parse.getText());
    assertEquals(Visibility.VISIBLE.getValue(), parse.getVisibility());
  }

  @Test public void whenCreateImageview_ShouldBeValid() {
    CellVO read = ReaderUtil.read("cell_image.json", CellVO.class);
    ImageView parse = CellViewParser.parse(new ImageView(context), read);
    assertEquals("http://kitten-picture", parse.getContentDescription());
    assertEquals(Visibility.VISIBLE.getValue(), parse.getVisibility());
  }

  @Test public void whenCreateButton_ShouldBeValid() {
    CellVO read = ReaderUtil.read("cell_send.json", CellVO.class);
    Button parse = CellViewParser.parse(new Button(context), read);
    assertEquals("Enviar", parse.getText());
    assertEquals(Visibility.VISIBLE.getValue(), parse.getVisibility());
  }

}