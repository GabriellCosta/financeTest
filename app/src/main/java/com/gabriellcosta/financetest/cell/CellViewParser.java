package com.gabriellcosta.financetest.cell;


import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.gabriellcosta.financetest.entity.CellVO;
import com.squareup.picasso.Picasso;

final class CellViewParser {

  private CellViewParser() {
  }

  static TextInputLayout parse(final TextInputLayout view, final CellVO cellVO) {
    TextInputEditText child = new TextInputEditText(view.getContext());
    view.addView(child);
    child.setHint(cellVO.getMessage());
    view.setVisibility(cellVO.isHidden() ? View.GONE : View.VISIBLE);
    view.setPadding(0, convertToDP(view.getContext(), cellVO.getTopSpacing()), 0, 0);
    return view;
  }

  static TextView parse(final TextView view, final CellVO cellVO) {
    view.setText(cellVO.getMessage());
    view.setVisibility(cellVO.isHidden() ? View.GONE : View.VISIBLE);
    view.setPadding(0, convertToDP(view.getContext(), cellVO.getTopSpacing()), 0, 0);
    return view;
  }

  static ImageView parse(final ImageView view, final CellVO cellVO) {
    view.setContentDescription(cellVO.getMessage());
    view.setVisibility(cellVO.isHidden() ? View.GONE : View.VISIBLE);
    view.setPadding(0, convertToDP(view.getContext(), cellVO.getTopSpacing()), 0, 0);

    Picasso.with(view.getContext())
        .load(cellVO.getMessage());

    return view;
  }

  static CheckBox parse(final CheckBox view, final CellVO cellVO) {
    view.setText(cellVO.getMessage());
    view.setVisibility(cellVO.isHidden() ? View.GONE : View.VISIBLE);
    view.setPadding(0, convertToDP(view.getContext(), cellVO.getTopSpacing()), 0, 0);
    return view;
  }

  static Button parse(final Button view, final CellVO cellVO) {
    view.setText(cellVO.getMessage());
    view.setVisibility(cellVO.isHidden() ? View.GONE : View.VISIBLE);
    view.setPadding(0, convertToDP(view.getContext(), cellVO.getTopSpacing()), 0, 0);
    return view;
  }

  private static int convertToDP(final Context context, final double value) {
    return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, (float) value,
        context.getResources().getDisplayMetrics());
  }

}
