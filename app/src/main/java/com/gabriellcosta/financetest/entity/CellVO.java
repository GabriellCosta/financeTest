package com.gabriellcosta.financetest.entity;

import com.google.gson.annotations.SerializedName;

public final class CellVO {

  public static final int TYPE_FIELD = 1;
  public static final int TYPE_TEXT = 2;
  public static final int TYPE_IMAGE = 3;
  public static final int TYPE_CHECKBOX = 4;
  public static final int TYPE_SEND = 5;

  public static final int TYPEFIELD_TEXT = 1;
  public static final int TYPEFIELD_TEL_NUMBER = 2;
  public static final int TYPEFIELD_EMAIL = 3;

  @SerializedName("id") private final int id;
  @SerializedName("type") private final int type;
  @SerializedName("message") private final String message;
  @SerializedName("typefield") private final Object typefield;
  @SerializedName("hidden") private final boolean hidden;
  @SerializedName("topSpacing") private final double topSpacing;
  @SerializedName("show") private final Integer show;
  @SerializedName("required") private final boolean required;

  private CellVO(int id, int type, String message, Object typefield, boolean hidden,
      double topSpacing,
      Integer show, boolean required) {
    this.id = id;
    this.type = type;
    this.message = message;
    this.typefield = typefield;
    this.hidden = hidden;
    this.topSpacing = topSpacing;
    this.show = show;
    this.required = required;
  }

  public int getId() {
    return id;
  }

  public int getType() {
    return type;
  }

  public String getMessage() {
    return message;
  }

  public Object getTypefield() {
    return typefield;
  }

  public boolean isHidden() {
    return hidden;
  }

  public double getTopSpacing() {
    return topSpacing;
  }

  public Integer getShow() {
    return show;
  }

  public boolean isRequired() {
    return required;
  }
}
