package com.gabriellcosta.financetest.entity;


import com.google.gson.annotations.SerializedName;

public final class DownInfo {

  @SerializedName("name") private final String name;
  @SerializedName("data") private final String date;

  public DownInfo(String name, String date) {
    this.name = name;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public String getDate() {
    return date;
  }
}
