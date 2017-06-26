package com.gabriellcosta.financetest.cell;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.gabriellcosta.financetest.entity.CellVO;
import java.lang.ref.WeakReference;

public final class CellViewFactory {

  private final WeakReference<Context> context;

  public CellViewFactory(final Context context) {
    this.context = new WeakReference<>(context);
  }

  @NonNull public View create(final CellVO cellVO) {
    return new View(context.get());
  }

}
