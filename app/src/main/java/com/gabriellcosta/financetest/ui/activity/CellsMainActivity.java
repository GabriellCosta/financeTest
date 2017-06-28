package com.gabriellcosta.financetest.ui.activity;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import com.gabriellcosta.financetest.R;
import com.gabriellcosta.financetest.ui.loader.CellLoader;

public class CellsMainActivity extends AppCompatActivity implements LoaderCallbacks<View> {

  private static final int LOADER_CALLBACK = 3;
  private ScrollView scrollView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_cells_main);

    scrollView = (ScrollView) findViewById(R.id.scroll_cells);

    final LoaderManager loaderManager = getSupportLoaderManager();
    Loader<View> loader = loaderManager.getLoader(LOADER_CALLBACK);

    if (loader == null) {
      loaderManager.initLoader(LOADER_CALLBACK, null, this);
    } else {
      loaderManager.restartLoader(LOADER_CALLBACK, null, this);
    }

  }


  @Override
  public Loader<View> onCreateLoader(int id, Bundle args) {
    return new CellLoader(this);
  }

  @Override
  public void onLoadFinished(Loader<View> loader, View data) {
    scrollView.addView(data);
  }

  @Override
  public void onLoaderReset(Loader<View> loader) {

  }

}
