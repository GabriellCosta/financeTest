package com.gabriellcosta.financetest.cell;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.gabriellcosta.financetest.R;
import com.gabriellcosta.financetest.entity.CellVO;
import java.lang.ref.WeakReference;

public final class CellViewFactory {

  private final WeakReference<Context> context;

  public CellViewFactory(final Context context) {
    this.context = new WeakReference<>(context);
  }

  @NonNull
  public View create(final CellVO cellVO) {

    if (cellVO == null) {
      throw new IllegalArgumentException(
          String.format("%s should not be null", CellVO.class.getSimpleName()));
    }

    switch (cellVO.getType()) {
      case CellVO.TYPE_FIELD:
        context.get().setTheme(R.style.AppTheme);
        return new TextInputLayout(context.get());
      case CellVO.TYPE_TEXT:
        return new TextView(context.get());
      case CellVO.TYPE_IMAGE:
        return new ImageView(context.get());
      case CellVO.TYPE_CHECKBOX:
        return new CheckBox(context.get());
      case CellVO.TYPE_SEND:
        return new Button(context.get());
      default:
        return new View(context.get());
    }

  }

}
