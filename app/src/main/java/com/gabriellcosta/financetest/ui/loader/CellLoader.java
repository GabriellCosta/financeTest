package com.gabriellcosta.financetest.ui.loader;


import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.gabriellcosta.financetest.cell.CellViewFactory;
import com.gabriellcosta.financetest.entity.CellVO;
import com.gabriellcosta.financetest.service.FileSystemService;
import java.util.List;

public final class CellLoader extends AsyncTaskLoader<View> {

  private View cache;

  public CellLoader(Context context) {
    super(context);
  }

  @Override
  protected void onStartLoading() {
    super.onStartLoading();
    if (cache != null) {
      deliverResult(cache);
    } else {
      forceLoad();
    }
  }

  @Override
  public View loadInBackground() {

    final ViewGroup container = createContainerView();

    List<CellVO> cellVOs = new FileSystemService(getContext()).fetchCell();

    CellViewFactory cellViewFactory = new CellViewFactory(getContext());

    for (CellVO item : cellVOs) {
      View view = cellViewFactory.create(item);
      container.addView(view);
    }

    return container;
  }

  @Override
  public void deliverResult(View data) {
    cache = data;
    super.deliverResult(data);
  }

  private ViewGroup createContainerView() {
    LinearLayout linearLayout = new LinearLayout(getContext());
    linearLayout.setOrientation(LinearLayout.VERTICAL);

    return linearLayout;
  }
}
